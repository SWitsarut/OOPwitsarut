import java.util.Scanner;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        String str;
        do {

            str = scanner.nextLine();
            switch (str.charAt(0)) {
                case '1':
                    PrintArray(arr);
                    break;
                case '2':
                    delStar(arr);
                    PrintArray(arr);
                    break;
                case '3':
                    arr = retArrayNoStar(arr);
                    PrintArray(arr);
                default:
                    arr.add(str);
                    arr.add("*");
                    break;
            }
        } while (str != "exit()");
        scanner.close();
    }

    public static void PrintArray(ArrayList<String> arr) {
        System.out.println(arr.toString());
        System.out.println(arr);
    }

    public static void delStar(ArrayList<String> arr) {
        for (int i = 1; i < arr.size(); i++) {
            arr.remove(i);
        }
    }

    public static ArrayList<String> retArrayNoStar(ArrayList<String> arr) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != "*") {
                temp.add(arr.get(i));
            }
            arr.sort(null);
        }
        return temp;
    }
}