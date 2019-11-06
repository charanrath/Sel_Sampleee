package charanpkg;

public class breakforcls {
	public void disp(){
		for (int i=0;i<10;i++){
		if (i==5)
			break;
		System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		breakforcls obj =new breakforcls();
		obj.disp();
	}

}
