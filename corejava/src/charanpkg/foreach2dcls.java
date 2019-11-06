package charanpkg;

public class foreach2dcls {
	String [][]str={{"hi","hello"},
	               {"hi1","hello"}};
	public void disp(){
		for (String []str1:str){
			for(String str2:str1){
				System.out.print(str2+" ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foreach2dcls obj=new foreach2dcls();
		obj.disp();
	}

}
