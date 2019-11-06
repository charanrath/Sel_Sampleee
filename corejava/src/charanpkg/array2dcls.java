package charanpkg;

public class array2dcls {
	String [] [] str={ {"hi","hello","charan"},{"hi1","hello1","charan1"},{"hi2","hello2","charan3"},{"hi3","hello","charan2"}};
			
	public void disp(){
		System.out.println(str [1][1]);
		System.out.println(str [0][1]);
		System.out.println(str [2][2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array2dcls obj =new array2dcls();
		obj.disp();

	}

}
