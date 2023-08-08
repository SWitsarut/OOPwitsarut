import java.util.Scanner;

public class No6 {

	public static void main(String[] args) {

		System.out.println("No6 ");
		Scanner scanner = new Scanner(System.in);
		if (isPalindrom(scanner.nextLine())) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		scanner.close();
	}

	public static boolean isPalindrom(String input) {
		String phase = input.replaceAll("[' ]", "");
		boolean isPalin = true;
		int lastindex = phase.length() - 1;
		int size = (int) Math.floor(phase.length());
		for (int i = 0; i < size; i++) {
			if (phase.charAt(i) != phase.charAt(lastindex - i)) {
				isPalin = false;
				break;
			}
		}
		return isPalin;
	}

}
