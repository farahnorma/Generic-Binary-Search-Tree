import java.util.*;
	public class MySuperCoolBST<T extends Comparable<T>> implements Iterable<T>{
		   private Node<T> root;
		   private Comparator<T> comparator;

		   public MySuperCoolBST()
		   {
		      root = null;
		      comparator = null;
		   }

		   public MySuperCoolBST(Comparator<T> comp)
		   {  root = null;
		      comparator = comp;}

		   private int compare(T a, T b)
		   {if(comparator == null) return a.compareTo(b);
		      else
		      return comparator.compare(a,b);}
		   
		  
		   public void insert(T data)
		   { root = insert(root, data); }
		   
		   protected Node<T> insert(Node<T> item, T toInsert)
		   {
		      if (item == null)
		         return new Node<T>(toInsert);
		      if (compare(toInsert, item.data) == 0)
		      	return item;
		      if (compare(toInsert, item.data) < 0)
		         item.left = insert(item.left, toInsert);
		      else
		         item.right = insert(item.right, toInsert);
		      return item;
		   }
		   public void delete(T del)
		   {
		      root = delete(root, del);
		   }
		   private Node<T> delete(Node<T> item, T del)
		   {
		      if (item == null)  throw new RuntimeException("There's nothing here!");
		      else
		      if (compare(del, item.data) < 0)
		      item.left = delete (item.left, del);
		      else
		      if (compare(del, item.data)  > 0)
		      item.right = delete (item.right, del);
		      else
		      {
		         if (item.left == null) return item.right;
		         else
		         if (item.right == null) return item.left;
		         else
		         {item.data = find(item.left);
		          item.left =  delete(item.left, item.data) ;
		         }
		      }
		      return item;
		   }
		   private T find(Node<T> item)
		   {
		      while (item.right != null) item = item.right;

		      return item.data;
		   }
		   public String toString()
		   {
		      StringBuffer sb = new StringBuffer();
		      for(T data : this) sb.append(data.toString());

		      return sb.toString();
		   }
		   public void preOrder()
		   {
		      preOrderFunction(root);
		   }
		   private void preOrderFunction(Node r)
		   {
		      if (r != null)
		      {
		         System.out.print(r+" ");
		         preOrderFunction(r.left);
		         preOrderFunction(r.right);
		      }
		   }

		   public void inOrder()
		   {
		      inOrderFunction(root);
		   }
		   private void inOrderFunction(Node r)
		   {
		      if (r != null)
		      {
		         inOrderFunction(r.left);
		         System.out.print(r+" ");
		         inOrderFunction(r.right);
		      }
		   }
		   public void postOrder() {
				postOrderFunction(root);
			}
			
			protected void postOrderFunction(Node r) {
				if(r == null) {
					return;
				}
				postOrderFunction(r.left);
				postOrderFunction(r.right);
				System.out.print(r + " ");
				
			}
		   private class Node<T>
		   {
		      private T data;
		      private Node<T> left, right;

		      public Node(T data, Node<T> l, Node<T> r)
		      {
		         left = l; right = r;
		         this.data = data;
		      }

		      public Node(T data)
		      {
		         this(data, null, null);
		      }

		      public String toString()
		      {
		         return data.toString();
		      }
		   } 
		@Override
		 public Iterator<T> iterator()
		   {
		      return new It();
		   }
		   
		   private class It implements Iterator<T>
		   {
		      Stack<Node<T>> s = new Stack<Node<T>>();
		      public It()
		      {
		         if(root != null) s.push(root);
		      }
		      public boolean hasNext()
		      {
		         return !s.isEmpty();
		      }
		      public T next()
		      {
		         Node<T> c = s.peek();
		         if(c.left != null)
		         {
		            s.push(c.left);
		         }
		         else
		         {
		            Node<T> t = s.pop();
		            while( t.right == null )
		            {
		               if(s.isEmpty()) return c.data;
		               t = s.pop();
		            }
		            s.push(t.right);
		         }
		         return c.data;
		      }}}