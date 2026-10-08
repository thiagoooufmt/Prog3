package lista3;

public class exercicio4 {

    static class Animal {
        void emitirSom() {
            System.out.println("Som do animal");
        }
    }

    static class Cachorro extends Animal {
        @Override
        void emitirSom() {
            System.out.println("Cachorro: Au Au!");
        }
    }

    static class Gato extends Animal {
        @Override
        void emitirSom() {
            System.out.println("Gato: Miau!");
        }
    }

    public static void main(String[] args) {

        Animal[] animais = {new Cachorro(), new Gato()};

        for (Animal animal : animais) {
            animal.emitirSom();
        }

    }
}