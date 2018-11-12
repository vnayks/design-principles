package TemplateAndStrategy.template.impl;

public class Main {

    public static void main(String[] args){
        IntBubbleSorterImpl bubbleSorter = new IntBubbleSorterImpl();
        int[] arr = new int[]{11,3,23,23,141,0,-234,2315};
        bubbleSorter.setNums(arr);
        int[] sortedArray = bubbleSorter.sort();

        for(int i=0;i<sortedArray.length;i++){
            System.out.print(sortedArray[i] + " ");
        }

        DoubleBubbleSorterImpl doubleBubbleSorter = new DoubleBubbleSorterImpl();
        double[] arr1 = new double[]{11.23,3.32,23.0,23.1,141.123,0,-234.123,2315.123};
        doubleBubbleSorter.setNums(arr1);
        double[] sortedArray1 = doubleBubbleSorter.sort();

        System.out.println("double array");
        for(int i=0;i<sortedArray1.length;i++){
            System.out.print(sortedArray1[i] + " ");
        }

    }

}
