/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;

/**
 *
 * @author Dulnith
 */
import java.util.Arrays;

public class InsertionSort {
    
    static Integer[] array = {5, 2, 4, 6, 1, 3}; // Array to be sorted
    static int outerIndex; // Instance variable, if needed for further logic
    
    // Swaps two elements in the array
    public static void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    // Inserts the element at endIndex into its correct position
    public static void insert(int endIndex) {
        int i = endIndex;
        
        while (i > 0 && array[i] < array[i - 1]) {
            swap(i, i - 1);
            System.out.println("i: " + i + ", j: " + (i - 1) + ", Array State: " + Arrays.deepToString(array));
            i--;
        }
    }
    
    // Sorts the array using the insertion sort algorithm
    public static void insertionSort() {
        for (int i = 1; i < array.length; i++) {
            insert(i);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Initial Array: " + Arrays.deepToString(array));
        insertionSort();
        System.out.println("Sorted Array: " + Arrays.deepToString(array));
    }
}