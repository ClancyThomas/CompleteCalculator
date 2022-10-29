import java.util.ArrayList;

public class BasicCalculator {

    private ArrayList<String> memory;

    public BasicCalculator() {
        memory = new ArrayList<>();
    }

    public double add(double num1, double num2) {
        memory.add(String.format("%.2f + %.2f = %.2f", num1, num2, num1+num2));
        return num1+num2;
    }

    public double subtract(double num1, double num2) {
        memory.add(String.format("%.2f - %.2f = %.2f", num1, num2, num1-num2));
        return num1-num2;
    }

    public double multiply(double num1, double num2) {
        memory.add(String.format("%.2f * %.2f = %.2f", num1, num2, num1*num2));
        return num1*num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            memory.add(String.format("%.2f / %.2f = %.2f", num1, num2, num1/num2));
            return num1 / num2;
        }
        memory.add(String.format("%.2f / %.2f = Error dividing by zero!", num1, num2));
        return 0.00;
    }

    public void printMemory() {
        for (String line: memory) {
            System.out.println(line);
        }
    }

}
