package lista4;


public class exercicio7 {

    enum NivelAtleta {
        NOVATO,
        AMADOR,
        PROFISSIONAL
    }

    interface Corredor {
        void correr();
    }

    interface Nadador {
        void nadar();
    }

    interface Ciclista {
        void pedalar();
    }

    static abstract class Atleta {
        String nome;
        int idade;
        NivelAtleta nivel;

        Atleta(String nome, int idade, NivelAtleta nivel) {
            if (nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome inválido!");
            }

            if (idade < 0) {
                throw new IllegalArgumentException("Idade inválida!");
            }

            if (nivel == null) {
                throw new IllegalArgumentException("Nível inválido!");
            }

            this.nome = nome;
            this.idade = idade;
            this.nivel = nivel;
        }

        abstract void exibirModalidades();

        void exibirInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Nível: " + nivel);
            exibirModalidades();
        }
    }

    static class CorredorProfissional extends Atleta implements Corredor {

        CorredorProfissional(String nome, int idade, NivelAtleta nivel) {
            super(nome, idade, nivel);
        }

        @Override
        public void correr() {
            System.out.println(nome + " está correndo.");
        }

        @Override
        void exibirModalidades() {
            System.out.println("Modalidade: Corrida");
        }
    }

    static class NadadorProfissional extends Atleta implements Nadador {

        NadadorProfissional(String nome, int idade, NivelAtleta nivel) {
            super(nome, idade, nivel);
        }

        @Override
        public void nadar() {
            System.out.println(nome + " está nadando.");
        }

        @Override
        void exibirModalidades() {
            System.out.println("Modalidade: Natação");
        }
    }

    static class Triatleta extends Atleta implements Corredor, Nadador, Ciclista {

        Triatleta(String nome, int idade, NivelAtleta nivel) {
            super(nome, idade, nivel);
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

        @Override
        void exibirModalidades() {
            System.out.println("Modalidades: Corrida, Natação e Ciclismo");
        }
    }

    public static void main(String[] args) {

        Atleta[] atletas = new Atleta[4];

        atletas[0] = new CorredorProfissional("Joao", 25, NivelAtleta.PROFISSIONAL);
        atletas[1] = new NadadorProfissional("Maria", 22, NivelAtleta.AMADOR);
        atletas[2] = new Triatleta("Pedro", 30, NivelAtleta.PROFISSIONAL);
        atletas[3] = new Triatleta("Ana", 19, NivelAtleta.NOVATO);

        for (Atleta atleta : atletas) {

            atleta.exibirInfo();

            if (atleta instanceof Corredor) {
                Corredor corredor = (Corredor) atleta;
                corredor.correr();
            }

            if (atleta instanceof Nadador) {
                Nadador nadador = (Nadador) atleta;
                nadador.nadar();
            }

            if (atleta instanceof Ciclista) {
                Ciclista ciclista = (Ciclista) atleta;
                ciclista.pedalar();
            }

            System.out.println();
        }

        System.out.println("Testando validações:");

        try {
            Atleta atletaInvalido = new Triatleta("", -5, NivelAtleta.NOVATO);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Atleta atletaInvalido = new CorredorProfissional("Carlos", -2, NivelAtleta.AMADOR);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}