package aula31082026;

public class exercicio2 {
	
	static class Contador {
		static int totalObjetos =  0;
		Contador() {
			totalObjetos++;
		}
		static void mostrarTotal() {
			System.out.println("Total de objetos criados: " + totalObjetos);
		}
	}
	public static void main(String[] args) {
	
		Contador obj1 = new Contador();
		Contador obj2 = new Contador();
		Contador obj3 = new Contador();
		Contador obj4 = new Contador();
		
		Contador.mostrarTotal();
			
		

	}

}
