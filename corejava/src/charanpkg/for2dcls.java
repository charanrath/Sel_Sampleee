package charanpkg;

public class for2dcls {
	String [][]str={{"hell02",},
			      {"hi","hello"},
			      {"hi1","hello1"}};
	public void disp(){
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str[i].length;j++){
				System.out.println(str[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for2dcls obj=new for2dcls();
		obj.disp();
	}

}
