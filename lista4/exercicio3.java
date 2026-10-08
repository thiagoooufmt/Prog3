package lista4;


public class exercicio3 {

    interface Corredor {
        void correr();
    }

    interface Nadador {
        void nadar();
    }

    interface Ciclista {
        void pedalar();
    }

    static class Triatleta implements Corredor, Nadador, Ciclista {
        String nome;

        Triatleta(String nome) {
            this.nome = nome;
        }

        @Override
        public void correr() {
            System.out.println(nome + " está correndo.");
        }

        @Override
        public void nadar() {
            System.out.println(nome + " está nadando.");
        }

        @Override
        public void pedalar() {
            System.out.println(nome + " está pedalando.");
        }

        void mostrarModalidades() {
            System.out.println("Triatleta: " + nome);
            System.out.println("Modalidades: Corrida, Natação e Ciclismo");
        }
    }

    public static void main(String[] args) {

        Triatleta triatleta1 = new Triatleta("Joao");
        Triatleta triatleta2 = new Triatleta("Maria");

        triatleta1.mostrarModalidades();
        triatleta1.correr();
        triatleta1.nadar();
        triatleta1.pedalar();

        System.out.println();

        triatleta2.mostrarModalidades();
        triatleta2.correr();
        triatleta2.nadar();
        triatleta2.pedalar();

    }
}