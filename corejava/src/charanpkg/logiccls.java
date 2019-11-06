package charanpkg;

public class logiccls {
	int x=10;
	int y=20;
	public void disp(){
		if (x>10 && y==20)
			System.out.println("hi");
		else
			System.out.println("hello");
		if (x>10 && y>20)
			System.out.println("hi");
		else
			System.out.println("hello");
		if (x>10 || y>20)
			System.out.println("hi");
		else
			System.out.println("hello");
		if(x>10 || y==20)
			System.out.println("hi");
		else
			System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logiccls obj = new logiccls();
		obj.disp();

	}

}
