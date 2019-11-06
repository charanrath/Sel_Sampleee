package charanpkg;

public class task2cls {
	char c='x';
	
	public void disp(){
		for (int i=0;i<5;i++){
			for( int j=5;j>=5-i;j--){
				System.out.print('x');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task2cls obj =new task2cls();
		obj.disp();
	}

}
