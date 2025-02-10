/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;

/**
 *
 * @author Dulnith
 */
public class RecursionApplication {
    static void towerOfHanoi(char source_rod, char destination_rod, char auxiliary_rod, int n) {
        if (n == 1) {
            System.out.println("Move disk from " + source_rod + " to " + destination_rod);
            return;
        }
        towerOfHanoi(source_rod, auxiliary_rod, destination_rod, n - 1);
        System.out.println("Move disk from " + source_rod + " to " + destination_rod);
        towerOfHanoi(auxiliary_rod, destination_rod, source_rod, n - 1);
    }

    public static void main(String args[]) {
        int noOfDisks = 4;
        towerOfHanoi('A', 'B', 'C', noOfDisks);
    }
}