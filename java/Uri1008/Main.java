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
    Scanner sc = new Scanner (System.in);
    int number,hours;
    double amount, salary;
    
    number = sc.nextInt();
    hours = sc.nextInt();
    amount = sc.nextDouble();
    
    salary = amount * hours;
    
        System.out.println("NUMBER = "+ number);
        System.out.printf("SALARY = U$ %.2f\n",salary);
        
    
    }
}
