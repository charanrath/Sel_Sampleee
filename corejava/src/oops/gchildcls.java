package oops;

public class gchildcls extends childdcls {
	gchildcls(int x){
		super(30);
	System.out.println("gchild"+" "+x );
	}
	
	public void disp(){
		super.disp();
		System.out.println(" gchild method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gchildcls obj=new gchildcls(20);
		obj.disp();
	}

}
