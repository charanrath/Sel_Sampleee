package charanpkg;

public class thiscls {
int x =10;
public void disp(){
	System.out.println(x);
	
}
public void disp1(){
	int x= 50;
	System.out.println(x);
	x=this.x;
	System.out.println(x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiscls a1 = new thiscls();
		a1.disp();
		a1.disp1();
	}

}
