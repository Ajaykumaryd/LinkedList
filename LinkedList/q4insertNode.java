package LinkedList;

public class q4insertNode {

	int data;
	q4insertNode next;
	
	q4insertNode(int data){
		this.data=data;
		next=null;
	}
	
	public static q4insertNode insert(q4insertNode head,int pos,int data) {
	
	q4insertNode newNode=new q4insertNode(data);	
	if(pos==0){	
	newNode.next=head;
	return newNode;
	}
	int i=0;
	q4insertNode temp=head;
	while(i<pos-1){
	temp=temp.next;
	i++;	
	}
	newNode.next=temp.next;
	temp.next=newNode;
	return head;
	}
	
	public static void print(q4insertNode head) {
	while(head!=null) {
	System.out.print(head.data+ " ");
	head=head.next;
	}		
	}
	public static void main(String[] args) {
		
    q4insertNode n1=new q4insertNode(10);
    q4insertNode n2=new q4insertNode(20);
    q4insertNode n3=new q4insertNode(30);
    q4insertNode n4=new q4insertNode(40);
    q4insertNode head=n1; 
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;   
    head=insert(head,3,50);
    print(head);
//    q4insertNode head1=new q4insertNode(1);     
	}

}
