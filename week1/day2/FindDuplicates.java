package week1.day2;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[] marks= {75,35,67,90,100,56,75,100};
		//condition to compare two values
		//marks[0]==marks[1],marks[2],marks[3]
		//marks[i]==marks[2],marks[3]

		Arrays.sort(marks);
		for(int i=0;i<marks.length;i++) {
			
			for(int j=i+1;j<marks.length;j++) {				
				
			if(marks[i]==marks[j]) {
				
				System.out.println(marks[i]);
			}
		}
		}
		
		
		
	}

}
