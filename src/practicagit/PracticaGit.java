/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit;

import java.util.Scanner;

/**
 *
 * @author ISTA
 */
public class PracticaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Suma de dos números");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Ingrese otro número: ");
        double num2 = sc.nextDouble();
        
        double result = num1 + num2;
        
        System.out.println("Resultado: " + result);
        System.out.println("Resultado: " + result);
    }
    
}
