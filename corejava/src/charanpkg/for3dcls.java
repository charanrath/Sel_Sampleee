package charanpkg;

public class for3dcls {
	int [][][]x= {{{1,2,3},{4,5,6},
			     {7,8,9},{10,11,12}},
			    {{13,14,15},{16,17,18},
		         {19,20,21},{22,23,24}}};
	public void disp(){
		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
				for(int k=0;k<3;k++){
					System.out.println(x[i][j][k]);
				}
			}
		}
	}
	
	            
	            

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for3dcls obj =new for3dcls();
		obj.disp();

	}

}
