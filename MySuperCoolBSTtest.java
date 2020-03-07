
public class MySuperCoolBSTtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySuperCoolBST<Integer> t = new MySuperCoolBST<Integer>();
		t.insert(new Integer(117));
		t.insert(new Integer(108));
		t.insert(new Integer(54));
		t.insert(new Integer(107));
		t.insert(new Integer(109));
		t.insert(new Integer(106));
		t.insert(new Integer(99));
		t.insert(new Integer(120));
		t.insert(new Integer(116));
		t.insert(new Integer(139));
		t.insert(new Integer(119));
		t.insert(new Integer(131));
		t.insert(new Integer(153));
		t.insert(new Integer(172));
		t.insert(new Integer(140));
		t.insert(new Integer(176));
		System.out.println("Full BST in order: ");
		t.inOrder();
		System.out.println();
		System.out.println("Full BST post order: ");
		t.postOrder();
		System.out.println();
		System.out.println("Full BST pre order: ");
		t.preOrder();
		System.out.println();
		t.delete(99);
		System.out.println("99 is deleted, updated BST in order: ");
		t.inOrder();
		System.out.println();
		System.out.println("99 is deleted, updated BST post order: ");
		t.postOrder();
		System.out.println();
		System.out.println("99 is deleted, updated BST pre order: ");
		t.preOrder();
		System.out.println();
		t.delete(153);
		System.out.println("99 and 153 are deleted, updated BST in order: ");
		t.inOrder();
		System.out.println();
		System.out.println("99 and 153 are deleted, updated BST post order: ");
		t.postOrder();
		System.out.println();
		System.out.println("99 and 153 are deleted, updated BST pre order: ");
		t.preOrder();
		System.out.println();
		t.delete(108);
		System.out.println("99, 153, and 108 are deleted, updated BST in order: ");
		t.inOrder();
		System.out.println();
		System.out.println("99, 153, and 108 are deleted, updated BST post order: ");
		t.postOrder();
		System.out.println();
		System.out.println("99, 153, and 108 are deleted, updated BST pre order: ");
		t.preOrder();
		System.out.println();
		
	}

}
