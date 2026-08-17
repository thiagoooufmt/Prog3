package main;

import java.util.Scanner;

public class Numero_Primo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = scan.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        int fim = scan.nextInt();

        System.out.println("Números primos no intervalo:");

        for (int numero = inicio; numero <= fim; numero++) {

            boolean primo = true;

            if (numero < 2) {
                primo = false;
            } else {
                for (int divisor = 2; divisor < numero; divisor++) {

                    if (numero % divisor == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println(numero);
            }
        }

        scan.close();
    }
}