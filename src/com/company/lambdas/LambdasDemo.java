package com.company.lambdas;

import java.util.List;
import java.util.function.*;

public class LambdasDemo {
    public static void show(){
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;
        Integer finalOutput = increment.andThen(square).apply(1);
        System.out.println(finalOutput);
    }
}
