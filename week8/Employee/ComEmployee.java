package Employee;

public class ComEmployee extends Employee{

	private double grossSale,ComRate;
	public ComEmployee(String firstname, String lastname, String id,double sales,double percent) {
		super(firstname, lastname, id);
		this.grossSale=sales;
		this.ComRate=percent;
	}

	@Override
	public double earning() {
		return grossSale*ComRate;
	}

	@Override
	public double bonus(int year) {
		if(year>5) {
			return 6*grossSale;
		}
		else {
			return 3*grossSale;
		}
	}
}
