package Map;

import java.util.HashMap;

public class hashmapex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

HashMap<String,Integer> map =new HashMap<String,Integer>();

map.put("One", 1);
map.put("Two",2);
map.put("Three",3);
map.put("Four",4);

int value = map.get("Two");
System.out.println(value);
	}

}
