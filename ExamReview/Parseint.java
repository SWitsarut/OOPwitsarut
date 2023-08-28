import java.util.Scanner;

public class Parseint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        scanner.close();
        System.out.println(str);
        int[] arr = new int[2];
        for (int i : arr) {
            System.out.println(i);
        }
        Std std = new Std();
        std.id = "100";
        std.name = "Say Gex";
        System.out.println(std);
    }
}

class Std {
    String name, id;

    @Override
    public String toString() {
        return "name: " + name + " id: " + id;
    }
}