import java.util.Scanner;
import java.lang.Math;
public class No7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input x,n:");
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0;i<=n;i++){
            sum += Math.pow(x,i);
        }
        scanner.close();
        System.out.println(sum);
    }
}
