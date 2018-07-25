package com.stevenprogramming.java8.stream;

import java.util.IntSummaryStatistics;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamSample {

    private static final Logger LOGGER = Logger.getLogger( IntStreamSample.class.getName() );

    public void printValuesInstStream(Stream values) {
        long startTime = System.nanoTime();
        values.forEach(valor -> System.out.printf("%d::", valor));
        LOGGER.info("**************************************************************");
        long endTime = System.nanoTime();
    }

    public void printValues(int[] values) {
        LOGGER.info("**************************** printValues  **********************************");
        long startTime = System.nanoTime();
        IntStream.of(values).forEach(valor -> System.out.printf("%d::", valor));
        long endTime = System.nanoTime();
    }

    public void printCount(int[] values) {
        long startTime = System.nanoTime();
        LOGGER.info("%nCount: " + IntStream.of(values).count());
        long endTime = System.nanoTime();
    }

    public void printMin(int[] values) {
        long startTime = System.nanoTime();
        LOGGER.info("Min: " + IntStream.of(values).min().getAsInt());
        long endTime = System.nanoTime();
    }

    public void printMax(int[] values) {
        long startTime = System.nanoTime();
        LOGGER.info("Max: " + IntStream.of(values).max().getAsInt());
        long endTime = System.nanoTime();
    }

    public void printSum(int[] values) {
        long startTime = System.nanoTime();
        LOGGER.info("Sum: " + IntStream.of(values).sum());
        long endTime = System.nanoTime();
    }

    public void printAverage(int[] values) {
        long startTime = System.nanoTime();
        LOGGER.info("Average: " + IntStream.of(values).average().getAsDouble());
        long endTime = System.nanoTime();
    }

    public void printStatistics(int[] values) {
        long startTime = System.nanoTime();
        IntSummaryStatistics intSummaryStatistics = IntStream.of(values).summaryStatistics();
        LOGGER.info("Statistics >>> " + intSummaryStatistics.toString());
        long endTime = System.nanoTime();
    }

    public void printSumReduce(int[] values){
        long startTime = System.nanoTime();
        LOGGER.info("Suma de cuadrados mediante el metodo reduce " +
                IntStream.of(values)
                        .reduce(0, (x, y) -> x + y * y));
        long endTime = System.nanoTime();
    }

    public void printOperations1(int[] values){
        IntStream.of(values)
                .map(valor -> valor * 10)
                //.filter(valor -> valor % 2 != 0)
                .sorted()
                .forEach(valor -> System.out.printf("\nprintOperations1  %d ", valor));
    }

    public void printOperations2(int[] values){
        IntStream.of(values)
                .filter(valor -> valor % 2 != 0)
                .map(valor -> valor * 10)
                .sorted()
                .forEach(valor -> System.out.printf("\nprintOperations2  %d ", valor));
    }

    public void sample() {
        int[] values = {1, 11, 16, 3, 4, 8, 2, 5, 19, 27};
        int[] values2 = {21, 11, 16, 3, 14, 18, 2, 5, 19, 21};
        printValuesInstStream(IntStream.range(0, 20).boxed());

        printValues(values);
        printValues(values2);

        printCount(values);
        printCount(values2);

        printMin(values);
        printMin(values2);

        printMax(values);
        printMax(values2);

        printSum(values);
        printSum(values2);

        printOperations1(values);
        printOperations2(values);

        printOperations1(values2);
        printOperations2(values2);

        printSumReduce(values);
        printAverage(values);
        printStatistics(values);

        printSumReduce(values2);
        printAverage(values2);
        printStatistics(values2);


    }
}
