package charanpkg;

public class thiscls1 {
	int x=10;
	public void disp(){
		int x =50;
		System.out.println(this.x);
		this.x=500;
		x=200;
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		thiscls1 obj =new thiscls1();
		obj.disp();
		System.out.println(obj.x);
		obj.x=300;
		obj.disp();
		System.out.println(obj.x);

	}

}
