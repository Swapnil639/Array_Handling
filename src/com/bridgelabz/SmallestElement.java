package com.bridgelabz;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr={10,20,70,60,35,78,98,29};
        int small=arr[0];

        for (int i = 1; i <arr.length; i++) {
            if (arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}
