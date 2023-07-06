import java.util.Scanner;
public class No6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number of columns and rows:");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        for (int i = 1;i<=row;i++){
            for(int j = 1 ; j<=col;j++){
                System.out.print(i*j+" ");
            }
            System.out.print("\n");
        }
    }
}
