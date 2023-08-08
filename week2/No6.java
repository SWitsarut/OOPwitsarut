import java.util.Date;
public class No6 {

	public static void main(String[] args) {
		Account acc1 = new Account(1122,20000);
		acc1.setAnnualInterestRate(0.045);
		acc1.withdraw(2500);
		acc1.deposit(3000);
		System.out.println(acc1.getBalance());
		System.out.println(acc1.getMonthlyInterest());

	}

}

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	//constructor
	public Account(){
	}
	public Account(int id,double balance) {
		this.id = id;
		this.balance = balance;
	}	
	
	//get
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	
	//set
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annual) {
		this.annualInterestRate = annual;
	}
	public void setDateCreated(Date date) {
		this.dateCreated = date;
	}
	
	
	public double getMonthlyInterestRate() {
		return this.annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate()*balance;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	
}
