package Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistimplement {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> val =new LinkedList<String>();
int size;
val.add("A");
val.add("chintu");
val.addLast("Tunguri");
val.addFirst("Muthuswami");
val.add(2, "phunsuk");
val.add("pro");

System.out.println("Linke list :" + val);
size=val.size();
System.out.println(size);


val.remove("phunsuk");
val.remove(3);
val.removeFirst();
val.removeLast();

System.out.println("Linked list after remove :" + val);
size=val.size();
System.out.println(size);



if(val.contains("pungu"))
{
	val.remove("pungu");
}else {
	val.addFirst("pungu");
	
}

System.out.println("Linked list :" + val);


size=val.size();

System.out.println(size);

Object element=val.get(2);
System.out.println(element);

val.set(1, "chungu");
System.out.println("Linked list :" + val);

LinkedList<String> reverse =new LinkedList<String>();

//reverse the linked list
Iterator it = val.descendingIterator();
 while(it.hasNext()) {
	 reverse.add(it.next().toString());	  
 }
 
 System.out.println("Reverse Linked list :" + reverse);

 


	}

}
