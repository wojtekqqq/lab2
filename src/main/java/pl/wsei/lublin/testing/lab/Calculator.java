package pl.wsei.lublin.testing.lab;

import java.util.stream.DoubleStream;

public class Calculator {

    public static double add(double... operands) {
//        return subtract(operands);
        return DoubleStream.of(operands)
                .sum();


    }

    public static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    public static double subtract(double... operands) {
        double res = operands[0];
        for (int i = 1; i < operands.length; i++)
            res -= operands[i];
        return res;
    }
     public static double divide(double... operands) {
        double res = operands[0];
        for (int i = 1; i< operands.length; i++)
            res /= operands[i];
        return res;
     }
}
