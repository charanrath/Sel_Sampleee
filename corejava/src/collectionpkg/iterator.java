package collectionpkg;
import java.util.*;

public class iterator {
	public void testcollection1(){
		//ArrayList<String>al=new ArrayList<String>();//creating Arraylist
		List<String>al=new ArrayList<String>();//creating ArrayList
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
	
		Iterator itr1=al.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
