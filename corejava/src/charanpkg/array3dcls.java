package charanpkg;

public class array3dcls {
	String [][][] str ={{{"1r1c1","1r1c2"},{"1r2c1","1r2c2"}},
			{{"2r1c1","2r1c2"},{"2r2c1","2r2c2"}}};
	public void disp(){
		System.out.println(str[1][1][0]);
		System.out.println(str[0][1][1]);
		System.out.println(str[1][1][1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array3dcls obj=new array3dcls();
		obj.disp();
	}

}
