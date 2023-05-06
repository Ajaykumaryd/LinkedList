package LinkedListRecusion;
import java.util.*;
public class Node {
    int data;
    Node next;
    
    Node(int data){
    	this.data=data;
    	next=null;
    }
	
 
    public static Node takeInput()

	{
		Node head = null, tail = null;
		try (Scanner s = new Scanner(System.in)) {
			int data = s.nextInt();
					
			while(data != -1){
				Node newNode = new Node(data);
				if(head == null){
					head = newNode;
					tail = newNode;
				}else{				
					tail.next = newNode;
					tail = newNode; 
				}
				data = s.nextInt();
			}
		}
		return head;
	}
   

    public static void print(Node head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}
 
    
    public static Node insert(Node head,int pos,int n){
	   
     if(head==null) {
	 return head;  
     }
     if(pos==0){
    	 Node newNode=new Node(n);
    	 newNode.next=head;
     
     
     head.next=insert(head.next,pos-1,n);

         }
     return head;
   
     }


	 public static Node delete(	Node head,int pos) {
	   if(head==null){
           return head;
       }
       
       if(pos==0){
           return head.next;
       }

       head.next=delete(head.next, pos-1);
       return head;	      
	   
   }
	
	 public static int findNode(Node head,int n) {
	 
	 if(head==null){  	 
	 return -1;
	 }
	 
	if(head.data==n) {
	 return 0;
	}
	
	int smallans=findNode(head.next,n);
	if(smallans==-1){
		return -1;
	}else {
		return smallans +1 ;
	}
	 }	 
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=takeInput();
        
		head=insert(head,2,10);
		print(head);
				
	}

}
