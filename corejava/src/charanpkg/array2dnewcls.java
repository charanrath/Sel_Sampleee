package charanpkg;

public class array2dnewcls {
	String [] [] str =new String [2][2];
	
			
	public void disp(){
		str[0][0]="hi";
		str[0][1]="hello";
		str[1][0]="hi1";
		str[1][1]="hello1";
		System.out.println(str[1][0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array2dnewcls obj =new array2dnewcls();
		obj.disp();
	}

}
