package com.bridgelabz;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] arr={10,20,70,60,35,78,98,29};

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+",");
        }
    }
}
