package lista3;

public class exercicio1 {

    static class Livro {
        String titulo;
        String autor;

        Livro() {
            titulo = "Desconhecido";
            autor = "Desconhecido";
        }

        Livro(String t, String a) {
            titulo = t;
            autor = a;
        }

        void exibirInfo() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
        }
    }

    public static void main(String[] args) {

        Livro livro1 = new Livro();

        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");

        livro1.exibirInfo();
        livro2.exibirInfo();

    }
}