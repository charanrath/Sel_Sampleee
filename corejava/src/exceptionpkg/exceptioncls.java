package exceptionpkg;

public class exceptioncls {
	public void disp(){
		try{
		int x=10;
		int y=0;
		int z=x/y;
		System.out.println(z);
		}catch(ArithmeticException e){
			System.out.println("arithmatic exception");
		
		}finally{
			System.out.println("finally");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptioncls obj =new exceptioncls();
		obj.disp();
	}

}
