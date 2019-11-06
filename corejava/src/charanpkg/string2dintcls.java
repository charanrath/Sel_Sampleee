package charanpkg;

public class string2dintcls {
	int [][] x={{1,2,3},{4,5,6},{7,8,9}};
	public void disp(){
		System.out.println(x[0][2]);
		System.out.println(x[1][1]);
		System.out.println(x[0][1]);
		System.out.println(x[0][0]);
		System.out.println(x[1][0]);
		System.out.println(x[1][2]);
		System.out.println(x[2][1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string2dintcls obj =new string2dintcls();
		obj.disp();
	}

}
