package charanpkg;

public class array2dtaskcls {
	char c='x';
	public void disp(){
		for(int i=0;i<5;i++){
			
	
			for(int j=0;j<5-i;j++){
				System.out.print('x');
			}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array2dtaskcls obj=new array2dtaskcls();
		obj.disp();
	}

}
