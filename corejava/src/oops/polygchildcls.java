package oops;

public class polygchildcls extends polychildcls {
	public void disp(){
		System.out.println("polygchild");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polyparentcls obj=new polychildcls();
		obj.disp();
		polyparentcls obj1=new polyparentcls();
		obj1.disp();
		obj1=obj;
		obj1.disp();
		polychildcls obj3=new polygchildcls();
		obj3.disp();
		polychildcls obj4=new polygchildcls();
		obj3=obj4;
		obj4.disp();

	}

}
