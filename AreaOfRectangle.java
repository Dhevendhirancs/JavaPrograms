package gitHub;

import java.util.Scanner;

public class AreaOfRectangle {
	private static float base,height,area;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		getInputs();
		calArea();
		printArea();
	}
	
	private static void getInputs() {
		System.out.println("Enter the Base of Rectangle:");
		base=scan.nextFloat();
		System.out.println("Enter the Height of the Rectangle:");
		height=scan.nextFloat();
	}
	
	private static void calArea() {
		area=(float) (0.5*base*height);
	}
	
	private static void printArea() {
		System.out.println("The Area of Rectangle: "+area);
	}

}
