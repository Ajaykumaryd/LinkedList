package LinkedList;

import java.util.ArrayList;

public class arraylist1 {

	public static void main(String[] args) {
	
		
	ArrayList<Integer> list1 =new ArrayList<>();
	System.out.println(list1.size());
	list1.add(10);
	list1.add(15);
	list1.add(20);
	list1.add(2,50);
	list1.add(4,60);
	System.out.println(list1.size());
	System.out.println(list1.get(3));
	
	list1.set(1,20);
	for(int i=0;i<list1.size();i++){
		System.out.print(list1.get(i)+" ");
	}
	System.out.println();
	
    for(int element:list1){
       System.out.print(element+" "); 		
    }
	System.out.println();	
    
    ArrayList<String> list = new ArrayList<String>() ;
    list.add( "apple" );
    list.add( "banana" );
    list.add( "carrot" );
    list.add( 0, "mango" );
    System.out.println(list.get(2));
	}
}
