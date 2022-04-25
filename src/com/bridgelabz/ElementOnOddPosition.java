package com.bridgelabz;

import java.util.Scanner;

public class ElementOnOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 elements of array: ");
        for (int i=0; i<10; i++)
            arr[i] = sc.nextInt();
        System.out.println("Elements on odd position are ");
        for (int i=0; i<10; i++){
            if (i%2 == 0)
                System.out.print(arr[i]+" ");
        }
    }
}
