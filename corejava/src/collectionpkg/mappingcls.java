package collectionpkg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class mappingcls {
	public void mapp(){
		Map<Integer,String>hm=new HashMap<Integer,String >();
		hm.put(100,"hi");
		hm.put(101,"hello");
		hm.put(102,"one");
		hm.put(103,"two");
		hm.put(104,"three");
		for(Integer m:hm.keySet()){
			System.out.println(hm.get(101));
		}
		System.out.println(hm.values());//all values
		System.out.println(hm.entrySet());//all keys and value
		System.out.println(hm.keySet());//all keys
		System.out.println(hm.get(102));
	
	}
	public void mapp1(){
		Map<Integer,String>hm=new HashMap<Integer,String >();
		
		hm.put(100,"hi");
		hm.put(101,"hello");
		hm.put(102,"one");
		hm.put(103,"two");
		hm.put(104,"three");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		}
		public void mapp2(){
			//HashMap<Integer,String>hm=new HashMap<Integer,String >();
			LinkedHashMap<Integer,String>hm=new LinkedHashMap<Integer,String >();
			hm.put(100,"hi");
			hm.put(101,"hello");
			hm.put(102,"one");
			hm.put(103,"two");
			hm.put(104,"two");
			//for(Map.Entry m:hm.entrySet()){
				//System.out.println(m.getKey()+" "+m.getValue());
			System.out.println(hm);
		}
		//}
		public void mapp3(){
			Map<Integer,String>hm=new HashMap<Integer,String >();
			hm.put(100,"hi");
			hm.put(101,"hello");
			hm.put(102,"one");
			hm.put(103,"two");
			hm.put(104,"three");
			Set keys =hm.keySet();
			Iterator<Integer>itr2= keys.iterator();
			while(itr2.hasNext()){
				Integer v=itr2.next();
				System.out.println("key:"+v+",value:"+hm.get(v));
			}
		}
		public void mapp4(){
			Map<Integer,String>hm=new HashMap<Integer,String >();
			hm.put(100,"hi");
			hm.put(101,"hello");
			hm.put(102,"one");
			hm.put(103,"two");
			hm.put(104,"three");
			Set<Entry<Integer,String>>entries =hm.entrySet();
			for(Entry<Integer,String> entry :entries){
				Integer key=entry.getKey();
				String value=entry.getValue();
				System.out.println(key+" "+value);
			}
			}
		public void mapp5(){
			Map<Integer,String>hm=new HashMap<Integer,String >();
			hm.put(100,"hi");
			hm.put(101,"hello");
			hm.put(102,"one");
			hm.put(103,"two");
			hm.put(104,"three");
			System.out.println("hm:"+ hm);
			Set<Integer>keys=hm.keySet();//keys is for keyset
				Collection<String>values = hm.values();//collection is for value
				Set<Entry<Integer,String>> entries=hm.entrySet();//entries is for value as well as key
				System.out.println("keys of  Map :" + keys);
				System.out.println("values from Map :" + values);
				System.out.println("entries from  Map :" + entries);
		}
		
		
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mappingcls obj=new mappingcls();
		obj.mapp5();
	}

}
