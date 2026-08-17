package main;

import java.util.Scanner;

public class Operacoes_Basicas {

    public static void main(String[] args) {
        System.out.println("Escolha qual operação você quer fazer:");
        Scanner scan = new Scanner(System.in);

        String opcao = scan.nextLine();

        if (opcao.equals("soma")) {

            System.out.println("Digite o primeiro valor");
            int numero_um = scan.nextInt();

            System.out.println("Digite o segundo valor");
            int numero_dois = scan.nextInt();

            int soma = numero_um + numero_dois;

            System.out.println("O resultado é: " + soma);
        }
        
        if(opcao.equals("subtracao")) {
        	
        	System.out.println("Digite o primeiro valor");
            int numero_um= scan.nextInt();

            System.out.println("Digite o segundo valor");
            int numero_dois = scan.nextInt();

            int soma = (numero_um - numero_dois);

            System.out.println("O resultado é: " + soma);
            
        }
        
        if(opcao.equals("multiplicacao")) {
        	
        	System.out.println("Digite o primeiro valor");
            int numero_um= scan.nextInt();

            System.out.println("Digite o segundo valor");
            int numero_dois = scan.nextInt();

            int soma = (numero_um * numero_dois);

            System.out.println("O resultado é: " + soma);
            
        }
        
        if(opcao.equals("divisao")) {
        	
        	System.out.println("Digite o primeiro valor");
            int numero_um= scan.nextInt();

            System.out.println("Digite o segundo valor");
            int numero_dois = scan.nextInt();

            int soma = (numero_um / numero_dois);

            System.out.println("O resultado é: " + soma);
            
        }

        scan.close();
    }
}