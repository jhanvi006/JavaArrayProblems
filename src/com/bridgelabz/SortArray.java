package com.bridgelabz;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 elements of array: ");
        for (int i=0; i<10; i++)
            arr[i] = sc.nextInt();
        System.out.println("Sorted array: ");
        int temp;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
