package aula31082026;

import java.util.ArrayList;
import java.util.Iterator;

public class exercicio7 {

    public static boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty() && nome.trim().length() >= 3;
    }

    public static boolean buscarNome(ArrayList<String> lista, String busca) {
        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()) {
            String nome = iterator.next();

            if (nome.equalsIgnoreCase(busca)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        String nome1 = "João";
        String nome2 = "Maria";
        String nome3 = "Carlos";
        String nome4 = "Ana";

        if (validarNome(nome1)) {
            nomes.add(nome1);
        }

        if (validarNome(nome2)) {
            nomes.add(nome2);
        }

        if (validarNome(nome3)) {
            nomes.add(nome3);
        }

        if (validarNome(nome4)) {
            nomes.add(nome4);
        }

        String busca = "maria";

        if (buscarNome(nomes, busca)) {
            System.out.println("Usuário encontrado.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
