package com.stevenprogramming.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ArrayStreamSample {

    private static final Logger LOGGER = Logger.getLogger( ArrayStreamSample.class.getName() );

    public void sample() {
        Integer[] valores = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46,
        48, 50, 52, 54, 56, 58, 60, 62, 64, 66,68,70,72,74,76,78,80};




        System.out.printf("Original: %s%n", Arrays.asList(valores));

        System.out.printf("Ordered: %s %n",
                Arrays.stream(valores)
                        .sorted()
                        .collect(Collectors.toList()));

        List<Integer> mayorThan4 =
                Arrays.stream(valores)
                        .filter(value -> value > 4)
                        .collect(Collectors.toList());
        System.out.printf("Mayor than 4: %s%n", mayorThan4);

        List<Integer> numbers = Arrays.asList(valores);

        //Arrays.asList returns > java.util.Arrays.ArrayList
        //numbers.add(10000);  This would produce java.lang.UnsupportedOperationException

        long startTime = System.nanoTime();
        System.out.printf("Ordered mayor than 4: %s%n",
                numbers.stream()
                        .sorted()
                        .collect(Collectors.toList()));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1 000 000 to get milliseconds.
        LOGGER.info("Duration Method >>>> List Stream <<<< " + String.valueOf(duration/1000));


         startTime = System.nanoTime();
       System.out.printf("Ordered mayor than 4: %s%n",
                Arrays.stream(valores)
                        .filter(value -> value > 4)
                        .sorted()
                        .collect(Collectors.toList()));
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1 000 000 to get milliseconds.
        LOGGER.info("Duration Method >>>> Arrays Stream <<<< " + String.valueOf(duration/1000));


        startTime = System.nanoTime();
        System.out.printf("mayor than 4 (asc with Streams): %s%n",
                mayorThan4.stream()
                        .sorted()
                        .collect(Collectors.toList()));
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1 000 000 to get milliseconds.
        LOGGER.info("Duration Method >>>> List Reduce Stream <<<< " + String.valueOf(duration/100000));

        startTime = System.nanoTime();
        System.out.printf("mayor than 4 (asc with Streams): %s%n",
                Arrays.asList(valores).stream()
                       // .filter(value -> value > 4)
                        .sorted()
                        .collect(Collectors.toList()));
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1 000 000 to get milliseconds.
        LOGGER.info("Duration Method >>>> List Stream <<<< " + String.valueOf(duration/100000));



    }
}
