package exceptionpkg;

public class nestedtrycls {
	public void disp(){
		try{
		int x=10;
		int y=0;
		int z=x/y;
		String [] str={"hi","hello"};
		
		try{
			
			System.out.println(str[2]);
		
		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array bound");
		}
		}catch(ArithmeticException e){
			System.out.println("Arithmatic exception");
		}
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nestedtrycls obj =new nestedtrycls();
		obj.disp();
	}

}
