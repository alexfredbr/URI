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
    int inteiro1,inteiro2,PROD;
    
    inteiro1 = sc.nextInt();
    inteiro2 = sc.nextInt();
    PROD = inteiro1*inteiro2;
    
    System.out.println("PROD = "+PROD);
    }
}
