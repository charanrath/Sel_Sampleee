package charanpkg;

public class A {
public int disp(int x){
	int y =30;
	int z =x+y;
	return (z);
}
public void disp1(){
	int a =disp(20);
	System.out.println(a);
}
public static void main (String [] args){
A A1 =new A();
A1.disp1();
}
}

