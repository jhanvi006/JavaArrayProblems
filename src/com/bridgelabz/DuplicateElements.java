package com.bridgelabz;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 elements of array: ");
        for (int i=0; i<10; i++)
            arr[i] = sc.nextInt();
        System.out.println("Duplicate elements: ");
        for (int i=0; i< arr.length-1; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j])
                    System.out.print(arr[j]+" ");
            }
        }
    }
}
