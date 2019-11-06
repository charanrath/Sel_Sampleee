package exceptionpkg;

import java.io.IOException;

public class throwscls {
	void m()throws IOException{
		throw new IOException ("device error");
	}
	void n() throws  IOException{
		m();
		
	}
void p(){
	try{
		n();
	}catch(Exception e){System.out.println("exception handled");}
}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		throwscls obj=new throwscls();
		obj.n();
		System.out.println("normal flow....");
	}

}
