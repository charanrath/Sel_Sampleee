package basicpkg;

public class Ifelsecls {
	int number =13;
	public void disp1(){
		if (number%2==0) {
			System.out.println("number is  even");
		}
		else {
			System.out.println("number is odd");
		}
	}
	 public void disp2() {
		 int marks =65;
		 if (marks<30) {
			 System.out.println("fail");
		 }
		 else if(marks>=40) {
			 System.out.println("grade c");
		 }
		 else if (marks>=60) {
			 System.out.println("grade B");
		 }
		 else if(marks>=75 && marks<90) {
			 System.out.println("grade A");
		 }
		 else {
			 System.out.println("grade A+"); 
		 }
			 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifelsecls obj =new Ifelsecls();
		obj.disp2();
	}

}
