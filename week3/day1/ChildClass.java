package week3.day1;

public class ChildClass extends Father  {

	public void child() {
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.child();
		obj.fatherHouse();
		obj.oneHouse();
		obj.twoHouse();

	}

}
