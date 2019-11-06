package collectionpkg;

import java.util.ArrayList;

public class arraylistwithoutdatatype {
	public void valuebyloop2(){
		ArrayList al=new ArrayList();//creating Arraylist
		//List<String>al=new ArrayList<String>();//creating ArrayList
		//LinkedList<String>al=new LinkedList<String>();
		al.add("hi");
		al.add("hello");
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
			
		for(Object Obj :al)
			System.out.println(Obj);
		
	}
	
		
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylistwithoutdatatype obj =new arraylistwithoutdatatype();
		obj.valuebyloop2();
	}
}
