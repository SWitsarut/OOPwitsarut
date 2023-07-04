import javax.swing.JOptionPane;

public class Sub1{
    public static void main(String[] args) {

        // input number as fahrenheit
        String input = JOptionPane.showInputDialog(null, "Temperature as Fahrenheit", "Input", JOptionPane.QUESTION_MESSAGE);
        double tempFahrenheit = Double.parseDouble(input);

        // calculate && double => string
        String tempCelsius = String.valueOf((5.0 / 9.0) * (tempFahrenheit - 32));
        
        // output answer
        JOptionPane.showMessageDialog(null,"Temperature is "+tempCelsius+" \u00B0C", "Temperature as Celcius", JOptionPane.PLAIN_MESSAGE);

    }
}