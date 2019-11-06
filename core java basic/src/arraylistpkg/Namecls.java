package arraylistpkg;

import java.util.ArrayList;

public class Namecls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al =new ArrayList<String>();
		ArrayList<Character> removeCharsList = new ArrayList<Character>();
		removeCharsList.add('a');
		removeCharsList.add('e');
		removeCharsList.add('i');
		removeCharsList.add('o');
		removeCharsList.add('u');
		 al.add("Prateek");
		 al.add("Sami");
		 al.add("Anki");
		 al.add("Debi");
		 al.add("Chintu");
		 al.add("Montu");
		 
		 for(String nl:al) {
			 System.out.println(nl.charAt(0));
		 }
		 
		 String name = "nrusingh charan";
		 String outputName = "";
		 
		 for(int i=0;i<name.length();i++) {
			 
			 if(!removeCharsList.contains(name.charAt(i))) {
				outputName = outputName+name.charAt(i);
			 }			 
		 }
		 System.out.println("Output after remofving a,e,i,o,u : "+outputName);
		 
		 
	}

}
