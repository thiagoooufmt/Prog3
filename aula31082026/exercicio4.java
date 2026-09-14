package aula31082026;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String fraseTratada = frase.trim();

        System.out.println("Quantidade de caracteres: " + fraseTratada.length());
        System.out.println("Frase em maiúsculas: " + fraseTratada.toUpperCase());

        String fraseSubstituida = fraseTratada.replace("Java", "Linguagem Java");
        System.out.println("Frase com substituição: " + fraseSubstituida);

        System.out.println("Caractere no índice 5: " + fraseTratada.charAt(5));

        scanner.close();
    }
}