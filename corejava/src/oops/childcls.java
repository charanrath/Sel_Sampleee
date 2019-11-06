package oops;

public class childcls extends parentcls {
	childcls (int y){
		super(5);
		System.out.println("childclass"+" "+y);
	}
	public void disp(){
		//super.disp();
		System.out.println("childclass");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childcls obj=new childcls(10);
		obj.disp();
		
		
		
	}

}
