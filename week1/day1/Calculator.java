package week1.day1;

public class Calculator {
	
	
	//add and sub
	
	public int add(int a,int b) {
		int c=a+b;
		//System.out.println(c);
		return c;
	}
		 
	
	
	

	public static void main(String[] args) {
		Calculator fun=new Calculator();
		 int add = fun.add(20,30);
		 System.out.println(add);

	}

}
