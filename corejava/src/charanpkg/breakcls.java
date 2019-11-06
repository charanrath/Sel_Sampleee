package charanpkg;

public class breakcls {
	public void disp(){
		for(int i=0;i<10;i++){
			if (i==5)
			break;
			System.out.println(i);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		breakcls obj=new breakcls();
		obj.disp();
	}

}
