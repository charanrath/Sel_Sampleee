package exceptionpkg;

public class throwcls {
	
public void disp(int age){
	try{
	if(age<18)
		throw new ArithmeticException("not valid");
	else 
		System.out.println("welcome to vote");
	
}catch(ArithmeticException e){
	System.out.println("ArithmeticException");
}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwcls obj =new throwcls();
		obj.disp(13);
		System.out.println("rest of the code");

	}

}
