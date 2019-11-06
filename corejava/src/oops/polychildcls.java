package oops;

public class polychildcls extends polyparentcls {
	public void disp(){
		System.out.println("polychild");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polyparentcls obj=new polychildcls();
		obj.disp();
		polyparentcls obj1=new polyparentcls();
		obj1.disp();
		obj1=obj;
		obj1.disp();
	}

}
