package com.demo.test;

public class MissingElememt {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 9}; // Given array with missing elements

        System.out.println("Missing elements in the array:");

        // Iterate through the array to find missing elements
        for (int i = 0; i < array.length -1; i++) {
            int current = array[i];
           // System.out.println(current);
            int next = array[i + 1];
            System.out.println(next);

            // Check if there is a gap between consecutive elements
            while (next - current > 1) {
               // System.out.println(++current); // Print the missing element
            }
        }
    }
}

