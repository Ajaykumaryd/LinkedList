package LinkedList;

public class q1NodeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    q1Node<Integer> node1=new q1Node<>(10);
    q1Node<Integer> node2=new q1Node<>(20);
    q1Node<Integer> node3=new q1Node<>(30);
    
//    System.out.println(node1.data);
//    System.out.println(node2.data);
//    node1.next=node2;
//    System.out.println(node1.next);
//    System.out.println(node2);
    q1Node<Integer>head=node1;
    node1.next=node2;
    node2.next=node3;
     
    while(head!=null){
    System.out.print(head.data+ " ");
    head=head.next;    
	}
	}
}