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
    double A,B,MEDIA;
    
    A= sc.nextDouble();
    B= sc.nextDouble();
    
    MEDIA = A*3.5/11 + B*7.5/11;
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    
    }
}
