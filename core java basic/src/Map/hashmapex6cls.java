package Map;

import java.util.HashMap;

public class hashmapex6cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,Double> map=new HashMap<Integer,Double>();

map.put(111,11.1);
map.put(222, 22.2);
map.put(333, 33.3);
map.put(444,44.4);

System.out.println(map.size());

map.clear();

System.out.println(map.size());
	}

}
