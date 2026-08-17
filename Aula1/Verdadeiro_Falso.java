package main;

import java.util.Scanner;

public class Verdadeiro_Falso {

	 public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        System.out.println("Digite true ou false para a primeira variável:");
	        boolean valor1 = scan.nextBoolean();

	        System.out.println("Digite true ou false para a segunda variável:");
	        boolean valor2 = scan.nextBoolean();

	        System.out.println("Digite true ou false para a terceira variável:");
	        boolean valor3 = scan.nextBoolean();

	        if (valor1) {
	            System.out.println("A primeira variável é verdadeira.");
	        } else {
	            System.out.println("A primeira variável é falsa.");
	        }

	        if (valor2) {
	            System.out.println("A segunda variável é verdadeira.");
	        } else {
	            System.out.println("A segunda variável é falsa.");
	        }

	        if (valor3) {
	            System.out.println("A terceira variável é verdadeira.");
	        } else {
	            System.out.println("A terceira variável é falsa.");
	        }

	        scan.close();
	    }
	}