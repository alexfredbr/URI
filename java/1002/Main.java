/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double r, a;
		Scanner scanner = new Scanner(System.in);

		r = scanner.nextDouble();
		a = r * r * 3.14159;
		System.out.printf("A=%.4f\n",a);
	}

}
