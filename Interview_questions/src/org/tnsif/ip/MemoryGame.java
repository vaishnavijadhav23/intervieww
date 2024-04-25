package org.tnsif.ip;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemoryGame {

	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        // Input the elements of the array
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Input the number of queries
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        // Input the queries and count occurrences
        System.out.println("Enter the queries:");
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < q; i++) {
            int query = sc.nextInt();
            int count = 0;
            for (int number : numbers) {
                if (number == query) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Total occurrences of " + query + ": " + count);
            } else {
                System.out.println("NOT PRESENT");
            }
        }

        sc.close();
    }
}