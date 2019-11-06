package exceptionpkg;

public class nestedtry1cls {
	public void disp(){
		try{
		int x=200;
		int y=13;
		int z=x/y;
		System.out.println(z);
		String [] str={"hi","hello"};
		
		try{
			
			System.out.println(str[1]);
			String str1="hell0";
			try{
			str1=null;
			System.out.println(str1.length());
			}catch(NullPointerException c){
				System.out.println("null pointer exception");
			}
		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array bound");
		}
		}catch(ArithmeticException e){
			System.out.println("Arithmatic exception");
		}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nestedtry1cls obj1 =new nestedtry1cls();
		obj1.disp();
	}

}
