import java.util.Scanner;

public class Sub2 {
    public static void main(String[] args) {

        // declear scanner object
        Scanner scanner = new Scanner(System.in);

        // input number as fahrenheit
        System.out.println("Type temperature as Fahrenheit :");
        double tempFahrenheit = scanner.nextDouble();
        
        //close scanner to prevent resource leak
        scanner.close();

        // calculate && double => string
        String tempCelsius = String.valueOf((5.0 / 9.0) * (tempFahrenheit - 32));

        // output answer
        System.out.println("Temperature is " + tempCelsius + " \u00B0C");

    }
}