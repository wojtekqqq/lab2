package pl.wsei.lublin.testing.lab;

public class CalculatorPoorManTest {

    private int numberOfFailures;
    private int numbersOfTests;

    public void testAdd() {
        double result = Calculator.add(10,50,30);
        if (result != 90) {
            throw new IllegalStateException("Zły wynik: " + result + " zamiast 90");
        }
    }

    public static void main(String[] args) {
        CalculatorPoorManTest test = new CalculatorPoorManTest();
        try {
            test.numbersOfTests++;
            System.out.println("Test dodawania trzech liczb");
            test.testAdd();
            System.out.println("Wynik testu poprawny");
        } catch (Throwable e) {
            System.out.println("Test nie przeszedł");
            test.numberOfFailures++;
            e.printStackTrace();
        }
        // ... więcej wywołań metod testujących

        if (test.numberOfFailures > 0) {
            throw new IllegalStateException("Liczba wykonanych testów: " + test.numbersOfTests
            + ", liczba testów zakończonych sukcesem: " + (test.numbersOfTests - test.numberOfFailures)
            + ", liczba testów zakończonych porażką: " + test.numberOfFailures);

        }















//        double result = Calculator.add(10, 50, 30);
//        System.out.println("Test dodawania trzech liczb");
//        if (result != 90) {
//            System.out.printf("Zły wynik: %g zamiast %g %n",result, 90.0);
//            System.out.println("Test nie przeszedł");
//        } else {
//            System.out.println("Wynik testu poprawny");
//        }
    }
}
