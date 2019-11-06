package oops;

public class methodoverloadingcls {
	public void disp(char c){
		System.out.println("charachter parameter" +" "+ c);
	}
public void disp (int x){
	System.out.println("integer parameter" +" "+ x);
}
public void disp(String x){
	System.out.println("string parameter" +" "+ x);
}
public void disp(int x,int y ){
	System.out.println("both integer"+" "+ x+" " + y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloadingcls obj=new methodoverloadingcls();
		obj.disp(15);
		obj.disp("hello");
		obj.disp(25,35);
		obj.disp('a');
	}

}
