package com.bridgelabz;

public class FrequencyElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 7};
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }
        System.out.println("Frequency of each element in the array: ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != -1) {
                System.out.println(arr[i] + " : " + freq[i] + " times");
            }
        }
    }
}
