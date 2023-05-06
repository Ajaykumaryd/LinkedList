package LinkedList;

public class q2nodeuse {

	public static void print(q2node<Integer>head){
		 while(head!=null){
			    System.out.print(head.data+ " ");
			    head=head.next;    
		 }
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q2node<Integer> node1=new q2node<>(10);
	    q2node<Integer> node2=new q2node<>(20);
	    q2node<Integer> node3=new q2node<>(30);
	    q2node<Integer>head=node1;
	    node1.next=node2;
	    node2.next=node3;
	    
//	    while(head!=null){
//	    System.out.print(head.data+ " ");
//	    head=head.next;    
//		}
//	    
	    print(head);
	  //  print(head);
	    
	}

}
