package charanpkg;

public class continuewhilecls {
	public void disp(){
		int i=0;
		while (i<10){
			
			
			if (i==5 ){
				i++;
				continue;
				
				
			}
			System.out.println(i);
			i++;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		continuewhilecls obj =new continuewhilecls();
		obj.disp();
	}

}
