/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;

/**
 *
 * @author Dulnith
 */
public class FindFactorial {
    public static int Factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * Factorial(n - 1); // Corrected the method name
    }

    public static void main(String[] args) {
        int result = Factorial(5); // Corrected the method name
        System.out.println("Factorial is " + result);
    }
}
