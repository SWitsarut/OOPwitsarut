package Employee;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(new ComEmployee("ComEmp","one","1",1000,0.1));
		arr.add(new ComEmployee("ComEmp","two","2",1000,0.5));
		arr.add(new SalariedEmployee("SalEmp","one","3",1000));
		arr.add(new SalariedEmployee("SalEmp","two","4",1000));
		printEmp(arr);
	}
	public static void printEmp(ArrayList<Employee> r) {
		double[] earn = new double[r.size()];
		double[] bonus = new double[r.size()];
		for(int i = 0;i<r.size();i++) {
			earn[i] = r.get(i).earning();
			bonus[i] = r.get(i).bonus(5);
		}
		System.out.println("firstname  lastname earning bonus");
		for(int i =0;i<r.size();i++) {
			System.out.println(r.get(i)+" "+earn[i]+" "+bonus[i]);
		}
	}

}
