package OO;


public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary-this.tax;
	}
	
	public void increaseSalary(double percent) {
		this.grossSalary = netSalary() + this.grossSalary* percent/100;
	}
	
	public String toString() {
		return this.name + ", $" + String.format("%.2f", netSalary());
	}
	
}
