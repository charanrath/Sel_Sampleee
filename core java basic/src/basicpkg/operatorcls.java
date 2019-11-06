package basicpkg;

public class operatorcls {
	int x=10;
	int y=5;
	//unary operatotr
	public void disp() {
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(x++ + y);
		System.out.println(x);
		System.out.println(--y);
		System.out.println(y++ +y);
		
	}
	//arithmatic operator
	public void arithmatic() {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
	}
	
	//shift operator
	
	public void shift() {
		System.out.println(x>>y);
		System.out.println(x<<y);
	}
	
	//Relationl operator and bitwise operator
	
	public void relational() {
		System.out.println(x<y&&x>y);
		System.out.println(x>y^y>x);
		System.out.println(x>y|y>x);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operatorcls obj =new operatorcls();
		obj.relational   ();
	}

}
