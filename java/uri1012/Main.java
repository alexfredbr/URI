/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author frede
 */
public class Main {

    public static void main(String[] args) {
        double A,B,C;
        Scanner scan = new Scanner(System.in);
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        System.out.printf("TRIANGULO: %.3f\n",A*C/2);
        System.out.printf("CIRCULO: %.3f\n",3.14159*C*C);
        System.out.printf("TRAPEZIO: %.3f\n",(A+B)/2*C);
        System.out.printf("QUADRADO: %.3f\n",B*B);
        System.out.printf("RETANGULO: %.3f\n",A*B);
    }
    
}
