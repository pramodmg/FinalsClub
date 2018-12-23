package main.sorting;

import java.util.Arrays;
import java.util.Collections;

public class CollectionSort {


    public static void main(String[] args) {
     callMeMaybe();
    }

    private static void callMeMaybe() {

        Integer[] testSet = new Integer[25];

        for (int i = 0; i < 25; i++) {
            Double sample = Math.random();
            //System.out.println("===== sample.intValue() ==== "+ sample);
            sample = sample * 100;
            testSet[i] =  sample.intValue() ;
            //System.out.println("======= random number picked is ========== " + testSet[i]);
        }

        System.out.println("Size : "+ testSet.length);

        for (int i = 0; i <  testSet.length; i++) {
            System.out.println(" Random List @ I= "+i+", Value = "+ testSet[i]);
        }

        System.out.println("########### Before Sort ###########");
        Collections.sort(Arrays.asList(testSet));
        System.out.println("########### After Sort ###########");

        for (int i = 0; i <  testSet.length; i++) {
            System.out.println(" Random List @ I= "+i+", Value = "+ testSet[i]);
        }

    }
}
