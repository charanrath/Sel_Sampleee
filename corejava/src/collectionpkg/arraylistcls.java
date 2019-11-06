package collectionpkg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arraylistcls {
	public void testcollection(){
		ArrayList<String>al=new ArrayList<String>();//creating Arraylist
		//List<String>al=new ArrayList<String>();//creating ArrayList
		//LinkedList<String>al=new LinkedList<String>();
		al.add("hi");
		al.add("hello");
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("six");
		al.add("seven");
		al.add("eight");
		al.add("nine");
System.out.println(al);
//al.set(0,"raj");
//al.set(1,"five");
//System.out.println(al);
//al.remove(1);
//System.out.println(al);
for(String str :al){
	System.out.println(str);
}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylistcls obj=new arraylistcls();
		obj.testcollection();
	}

}
