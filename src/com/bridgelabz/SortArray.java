package com.bridgelabz;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={10,20,70,60,35,78,98,29};
        int temp;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
