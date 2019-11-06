package String;

public class Equalscls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str= "Stephen Edwin King";
 String str1="Walter Winchell";
 String str3="Mike Royko";
 String str4="stephen edwin king";
 //useing equal 
 System.out.println(str.equals(str1));
 System.out.println(str1.equals(str3));
 //useing equalignore case
 System.out.println(str.equalsIgnoreCase(str1));
 System.out.println(str.equalsIgnoreCase(str4));
 
 
	}

}
