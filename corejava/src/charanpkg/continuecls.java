package charanpkg;

public class continuecls {
	public void disp(){
		for(int i=0;i<101;i++){
		if (i>=50 && i<=60)
			
				continue;
				
			
			System.out.println(i);
			}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		continuecls obj =new continuecls();
		obj.disp();
	}

}
