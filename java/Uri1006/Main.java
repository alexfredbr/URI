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
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A,B,C,MEDIA;
    
    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();
    MEDIA = A*2/10 + B*3/10 + C*5/10;
    
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
