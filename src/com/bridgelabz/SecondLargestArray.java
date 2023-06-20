package com.bridgelabz;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] arr={10,20,70,60,35,78,98,29};
        int smallest = arr[0];

        for (int i=0; i <arr.length; i++){
            if(arr[i] < smallest)
                smallest = arr[i];
        }

        int sec_smallest = Integer.MAX_VALUE;


        for (int i=0; i <arr.length; i++){
            if(arr[i] != smallest && arr[i] < sec_smallest)
                sec_smallest = arr[i];
        }
        System.out.println("Second largest element is :"+sec_smallest);
    }
}
