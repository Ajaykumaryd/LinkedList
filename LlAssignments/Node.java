package LlAssignments;

import java.util.Scanner;

public class Node {
	 int data;
	    Node next;
	    
	    Node(int data){
	    	this.data=data;
	    	next=null;
	    }
	    
	    public static Node midPoint(Node head) {
	    
	    Node fast=head,slow=head;	
	    while(fast.next!=null && fast.next.next!=null) {	
	    	
	    slow=slow.next;
	    fast=fast.next.next;	    		    	
	    }		    		    	
	    return slow;	
	    }
	    
	    public static int length (Node head) {
	    int count=1;	
	    while(head.next!=null){	
	    head=head.next;
	    count++;
	    }
	    return count;		    
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

	    public static Node evenafter(Node head){
	    	 if(head==null) {
	 	    	return head;
	 	    }
	 	    
	 	    Node ohead=null,otail=null,ehead=null,etail=null;
	 	    
	 	    while(head!=null) {
	 	    
	 	    if(head.data%2==0){
	 	    	if(ehead==null){
	 	    	   ehead=head;
	 	    	   etail=head;	    		
	 	    	}else{
	 	    	   etail.next=head;
	 	    	   etail=etail.next;
	 	    	}
	 	    	}
	 	    else {
	 	    	if(ohead==null){
	 	    		ohead=head;
	 	    		otail=head;
	 	    	}else {
	 	    	  otail.next=head;
	 	    	  otail=otail.next;
	 	    	}
	 	    }
	         head=head.next;
	 	    }
	 	    	
	 	    if(ohead==null){
	 	    	return ehead;
	 	    }
	 	    else {	
	 	    otail.next=ehead;	
	 	    }
	 	   if(ehead!=null){
	 	    	etail.next=null;
	 	   }
	 	   return ohead;
	 	    }  	
	 		
	    public static Node MafterN(Node head,int M,int N) {
	    if(M==0) {
	    	return null;
	    }
	    if(N==0) {
	    	return head;
	    }
	    Node t1=head,t2=head;
	    
	    while(t1!=null){
	    	
	    	for(int i=1;i<M && t1!=null;i++){
	    		t1=t1.next;
	    	}
	    	
	    	if(t1==null) {
	    		break;
	    	}
	    	t2=t1.next;
	    	for(int i=1;i<=N && t2!=null;i++){
	    		t2=t2.next;
	    	}
	    	t1.next=t2;
	    	t1=t2;
	    }
	    return head;
	    		    	
	    }
	   
	    public static Node mergetwoSorted(Node head1,Node head2) {
	    
	    	if (head1==null)
	        {
	            return head2;
	        }
	        
	        if (head2==null)
	        {
	            return head1;
	        }
	
	    Node t1=head1,t2=head2;	
	    
	    Node head=null,tail=null;
	    
	    if(t1.data<t2.data){
	       head=t1;
	       tail=t1;
	       t1=t1.next;
	    }
	    else {
	    	head=t2;
	    	tail=t2;
	    	t2=t2.next;
	    }
	    while(t1!=null && t2!=null){
	    	if(t1.data<=t2.data){
	    		tail.next=t1;
	    		tail=t1;
	    		t1=t1.next;
	    	}
	    	else {
	    		tail.next=t2;
	    		tail=t2;
	    		t2=t2.next;
	    	}
	    }
	    // one of two list is finished
	    if(t1!=null){
	    	tail.next=t1;
	    }else {
	    	tail.next=t2;
	    }	
	    return head;
	    }
	    
	    public static Node mergeSort(Node head) {

	   
	
	    	
	    if(head==null || head.next==null){
	    	        return head;
	    	    }
	    	   
	     Node midNode=midPoint(head);
	     Node head2=midNode.next;
	     midNode.next=null;

	     Node part1=mergeSort(head);
	     Node part2=mergeSort(head2);
	     Node finalListHead=mergetwoSorted(part1,part2);
	     return finalListHead;
	     }	

	    public static Node Swap(Node head,int i,int j) {
		    
		    if(i==j){
		    return head;
		    }
		    
		    Node temp=head;
		    Node pre=null;
		    Node p1=null;	
		    Node c1=null;	
		    Node p2=null;	
		    Node c2=null;	
		    	
		    int pos=0;
		    while(temp!=null){
		    
		    if(pos==i){
		       p1=pre;
		       c1=temp;
		    }
		    if(pos==j){
		       p2=pre;
		       c2=temp;
		    }
		    pre=temp;
		    temp=temp.next;
		    pos++;
		    }	
		    if(p1!=null){
		       p1.next=c2; 
		    }else{
		    	   head=c2;
		       }
		    if(p2!=null){
		    	p2.next=c1;
		    }else {
		        head=c1;	
		    }	
		   Node temp1=c2.next;
		   c2.next=c1.next;
		   c1.next=temp1; 	
		   return head; 	
		    		    	    	
		    }
		    	
	 	public static Node reverse(Node head,int k){
	 		
	 		 Node curr = head;
	 	     Node prev=null;
	 	     Node temp=null;
	 	        int i = 0;	 	       
	 	        if(k==0){
	 	            return head;
	 	        }
	 	        while (curr!=null && i<k) 
	 	        {
	 	            temp = curr.next;	 	      
	 	            curr.next = prev;
	 	            prev = curr;
	 	            curr = temp;
	 	            i++;
	 	        }
	 	        
	 	         if(temp != null) 
	 	        {
	 	            head.next = reverse(temp,k);
	 	        }
	 	return prev;
	 	    }
	 	
	 	
	 	public static Node oddeven2(Node head) {
	 	if (head == null) return null;
        Node odd = head, even = head.next, evenHead = even;
        while (even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
	 	}
    
	 	public static Node removeNthFromEnd(Node head, int n) {

	 	     Node temp=head;
	 	    int length=0;   
	 	    while(temp!=null){
	 	        temp=temp.next;
	 	        length++;
	 	    }
	 	  Node temp2=head;
	 	    int i=1;
	 	    
	 	    while(i<length-n ){
	 	        temp2=temp2.next;
	 	        i++;
	 	    } 
          System.out.println(temp2.data); 
	 	    
//	 	    if(temp==null || temp.next==null){
//	 	        return head;
//	 	    }
	 	    temp2.next=temp2.next.next;
	 	    return head;
	 	    }
	 	
	 	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
  Node head=takeInput();
	
//M after N data	    
//	    int m=2;
//	    int n=2;    
//        head=MafterN(head,m,n);
//        print(head);
	    
// evenafter odd data
//	    	   Node head=takeInput();	    
//               head=evenafter(head);
//	           print(head);
	           
//merge two sorted array
////	
//	    Node head1=takeInput();
//	    Node head2=takeInput();	    
//	    Node head=mergetwoSorted(head1,head2);	    	    
//	    print(head);
	    
//mergeSort
//                Node head=takeInput(); 
//                head=mergeSort(head);
//                print(head);

// swap two Nodes	    	
//	    int i=3;
//	    int j=1;
//	    Node head=takeInput();
//	    head=Swap(head,3,1);
//	    print(head);
	    	
//K reverse 	    	
//    Node head=takeInput();		  
//	    head=reverse(head,2);	    
//	    print(head);	
	    	
//length
//   int ans=length(head);
//   System.out.println(ans);
  
//oddeven2
//    head=oddeven2(head);
//    print(head);
  
  
//removes nodes from end  
   head=removeNthFromEnd(head,2);
   print(head);
  
  
    }
}
