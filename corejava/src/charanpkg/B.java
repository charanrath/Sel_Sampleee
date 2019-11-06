package charanpkg;

public class B {
int x=10;
static int y=20;
public void disp(){
	System.out.println(x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B a1=new B();
B a2=new B();
 a1.y =200;
 System.out.println(a1.y);
System.out.println (a2.y);
a1.x=500;
System.out.println(a1.x);
System.out.println (a2.x);

	}

}
