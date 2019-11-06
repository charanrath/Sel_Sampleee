package charanpkg;

public class for2darry {
	String [][]str={{"Hi","hello"},
	               {"HI1","hello1"}};
	public void disp(){
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println(str[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for2darry obj=new for2darry();
		obj.disp();
	}

}
