package charanpkg;

public class demostaticcls {
	int x =50;
	static int z =30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demostaticcls obj =new demostaticcls();
		demostaticcls obj1 = new demostaticcls();
		obj.x =300;
		System.out.println(obj1.x);
		obj1.z=300;
		System.out.println(obj.z);

	}

}
