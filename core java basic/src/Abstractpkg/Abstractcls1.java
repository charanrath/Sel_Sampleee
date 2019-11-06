package Abstractpkg;

public class Abstractcls1 extends Abstractcls {
	
	public void m1(int p ,int q) {
		int prod=p * q;
		System.out.println(prod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractcls1 obj=new Abstractcls1();
		obj.m1(7,8);
		
	}

}
