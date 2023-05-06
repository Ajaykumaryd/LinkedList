package LinkedList;

public class q8removeduplicateNode {
    
	int data;
	q8removeduplicateNode next;
	q8removeduplicateNode(int data){
	this.data=data;
	next=null;	
	}
	
	public static q8removeduplicateNode removeduplicates(q8removeduplicateNode head) {
	
	if(head==null) {
		return head;
	}
	if(head.next==null) {
		return head;
	}
	q8removeduplicateNode t1=head,t2=head.next;
	q8removeduplicateNode finalhead=head;
	while(t2!=null){
	if(t1.data==t2.data){	
     t2=t2.next;
	}
	else{
		t1.next=t2;
		t1=t2;
	}
	}
	t1.next=null;
	return finalhead;
	}
	public static void print(q8removeduplicateNode head) {
	
	while(head!=null){
		System.out.print(head.data+ " ");
		head=head.next;
	}				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    q8removeduplicateNode n1=new q8removeduplicateNode(1);
    q8removeduplicateNode n2=new q8removeduplicateNode(2);
    q8removeduplicateNode n3=new q8removeduplicateNode(2);
    q8removeduplicateNode n4=new q8removeduplicateNode(2);
    q8removeduplicateNode n5=new q8removeduplicateNode(2);
    //Node n6=new Node(2);
 //   Node n7=new Node(3);
    
    q8removeduplicateNode head=n1;
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n5;
  //  n5.next=n6;
  //  n6.next=n7;
    
    head=removeduplicates(head);
    print(head);    
	}

}
