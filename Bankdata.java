package IIPC_java;

public class Bank1 {
	public static void main(String[]args) {
		Rbi r1=new sbi();
		r1.display();
		
	}

}
class Rbi{
	
	public void display() {
		System.out.println();
	}
}
class sbi extends Rbi{
	@Override
	public void display() {
		System.out.println("hello");
	}
}
