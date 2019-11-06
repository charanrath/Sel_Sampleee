package arraylistpkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class AddcolouraAl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al =new ArrayList<String>();
      al.add("RED");
      al.add("GREEN");
      al.add("wHITE");
      al.add("Black");
      al.add("Green");
      al.add("blue");
      al.add("black");
      
      List<String> subList = al.subList(0, 2);
      
      System.out.println(al);
      System.out.println(subList);
      
      /*Iterator it = al.iterator();
      while(it.hasNext()) {
    	  System.out.println(it.next());
      }*/
      
   /*   for(String el : al) {
    	  System.out.println(el);
      }*/
	}

}
