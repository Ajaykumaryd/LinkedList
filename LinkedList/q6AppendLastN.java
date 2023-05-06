package LinkedList;

public class q6AppendLastN {
    	
	int data;
	q6AppendLastN next;
	
	q6AppendLastN(int data){
	this.data=data;
	next=null;
	}
		
	public static q6AppendLastN AppendLast(q6AppendLastN head,int n){
	
	q6AppendLastN temp=head;
	int len=0;
	while(temp!=null) {
	len++;
	temp=temp.next;	
	}
	
	q6AppendLastN tail=head;
	int i=1;
	while(i<len-n){
		tail=tail.next;
		i++;
	}
	
		q6AppendLastN newHead=tail.next;
		tail.next=null;
		tail=newHead;
	
		i=1;
		while(i<n){
			tail=tail.next;
			i++;
		}
	    tail.next=head;
	    return newHead;	
	}
	
	public static void print(q6AppendLastN head) {
		while(head!=null) {
		System.out.print(head.data+ " ");
		head=head.next;
		}		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       q6AppendLastN n1=new q6AppendLastN(1);
       q6AppendLastN n2=new q6AppendLastN(2);
       q6AppendLastN n3=new q6AppendLastN(3);
       q6AppendLastN n4=new q6AppendLastN(4);
       
       
       q6AppendLastN head=n1;
       n1.next=n2;
       n2.next=n3;
       n3.next=n4;
       
       head=AppendLast(head,2);
       print(head);  
	}

}
