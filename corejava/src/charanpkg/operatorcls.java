package charanpkg;

public class operatorcls {
	int x=10;
	int y =5;
	public void disp(){
		System.out.println(x);
		int z=x++;
		System.out.println(z);
		z=x++ + y++;
		System.out.println(z);
		int a =x++ + x++;
		System.out.println(a);
		int b = x++ + x++ +y++;
		System.out.println(b);
		int c=y++ + z++ + x++;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operatorcls obj =new operatorcls();
		obj.disp();

	}

}
