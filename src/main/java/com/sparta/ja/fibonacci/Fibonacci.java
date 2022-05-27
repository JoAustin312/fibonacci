package com.sparta.ja.fibonacci;

import java.util.ArrayList;

public class Fibonacci {

    public static int getFibonacciNumberAtIndex(Integer indexInSequence) {

        if (indexInSequence != null && indexInSequence >= 0){
            if (indexInSequence == 1) return 0;
            if (indexInSequence == 2) return 1;

            return (getFibonacciNumberAtIndex(indexInSequence-1) + getFibonacciNumberAtIndex(indexInSequence-2));

        }
        return 0;
    }

    public static ArrayList<Integer> getFibonacciSequence(Integer sequenceLength){
        ArrayList<Integer> arrayOfFibonacciNumbers = new ArrayList<>();
        if (sequenceLength > 0) {
            for (int i = 1; i <= sequenceLength; i++){
                arrayOfFibonacciNumbers.add(getFibonacciNumberAtIndex(i));
            }

        } else{
            arrayOfFibonacciNumbers.add(0);
        }
        return arrayOfFibonacciNumbers;
    }

}
