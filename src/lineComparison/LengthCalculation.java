package lineComparison;

import java.util.Scanner;

public class LengthCalculation {

	Scanner scanner = new Scanner(System.in);
	
	public double lengthcal(){
		System.out.println("Enter co-ordinates");
		System.out.println("Enter x1");
		int x1 = scanner.nextInt();
		System.out.println("Enter y1");
		int y1 = scanner.nextInt();
		System.out.println("Enter x2");
		int x2 = scanner.nextInt();
		System.out.println("Enter y2");
		int y2 = scanner.nextInt();
		
		double length =  Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		return length;
	}
}
