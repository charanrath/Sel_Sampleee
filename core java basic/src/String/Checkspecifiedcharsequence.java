package String;

public class Checkspecifiedcharsequence {
	
	 
	
	 public void contains() {
		 String str ="PHP Exercises and Python Exercises";
		 String str1="and";	 
	 
		 System.out.println("original string: "+ str);
		 
		 System.out.println("Specified sequence of char values: "+str1);
	 System.out.println(str.contains(str1));
	 }
	 
	 public void charsequence() {
		 String str1 ="Example.com";
		 String str2 ="example.com";
		 String str3= "example.com";
		 System.out.println(str3.equals(str1));
		 System.out.println(str3.equals(str2));
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkspecifiedcharsequence obj =new Checkspecifiedcharsequence();
		obj.charsequence();
	}

}
