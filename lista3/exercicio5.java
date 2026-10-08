package lista3;

public class exercicio5 {

    static class Calculadora {

        int somar(int a, int b) {
            return a + b;
        }

        double somar(double a, double b) {
            return a + b;
        }

        int somar(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("Soma de dois inteiros: " + calc.somar(10, 20));

        System.out.println("Soma de dois doubles: " + calc.somar(5.5, 2.3));

        System.out.println("Soma de três inteiros: " + calc.somar(10, 20, 30));

    }
}