package arraylistpkg;

import java.util.ArrayList;
import java.util.List;

public class Insertinfirstcls {

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
	      
	      System.out.println(al);
	      
	     // Now insert a color at the first and last position of the list
	      
	      al.add(0,"pink");
	      al.add(5,"yellow");
	      System.out.println(al);
	      
	      System.out.println("output using for each loop");
	      for(String el:al) {
	    	  System.out.println(el);
	    	  
	      }
	      
	      System.out.println("output using for loop");
	      for(int index=0;index<al.size();index++) {
	    	  System.out.println(al.get(index));
	      }
	      
	      al.remove("wHITE");
	      al.remove("Black");
	      
	      
	      System.out.println("output after removing black and white");
	      for(int index=0;index<al.size();index++) {
	    	  System.out.println(al.get(index));
	      }
	      
	      
	      
	}

	private static void retrive(int i, String string) {
		// TODO Auto-generated method stub
		
	}

}
