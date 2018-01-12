/**********************************************************************************
 * JAVA PROGRAM TO IMPLEMENT INSERTION SORT
 * 
 * AUTHOR: DHEVENDHIRAN M
 * DATE: 12.01.2018
 **********************************************************************************/

package gitHub;

import java.util.Scanner;

public class InsertionSort {
	private static int array[]=new int[20];
	private static int i,j,n,empty,temp;
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		getArray();
		insertionSort();
		printArray();
	}
	
	private static void getArray() {
		System.out.println("Enter the number of elements:");
		n=scan.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
			array[i]=scan.nextInt();
	}
	
	private static void insertionSort() {
		for(i=1;i<n;i++) {
			temp=array[i];
			empty=i;
			for(j=i-1;j>=0;j--)
					if(array[j]>temp) {
						array[j+1]=array[j];
						empty=j;
					}
			array[empty]=temp;
		}
	}
	
	private static void printArray() {
		System.out.print("The Sorted array is: ");
		for(i=0;i<n;i++)
			System.out.print(array[i]+" ");
	}
}
