package charanpkg;

public class forrowcls {
	String [][]str={{"hi","hello"},
			       {"hi1","hello1"}};
	public void disp(){
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(str[i][j]);
				
				
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forrowcls obj=new forrowcls();
		obj.disp();
	}

}
