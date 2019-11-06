package charanpkg;

public class task3cls {
int x=1;
public void disp(){
	for (int i=0;i<5;i++){
		for(int j=5;j>=5-i;j--){
			System.out.print( x);
		x++;
			
		}
		System.out.println();
		x=1;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task3cls obj =new task3cls();
		obj.disp();
	}

}
