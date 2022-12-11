package week3.day1;

public class ReverseEvenWord {

	public static void main(String[] args) {
		//Classroom 2:
		//String input="Testleaf is located in chennai";
		//split
		//check if the word is odd or even(i%2==0)
		//if it is even reverse
		//print the result
		String input="Testleaf is located in chennai";
		String[] split = input.split(" ");//ctrl+2+l
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				char[] charArray = split[i].toCharArray();
				for (int j =charArray.length-1; j >=0 ; j--) {
					
					System.out.print(charArray[j]);
				}
			}
			else {
				System.out.print(split[i]);
			}
			System.out.print(" ");
		}

	}

}
