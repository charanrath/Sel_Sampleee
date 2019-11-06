package charanpkg;

public class array3dnewcls {
	
	
	String [][][]str=new String[3][2][2];
	
	public void disp(){
		
		
		str[0][0][0]="1r1c1";
		str[0][0][1]="1r1c2";
		str[0][1][0]="1r2c1";
		str[0][1][1]="1r1c1";
		str[1][0][0]="2r1c1";
		str[1][0][1]="2r1c2";
		str[1][1][0]="2r2c1";
		str[1][1][1]="1r2c2";
		str[2][0][0]="3r1c1";
		str[2][0][1]="3r1c2";
		str[2][1][0]="3r2c1";
		str[2][1][1]="1r2c2";
		String str1= str[0][0][0];
		System.out.println(	str1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array3dnewcls obj =new array3dnewcls();
		obj.disp();
	}

}
