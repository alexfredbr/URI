/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author frede
 */
public class Main {
    public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    int a, b, c;
    int maiorAB;
    
    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();
    
    maiorAB = (a + b + Math.abs(a-b))/2;
    maiorAB = (maiorAB + c + Math.abs(maiorAB-c))/2;
        System.out.print(maiorAB);
        System.out.println(" eh o maior");
    }
}
