/*
 * @author Anthony Garzon
 * 
 */
package singly_linked_list;

public class LinkedList {
	private Node head;
	
	public LinkedList(Node n){
		head=n;
	}
	
	public LinkedList (int o) {
		head = new Node(o);
	   
	}//Constructor that creates a new Node as the head node
	
	public void add(int o){
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(new Node(o));
	}//simple add method that just adds to the list 
	
	public boolean remove(int o){
		if(o == head.getData()){
			head = head.getNext();
			return true;
		}//case 1: removing first node
		else{
			Node current = head;
			Node previous = head;
			while(current!=null){
				if(current.getData() == o){
					previous.setNext(current.getNext());//case 2: deleting at middle or end 
				    return true;
				}else{
					previous = current;
					current = current.getNext();
				}
			}
		}
		return false;
	}//remove method that checks all cases beginning and middle or end
	
	public Node find(int x){
		Node current = head;
		while (current!=null){
			if(current.getData()==x){
				break;
			} else if (current.getData()>x){
				current = null;
				continue;
			}
			current = current.getNext();
		}
		return current;
	}//finding a node at a certain index x 
	
	public void printList() {
		Node current = head;
		while(current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
	}//simple print method for returning the data in the list

	
}
