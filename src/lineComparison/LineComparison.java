package lineComparison;

public class LineComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to line comparison program");
		LengthCalculation lc = new LengthCalculation();
		double length = lc.lengthcal();
		System.out.println("Length of the line using the coordinates is "+length);

	}

}
