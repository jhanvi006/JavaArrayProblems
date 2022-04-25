package com.bridgelabz;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 elements of array: ");
        for (int i=0; i<10; i++)
            arr[i] = sc.nextInt();

        int firstLargest = arr[0], secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (firstLargest < arr[i]) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else
            if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("2nd largest element: "+secondLargest);

    }
}
