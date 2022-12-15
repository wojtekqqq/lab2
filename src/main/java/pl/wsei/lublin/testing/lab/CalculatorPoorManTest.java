package pl.wsei.lublin.testing.lab;

public class CalculatorPoorManTest {

    public static void main(String[] args) {
        double result = Calculator.add(10, 50, 30);
        System.out.println("Test dodawania trzech liczb");
        if (result != 90) {
            System.out.printf("Zły wynik: %q zamiast %g %n",result, 90.0);
            System.out.println("Test nie przeszedł");
        } else {
            System.out.println("Wynik testu poprawny");
        }
    }
}
