import java.util.Scanner;

public class No6 {

    public static void main(String[] args) {
        SavingAccount[] SavingAccs = new SavingAccount[2];
        Scanner scanner = new Scanner(System.in);
        {
            System.out.print("input (Saving Account) account " + " id: ");
            int id = scanner.nextInt();
            System.out.print("input (Saving Account) account " + " Balance: ");
            double balance = scanner.nextDouble();
            System.out.print("input (Saving Account) account " + " Annual rate: ");
            double annual = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("input (Saving Account) account " + " name: ");
            String name = scanner.nextLine();
            System.out.print("input (Saving Account) account " + " surname: ");
            String surname = scanner.nextLine();
            System.out.print("input (Saving Account) account " + " age: ");
            int age = scanner.nextInt();
            System.out.print("input (Saving Account) account " + " birth day: ");
            int day = scanner.nextInt();
            System.out.print("input (Saving Account) account " + " birth month: ");
            int month = scanner.nextInt();
            System.out.print("input (Saving Account) account " + " birth year: ");
            int year = scanner.nextInt();
            System.out.print("input (Saving Account) account " + " account created day: ");
            int Cday = scanner.nextInt();
            System.out.print("input (Saving Account) account " + " account created month: ");
            int Cmonth = scanner.nextInt();
            System.out.print("input (Saving Account) account " + " account created year: ");
            int Cyear = scanner.nextInt();
            SavingAccs[0] = new SavingAccount(id, balance, new Date(Cday, Cmonth, Cyear),
                    new Person(name, surname, new Date(day, month, year), age), annual);
        }
        SavingAccs[1] = new SavingAccount(1100, 20000,
                new Date(10, 9, 65),
                new Person("Lalisa", "Manoban"), 4.5);
        SavingAccs[0].withdraw(2500);
        SavingAccs[0].deposit(3000);
        SavingAccs[0].tranferMoney(SavingAccs[1], 2000);
        System.out.println(SavingAccs[0]);
        System.out.println(SavingAccs[1]);

        System.out.println(SavingAccs[0].getMonthlyInterest());
        FixAccount fixacc;
        {
            System.out.print("input (Fix Account) account " + " id: ");
            int id = scanner.nextInt();
            System.out.print("input (Fix Account) account " + " Balance: ");
            double balance = scanner.nextDouble();
            System.out.print("input (Fix Account) account " + " Annual rate: ");
            double annual = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("input (Fix Account) account " + " name: ");
            String name = scanner.nextLine();
            System.out.print("input (Fix Account) account " + " surname: ");
            String surname = scanner.nextLine();
            System.out.print("input (Fix Account) account " + " age: ");
            int age = scanner.nextInt();
            System.out.print("input (Fix Account) account " + " birth day: ");
            int day = scanner.nextInt();
            System.out.print("input (Fix Account) account " + " birth month: ");
            int month = scanner.nextInt();
            System.out.print("input (Fix Account) account " + " birth year: ");
            int year = scanner.nextInt();
            System.out.print("input (Fix Account) account " + " account created day: ");
            int Cday = scanner.nextInt();
            System.out.print("input (Fix Account) account " + " account created month: ");
            int Cmonth = scanner.nextInt();
            System.out.print("input (Fix Account) account " + " account created year: ");
            int Cyear = scanner.nextInt();
            fixacc = new FixAccount(id, balance, new Date(Cday, Cmonth, Cyear),
                    new Person(name, surname, new Date(day, month, year), age), annual);
        }
        fixacc.withdraw(2500);
        fixacc.deposit(3000);
        fixacc.tranferMoney(SavingAccs[1], 0);
        scanner.close();

    }
}

class NewAccount extends Account {
    private Date dateCreate;
    private Person objPerson;

    public Date getDateCreate() {
        return dateCreate;
    }

    NewAccount() {
        dateCreate = new Date();
        objPerson = new Person();
    }

    NewAccount(int id, double balance, Date dateCreated, Person person) {
        super(id, balance);
        this.dateCreate = dateCreated;
        this.objPerson = person;
    }

    public void tranferMoney(NewAccount targetAcc, double amount) {
        System.out.println(this.objPerson.getName() + " " + this.objPerson.getSurname() + " has transfer " + amount
                + "\nto " + targetAcc.objPerson.getName() + " " + targetAcc.objPerson.getSurname());
        super.withdraw(amount);
        targetAcc.deposit(amount);
    }

    @Override
    public double getMonthlyInterest() {
        Date today = new Date(5, 9, 66);
        Date tempDate = new Date(dateCreate.getDay(), dateCreate.getMonth(), dateCreate.getYear());
        int numMonth = 0;
        while (tempDate.getMonth() != today.getMonth() || today.getYear() != tempDate.getYear()) {
            numMonth++;
            if (tempDate.getMonth() == 12) {
                tempDate.setYear(tempDate.getYear() + 1);
                tempDate.setMonth(1);
            } else {
                tempDate.setMonth(tempDate.getMonth() + 1);
            }
        }
        return super.getMonthlyInterestRate() * super.getBalance() * numMonth;
    }

    @Override
    public String toString() {
        return "id = " + super.getId() + " balance = " + super.getBalance() + " created by " + this.objPerson.getName()
                + " "
                + this.objPerson.getSurname() + "\nCreate at " + dateCreate.getDay() + "/" + dateCreate.getMonth() + "/"
                + dateCreate.getYear();
    }

}

class SavingAccount extends NewAccount {
    @Override
    public void tranferMoney(NewAccount acc1, double amount) {
        super.withdraw(amount + 20);
        acc1.deposit(amount);
    }

    SavingAccount() {
    }

    SavingAccount(int id, double balance, Date dateCreated, Person person, double annual) {
        super(id, balance, dateCreated, person);
        super.setAnnualInterestRate(annual / 100);
    }

}

class FixAccount extends NewAccount {
    @Override
    public void tranferMoney(NewAccount acc1, double amount) {
        System.out.println("Sorry fix account is unable to transfer money");
    }

    FixAccount() {
    }

    FixAccount(int id, double balance, Date dateCreated, Person person, double annual) {
        super(id, balance, dateCreated, person);
        super.setAnnualInterestRate(annual);
    }

    @Override
    public void withdraw(double amount) {
        Date today = new Date(5, 9, 66);
        Date tempDate = new Date(super.getDateCreate().getDay(), super.getDateCreate().getMonth(),
                super.getDateCreate().getYear());
        int numMonth = 0;
        while (tempDate.getMonth() != today.getMonth() || today.getYear() != tempDate.getYear()) {
            numMonth++;
            if (tempDate.getMonth() == 12) {
                tempDate.setYear(tempDate.getYear() + 1);
                tempDate.setMonth(1);
            } else {
                tempDate.setMonth(tempDate.getMonth() + 1);
            }
        }
        if (numMonth >= 12) {
            super.withdraw(amount);
        } else {
            System.out.println("ต้องอายุบัญชีต้องมากกว่าหรือเท่ากับ 1 ปี");
        }
    }

}

class Person {
    private String name, surname;
    int age;
    Date bDate;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    Person() {
    }

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Person(String name, String surname, Date bDate, int age) {
        this.name = name;
        this.surname = surname;
        this.bDate = bDate;
        this.age = age;
    }
}

class Date {
    private int day;
    private int month;
    private int year;

    Date() {

    }

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    // constructor
    public Account() {
        annualInterestRate = 0.045;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.045;
    }

    // get
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    // set
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annual) {
        this.annualInterestRate = annual;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

}
