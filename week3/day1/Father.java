package week3.day1;

public class Father extends GrandParent {
	public void fatherHouse() {
		System.out.println("father house");
	}
public static void main(String[] args) {
	Father obj=new Father();
	obj.fatherHouse();
	obj.oneHouse();
	obj.twoHouse();
}
}
