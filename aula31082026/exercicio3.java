package aula31082026;

import java.util.ArrayList;
import java.util.Iterator;

public class exercicio3 {

    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("João");
        alunos.add("Maria");
        alunos.add("Pedro");
        alunos.add("Ana");
        alunos.add("Carlos");

        System.out.println("Lista de alunos:");

        Iterator<String> iterator = alunos.iterator();

        while (iterator.hasNext()) {
            String aluno = iterator.next();
            System.out.println(aluno);
        }

        iterator = alunos.iterator();

        while (iterator.hasNext()) {
            String aluno = iterator.next();

            if (aluno.equals("Pedro")) {
                iterator.remove();
            }
        }

        System.out.println("\nLista de alunos após a remoção:");

        iterator = alunos.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
