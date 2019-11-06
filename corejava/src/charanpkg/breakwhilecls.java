package charanpkg;

public class breakwhilecls {
	public void disp(){
		int i=0;
		while(i<10){
			if(i==5)
				break;
			System.out.println(i);
			i++;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		breakwhilecls obj=new breakwhilecls();
		obj.disp();
	}

}
