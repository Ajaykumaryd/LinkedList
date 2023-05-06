package LinkedList;

public class q7deleteNode {
    
	int data;
	q7deleteNode next;
	
	q7deleteNode(int data){
	this.data=data;
	next=null;	
	}
	
	public static q7deleteNode delete(q7deleteNode head,int pos){
	
		if(head==null){
			return head;
		}
		else if(pos==0){
			head=head.next;
		}
		else {
		q7deleteNode temp=head;
		int i=0;
		while(temp!=null && i<pos-1){
			temp=temp.next;
			i++;
		}
		if(temp==null || temp.next==null){
			return head;
		}
		temp.next=temp.next.next;
		}
		return head;				
		}
	
	public static void print(q7deleteNode head){
		
	while(head!=null){
		System.out.print(head.data+" ");
		head=head.next;
	}		
	}
	public static void main(String[] args) {
	q7deleteNode n1=new q7deleteNode(1);
	q7deleteNode n2=new q7deleteNode(2);
	q7deleteNode n3=new q7deleteNode(7);
	q7deleteNode n4=new q7deleteNode(6);
	q7deleteNode n5=new q7deleteNode(5);
	 q7deleteNode head=n1;
		n1.next=n2;
	    n2.next=n3;
	    n3.next=n4;
	    n4.next=n5;
	head=delete(head,3);
	print(head);
	}
}
