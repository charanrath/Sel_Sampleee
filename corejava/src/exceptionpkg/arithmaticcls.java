package exceptionpkg;

public class arithmaticcls {
	
	public void disp(){
		try{
	int x=10;
	int y=0;
	int z=x/y;
	System.out.println(z);
	}catch(ArithmeticException e){
	System.out.println("continue program");
	}
	}
	public void disp1(){
		try{
			String[]str={"hi","hello"};
			System.out.println(str[2]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("exception occur");
		}
		System.out.println("continue the program");
	}
	public void disp2(){
		try{
		String str="hello";
				str=null;
		System.out.println(str.length());
		}catch(NullPointerException e){
			System.out.println("coninue the program");
		}
	}
	public void disp4(){
		try{
		String str ="str10";
		int i=Integer. parseInt(str);
		System.out.println(i);
		}catch(NumberFormatException e){
			
			System.out.println("continue the program");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmaticcls obj =new arithmaticcls();
		obj.disp4();
		

	}

}
