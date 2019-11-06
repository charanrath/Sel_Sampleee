package String;

public class Stringcomparisoncls {
	String str = "This Is java 1";
	String str1 ="This is java";
	
	public void lexicographically() {
		
		
		int result = str.compareTo(str1);
		
		if (result>0) {
			System.out.println("\"" + str + "\"" +
	                " is less than " +
	                "\"" + str1 + "\"");
					
		}
		else if(result==0) {
			System.out.println( "\"" + str + "\"" +
	                " is equal to " +
	                "\"" + str1 + "\"");
		}
		else {
			System.out.println("\"" + str + "\"" +
	                " is greater than " +
	                "\"" + str1 + "\"");
		}
	}
	public void ignorecase() {
		int result  = str.compareToIgnoreCase(str1);
		if (result>0) {
			System.out.println("\"" + str + "\"" +
	                " is less than " +
	                "\"" + str1 + "\"");
		}
		else if(result==0) {
			System.out.println( "\"" + str + "\"" +
	                " is equal to " +
	                "\"" + str1 + "\"");
		}
		else {
			System.out.println("\"" + str + "\"" +
	                " is greater than " +
	                "\"" + str1 + "\"");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringcomparisoncls obj =new Stringcomparisoncls();
		 
		obj.lexicographically();
		obj.ignorecase();

	}

}
