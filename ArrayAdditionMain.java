/************************************************************************************
	JAVA PROGRAM TO ADD THE TWO ARRAYS
	SAMPLE INPUT: ARRAY1: {2,3,4}
				  ARRAY2: {3,4,5}
		  OUTPUT: ANSWER: {5,7,9}
		  
		  AUTHOR: DHEVENDHIRAN M
		  DATE: 12.01.2018
**************************************************************************************/
package Array;

import java.util.Scanner;

public class ArrayAdditionMain {

	public static void main(String[] args) {
		
		int firstArr[] = new int[10];
		int secondArr[] = new int[10];
		int n1,i;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter the number of elements in first array:");
		n1=scan.nextInt();
		
		System.out.println("\nEnter the elements of the array:");
		for(i=0;i<n1;i++) {
			firstArr[i] = scan.nextInt();
		}
		
		System.out.println("\nEnter the elements of the second array:");
		for(i=0;i<n1;i++) {
			secondArr[i]=scan.nextInt();
		}
		
		System.out.println("\nThe Addition of the arrays are:");
		for(i=0;i<n1;i++) {
			int ans = firstArr[i] + secondArr[i];
			System.out.println("\n"+ans);
		}

	}

}
