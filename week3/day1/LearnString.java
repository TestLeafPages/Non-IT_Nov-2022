package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		//String Literal
		String name="Test leaf"; 
		String input="TestLeaf";
		//new keyword
       String obj=new String("Testleaf");
       //compare the string reference
       if(name==input) {
    	   System.out.println("True");
       }
       else {
    	   System.out.println("False");
       }
       //compare the two string
       //equal()  equalsIgnorecase
       if(name.equals(input)) {
    	   System.out.println("True");
       }
       else {
    	   System.out.println("False");
       }
       if(name.equalsIgnoreCase(input)) {
    	   System.out.println("True");
       }
       else {
    	   System.out.println("False");
       }
       //text="no record"
       System.out.println(name.contains("leaf"));
       //length()
       int len = name.length();
       System.out.println(len);
       //convert string charArray
       char[] ch = name.toCharArray();   
       System.out.println(ch);
       //indexOf()
       int indexOf = name.indexOf('l');
       System.out.println(indexOf);
       //charAt()
       System.out.println(name.charAt(6));
       String str="Testleaf is located in chennai";//index 0-4 5
       
       String[] split = str.split(" ");
       
       for (int i = 0; i < split.length; i++) {

       
       System.out.println(split[i]);
       
       }
       for (int i = split.length-1 ; i >=0 ; i--) {
    	   System.out.print(split[i]+" ");//
    	   
	}
       System.out.println(name.concat(input));
       
	}

}
