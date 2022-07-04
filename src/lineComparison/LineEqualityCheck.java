package lineComparison;

public class LineEqualityCheck {
	
	double length1;
	double length2;
	
	public LineEqualityCheck(double length1, double length2){
		this.length1 = length1;
		this.length2 = length2;
	}

	public void check(){
		if(length1 == length2)
			System.out.println("Lines are equal");
		else
			System.out.println("Lines are not equal");
	}
}
