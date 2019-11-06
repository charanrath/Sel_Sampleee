package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, String> map = new HashMap<>();
		 
		 map.put("Robert Downey, Jr.", "Iron Man");
		 map.put("Chris Evans", "Captain America");
		 map.put("Chris Hemsworth", "Thor");
		 map.put("Chris Hemsworth", "Thor");
		 map.put("Scarlett Johansson", "Black Widow");
		 map.put("Mark Ruffalo", "Hulk");
		 
		 int totalLength;
		 
		 for (Map.Entry M:map.entrySet()) {
			 
			// System.out.println(M.getKey() +" "+M.getValue() );
			 
			String key = M.getKey().toString();
			String value = M.getValue().toString();
			
			 totalLength = key.length()+value.length();
			 
		 }
		 
		 
		 ArrayList<String> al = new ArrayList<String>(totalLength);
		 System.out.println(al);
		 
		 
		 
		 
	}

}
