package lista3;


public class exercicio3 {

    static class Pessoa {
        private String nome;
        private int idade;

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }

    static class Aluno extends Pessoa {
        private String matricula;

        Aluno(String nome, int idade, String matricula) {
            super(nome, idade);
            this.matricula = matricula;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        void exibirInfo() {
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Matrícula: " + getMatricula());
        }
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Thiago", 20, "2026001");

        aluno1.exibirInfo();

        aluno1.setNome("Felix");
        aluno1.setIdade(22);
        aluno1.setMatricula("2026002");

        System.out.println("Dados atualizados:");

        aluno1.exibirInfo();

    }
}