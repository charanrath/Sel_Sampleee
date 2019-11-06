package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Example2cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer> map =new HashMap<String,Integer>();

//Add key value pair
map.put("one", 1);
map.put("Two", 2);
map.put("Three",3);
map.put("five",5 );
map.put("Eight",2);
//add absent key value pair

//map.putIfAbsent("one", 1);

map.putIfAbsent("six", 6);


for(Entry<String, Integer> all: map.entrySet()) {
	
	System.out.println(all.getKey()+" "+all.getValue());
	
}

	}

}
