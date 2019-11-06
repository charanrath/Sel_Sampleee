package exceptionpkg;

public class exceptioncls {
	int x=20;
	int y=0;
	
	public void disp() {
		try {
		int z=x/y;
		System.out.println("z");
	}catch(ArithmeticException e)
		{
		System.out.println("continue programme");
		}
	}

public static void main(String args[]) {
	exceptioncls obj =new exceptioncls();
	obj.disp();
}
}
	
