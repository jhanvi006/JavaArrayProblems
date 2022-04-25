package com.bridgelabz;

public class ArrayElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 1, 4, 9, 3, 1, 9, 4};
        int[] freq = new int[arr.length];
        int visited = -1;

        for (int i=0; i< arr.length; i++){
            int count = 1;
            for (int j=i+1; j< arr.length; j++){
                /* if duplicate is found */
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited; /* to avoid counting same element */
                }
            }
            if (freq[i]!=visited)
                freq[i] = count;
        }
        for (int i=0; i< freq.length; i++){
            if(freq[i] != visited)
                System.out.println(arr[i]+" - "+freq[i]);
        }
    }
}
