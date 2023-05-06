package LinkedList;

public class q3printIthNode {
    
	int data;
	q3printIthNode next;	
	q3printIthNode(int data){
	this.data=data;
	next=null;
	}
	
	public static void printNth(q3printIthNode head,int i){
	int count=0;
	q3printIthNode temp=head;
	while(temp!=null&&count!=i) {
		count++;
		temp=temp.next;
	}
	
	if (count == i && temp != null)
		System.out.println(temp.data);		
	}
	

	public static void main(String[] args) {
		
		
    q3printIthNode n1=new q3printIthNode(10);
    q3printIthNode n2=new q3printIthNode(20);
    q3printIthNode n3=new q3printIthNode(30);
    q3printIthNode n4=new q3printIthNode(40);
    q3printIthNode head=n1;
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    printNth(head,3);
    
	}	
}
