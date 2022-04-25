package com.bridgelabz;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 elements of array: ");
        for (int i=0; i<10; i++)
            arr[i] = sc.nextInt();
        System.out.println("Reverse array: ");
        for (int i=arr.length-1; i>=0; i--)
            System.out.print(arr[i]+" ");
    }
}
