package lineComparison;

public class LineComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to line comparison program");
		LengthCalculation lc = new LengthCalculation();
		System.out.println("Enter values for first line");
		double length1 = lc.lengthcal();
		System.out.println("Enter values for second line");
		double length2 = lc.lengthcal();
		
		LineEqualityCheck check = new LineEqualityCheck(length1, length2);
		check.check();

	}

}
