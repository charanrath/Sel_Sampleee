package exceptionpkg;

public class finalise1cls {
	int x=100;
	public void finalize(){
		System.out.println("finalize called");//method of system class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalise1cls final1=new finalise1cls();
		finalise1cls final2=new finalise1cls();
		final1=null;
		
		final2=null;
		
		System.gc();//will call automatically
	}

}
