package com.bridgelabz;

public class EvenPosition {
    public static void main(String[] args) {
        int[] arr={10,20,70,60,35,78,98,29};

        System.out.print("Elements of an array present on even position: ");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
