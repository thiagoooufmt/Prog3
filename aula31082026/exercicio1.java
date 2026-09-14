package aula31082026;

public class exercicio1 {
	
static class Carro {
	String marca;
	String modelo;
	int ano;
	
	void exibirInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		
	}
		 
}

public static void main(String[] args) {
	
	Carro meucarro = new Carro();
	meucarro.marca = "Toyata";
	meucarro.modelo = "Corolla";
	meucarro.ano = 2020;
	
	Carro meucarro2 = new Carro();
	meucarro2.marca = "Ford";
	meucarro2.modelo = "Ranger";
	meucarro2.ano = 2021;
	
	meucarro.exibirInfo();
	meucarro2.exibirInfo();
	

	}

}
