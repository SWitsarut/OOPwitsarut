package Employee;

public class SalariedEmployee extends Employee {

	private double salary;
	
	public SalariedEmployee(String firstname,String lastname,String id,double sal) {
		super(firstname,lastname,id);
		this.salary = sal;
	}
	@Override
	public double earning() {
		return salary-(salary*0.05);
	}

	@Override
	public double bonus(int year) {
		if(year>5) {
			return salary*12;
		}
		else {
			return salary*6;
		}
	}
}
