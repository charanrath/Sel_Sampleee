package charanpkg;

public class preincrementcls {
	int x=10;
public void disp(){

	System.out.println(++x);
	int y=++x;
	System.out.println(y);
	System.out.println(x);
	y=++x + ++x;
	System.out.println(y);
	System.out.println(x);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preincrementcls obj =new preincrementcls();
		obj.disp();

	}

}
