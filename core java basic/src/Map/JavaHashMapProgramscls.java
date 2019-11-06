package Map;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapProgramscls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<String,Integer>map= new HashMap<String,Integer>();
    
    map.put("one", 1);
    map.put("Two", 2);
    map.put("Three",3);
    map.put("four", 4);
    map.put("Five",5);
    
   for (Map.Entry M:map.entrySet()) {
	   System.out.println(M.getKey()+" "+M.getValue());
	   
	   System.out.println("*****************************************");
	   
	   
	   
	 //Creating another HashMap
	   
	 HashMap<String,Integer>anothermap =new HashMap<String,Integer>();
	 
	 
 //put all data of map
	 
	 anothermap.putAll(map);
	 
	 //add more value
	 
	 anothermap.put("six", 6);
	 anothermap.put("seven", 7);
	 
	
	 
	 for (Map.Entry Q:anothermap.entrySet()) {
		 System.out.println(Q.getKey()+" "+Q.getValue());
	 }
	   
	   
	   
   }
	}

}
