import java.util.Scanner;
public class No5 {

	public static void main(String[] args) {
			System.out.println("No5");
			Scanner scanner = new Scanner(System.in);
			RoachPopulation peter = new RoachPopulation(scanner.nextInt());
			int time = scanner.nextInt();
			scanner.close();
			for(int i =0 ;i<time;i++) {
				peter.waitR();
				peter.spary();
			}
			System.out.println(peter.getRoaches());
		}

	}

class RoachPopulation{
	private int amount;
	public RoachPopulation(int init) {
		this.amount = init;
		
	}
	public void waitR(){
		this.amount = this.amount*2;
	}
	public void spary() {
		this.amount -= this.amount*0.1;
	}
	public int getRoaches(){
		return this.amount;
	}
}
