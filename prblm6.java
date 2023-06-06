package prblm6;

public class Student {
	public static void main(String[]args) {
		Student1 s1=new Student1("mihir",1,9082832,21);
		s1.getName();
		s1.display();
	}

}
class Student1{
 private String name;
 private int id;
 private long mobileno;
 private int age;
 Student1(String n,int id,int mo,int age){
	 this.name=n;
	 this.id=id;
	 this.mobileno=mo;
	 this.age=age;
 }
 public String getName() {
	 return this.name;
 }
 public int getid() {
	 return this.id;
 }
 public long getmobile() {
	 return this.mobileno;
 }
 public int getage() {
	 return this.age;
 }
 public void display() {
	 System.out.println(this.name);
	 System.out.println(this.id);
	 System.out.println(this.mobileno);
	 System.out.println(this.age);
 }
  
}
