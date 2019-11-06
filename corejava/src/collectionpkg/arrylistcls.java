package collectionpkg;

import java.util.ArrayList;

public class arrylistcls {
	public void disp(){
	ArrayList al=new ArrayList();
	al.add("hello");
	al.add('a');
	al.add(6576);
//	al.add("two");
	System.out.println (al.get(1));
	System.out.println(al);
	for(Object obj:al){
		System.out.println(obj);	
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrylistcls obj =new arrylistcls();
		obj.disp();
	}

}
