package methodoverriding;

public class childclass extends parentcls {
	childclass(int y){
		super(20);
		System.out.println("childclass"+" "+"y");
	}
	
	public childclass(){
		
	}
	
	public void disp() {
		super.disp();
		System.out.println("child method	");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
