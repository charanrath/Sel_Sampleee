package charanpkg;

public class for13dcls {
	int [][][]x={{{1,2},{3,4},
			{5,6},{7,8}},
			{{9,10},{11,12},
			{13,14},{15,16}}};
	public void disp(){
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				for(int k=0;k<x[i][j].length;k++){
					System.out.print(x[i][j][k]+" ");
					
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for13dcls obj =new for13dcls();
		obj.disp();
	}

}
