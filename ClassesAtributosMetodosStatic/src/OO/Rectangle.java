package OO;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double Area() {
		return this.width*this.height;
	}
	
	public double Perimeter() {
		return 2*(this.height+this.width);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2)); 
	}

	@Override
	public String toString() {
		return "AREA = " + Area() + "\nPERIMETRO = " + Perimeter() + "\nDIAGONAL = " + Diagonal();
	}

	
	
}
