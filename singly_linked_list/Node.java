/*
 * @author Anthony Garzon
 */
package singly_linked_list;

public class Node {
	
	public int data;
	public Node next;
	
	public Node (int d){
		data = d;
	}//Node constructor that sets data only
	
	public Node (int d, Node n){
		data = d;
		next = n;
	}//Node constructor that sets data and pointer next
	
	public int getData() {return data;}//getData method
	public Node getNext() {return next;}//getNext method
	public void setNext(Node n) {next = n;}//setNext method
	
}
