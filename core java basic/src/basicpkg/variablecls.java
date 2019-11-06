package basicpkg;

public class variablecls {
	int x=10; //instance variable
	static int y=20; //static variable
	public void disp1() {
		//int x=50; //for example 
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	public void disp() {
		int x=20;//local variable
		System.out.println(x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variablecls obj=new variablecls();
		obj.disp();
		obj.disp1();
		System.out.println(y);
		
	}

}
