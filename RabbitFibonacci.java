/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fibonacci;

/**
 *
 * @author Dulnith
 */

public class RabbitFibonacci {
    public static int rabbitPairs(int months) {
        if (months == 0) return 0; // No rabbits at start
        if (months == 1) return 1; // One pair at month 1
        return rabbitPairs(months - 1) + rabbitPairs(months - 2);
    }

    public static void main(String[] args) {
        int months = 12;
        System.out.println("Number of rabbit pairs after " + months + " months is " + rabbitPairs(months));
    }
}

