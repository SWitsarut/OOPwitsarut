import java.util.ArrayList;
import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        ArrayList<Employee> arrayEarn = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Employee number " + (i + 1));
            System.out.print("enter firstname : ");
            String firstname = scanner.nextLine();
            System.out.print("enter lastname : ");
            String lastname = scanner.nextLine();
            System.out.print("enter id : ");
            String id = scanner.nextLine();
            System.out.print("enter salary : ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("enter year of work : ");
            int year = scanner.nextInt();
            scanner.nextLine();
            arrayEarn.add(new Employee(firstname, lastname, id, salary));
            arrayEarn.get(i).bonus(year);
        }
        scanner.close();
        printEmp(arrayEarn);
    }

    public static void printEmp(ArrayList<Employee> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}

class Employee {
    private String firstname;
    private String lastname;
    private String id;
    private double salary;

    private int year = 0;

    public Employee(String firstname, String lastname, String id, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.salary = salary;
    }

    public double earning() {
        return salary - (salary * 0.05);
    }

    public void bonus(int year) {
        this.year = year;
        System.out.println(caledBonus());
    }

    private double caledBonus() {
        if (this.year > 5) {
            return salary * 12;
        } else {
            return salary * 6;
        }
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + earning() + " " + caledBonus();
    }
}
