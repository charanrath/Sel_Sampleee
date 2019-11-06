package oops;

public class stringconstructcls {
	stringconstructcls(){
		System.out.println("Default constructor");
	}
	
	stringconstructcls(String x){
		this();
		System.out.println("parametrised constructor"+" "+x);
		
	}
	stringconstructcls(int x){
		this("hello");
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringconstructcls obj=new stringconstructcls(5);
	}

}
