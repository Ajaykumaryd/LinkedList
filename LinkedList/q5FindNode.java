package LinkedList;

public class q5FindNode {
     
	int data;
	q5FindNode next;	
	q5FindNode(int data){
		this.data=data;
		next=null;
	}
	
	public static int findNode(q5FindNode head,int n){
	
	int count=0;
	while(head!=null && head.data!=n)
	{
	  count++;
	  head=head.next;	
	}
	
	if(head!=null){
	   return count;	
	}else{
		 return -1;
	     }
	}	
	public static void main(String[] args) {
	
		q5FindNode n1=new q5FindNode(2);
		q5FindNode n2=new q5FindNode(3);
		q5FindNode n3=new q5FindNode(4);
		q5FindNode n4=new q5FindNode(5);
		q5FindNode n5=new q5FindNode(6);
		
		q5FindNode head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		int ans=findNode(head,4);
		System.out.println(ans);
		
	}

}
