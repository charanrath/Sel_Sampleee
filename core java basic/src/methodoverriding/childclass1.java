package methodoverriding;

public class childclass1 extends childclass {
	static int z=30;
	
	static public void disp() {
		super.disp();
		System.out.println("childclass1"+" "+"z");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclass1 obj=new childclass1();
		obj.disp();
	}

}
