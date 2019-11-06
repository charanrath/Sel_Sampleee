package charanpkg;

public class foreachcls {
	String []str={"hi","hello"};
	public void disp(){
		for(String str1:str){
			System.out.print(str1+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foreachcls obj =new foreachcls();
		obj.disp();
		
	}

}
