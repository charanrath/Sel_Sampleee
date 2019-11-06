package arraylistpkg;

import java.util.ArrayList;


public class Removevowelclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Character> removeCharsList = new ArrayList<Character>();
		int count = 0;
		removeCharsList.add('a');
		removeCharsList.add('e');
		removeCharsList.add('i');
		removeCharsList.add('o');
		removeCharsList.add('u');
		
		
		al.add("Prateek");
		al.add("Sami");
		al.add("Anki");
		al.add("debi");
		al.add("chintu");
		
		for(String name : al) {
			count=0;
			
			for(int index=0;index<name.length();index++) {
				
				if(removeCharsList.contains(name.charAt(index))) {
					count++;
				}		
			
			}
			
			System.out.println("Count of vowels in "+name+" is "+count);
		
		}
		
			
			
			
		}

	}


