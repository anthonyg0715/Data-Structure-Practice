/*
 * @author Anthony Garzon
 * */
package singly_linked_list;

public class Main {

	public static void main(String[] args) {
		// Testing linked list class
		LinkedList ll = new LinkedList(0);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.printList();
		ll.remove(3);
		ll.printList();
		ll.find(1);
		ll.printList();
	}

}
