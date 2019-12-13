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
    int X;
    float Y, total;
    
    Scanner scan = new Scanner (System.in);
    X = scan.nextInt();
    Y = scan.nextFloat();
    total = X/Y;
    
        System.out.printf("%.3f km/l\n",total);
    
    }
}
