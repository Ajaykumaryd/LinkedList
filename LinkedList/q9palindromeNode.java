package LinkedList;
import java.util.*;
public class q9palindromeNode {
    
	int data;
	q9palindromeNode next;
	q9palindromeNode(int data){
	this.data=data;
	next=null;
	}
	
	public static boolean palindrome(q9palindromeNode head){
	
	ArrayList list=new ArrayList();	
	q9palindromeNode temp=head;
	while(temp!=null){
	list.add(temp.data);	
	temp=temp.next;	
	}	//9 2 3 3 2 9
	int s=0;
	int e=list.size()-1;
	while(s<e){
		if (list.get(s)!=list.get(e)) {	
		return false;
	}	
		else {
			s++;
			e--;
		}}	
	return true;
	}
	public static void print(q9palindromeNode head) {
		
		while(head!=null){
			System.out.print(head.data+ " ");
			head=head.next;
		}}
	public static void main(String[] args) {
	
	q9palindromeNode n1=new q9palindromeNode(9);
	q9palindromeNode n2=new q9palindromeNode(2);
	q9palindromeNode n3=new q9palindromeNode(3);
	q9palindromeNode n4=new q9palindromeNode(3);
	q9palindromeNode n5=new q9palindromeNode(2);
	q9palindromeNode n6=new q9palindromeNode(9);
	
	q9palindromeNode head=n1;
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=n6;	
    System.out.println(palindrome(head));	   
	}
}
