package com.bridgelabz;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 elements of array: ");
        for (int i=0; i<10; i++)
            arr[i] = sc.nextInt();
        int largestNo = arr[0];

        for (int i=1; i< arr.length ; i++){
            if (arr[i]>largestNo)
                largestNo = arr[i];
        }
        System.out.println("Largest element in array is "+largestNo);
    }
}
