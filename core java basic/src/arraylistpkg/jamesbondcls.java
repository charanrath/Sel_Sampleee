package arraylistpkg;

import java.util.ArrayList;

public class jamesbondcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> outputList = new ArrayList<String>();
		
		
		al.add("Prateek");
		al.add("Sami");
		al.add("Anki");
		al.add("debi");
		al.add("chintu");
		
		char p ;
		
		
		for(String name :al) {
			
			for(int index=0 ;index<name.length();index++) {
				if  (index % 2==0) {
					 p=name.charAt(index);
					p--;
					
					
				}
				
				else{
					p=name.charAt(index);
					p++;
					
				}
				System.out.print(p);
				
			}
			System.out.println();
		}
		
		
		
		for(String item : al) {
			String output="";
			for(int index=0;index<item.length();index++) {
				char ch = item.charAt(index);
				if(index%2==0) {					
					output = output + (--ch);
				}else {
					output = output + (++ch);
				}
			}
			outputList.add(output);			
		}
		System.out.println("*******************************************");
		for(String output : outputList) {
			System.out.println(output);
		}

	}

}
