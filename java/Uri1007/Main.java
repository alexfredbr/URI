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
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int A,B,C,D,DIFERENCA;
    
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();
    DIFERENCA = (A*B-C*D);
        System.out.println("DIFERENCA = " + DIFERENCA);
    
    }
}
