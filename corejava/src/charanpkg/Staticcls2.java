package charanpkg;

public class Staticcls2 {
	int x =50;
	int y =100;
	static int z = 40;
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticcls2 obj =new Staticcls2();
		Staticcls2 obj1 = new Staticcls2();
		//obj.x=400;
		obj1.y=500;
		System.out.println(obj1.x);
		System.out.println(obj.y);
		System.out.println(Staticcls2.z);
		

	}

}
