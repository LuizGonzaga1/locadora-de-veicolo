package Locadora;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		
		System.out.println(" Os veiculos disponives são ");
		
		Carro carro = new Carro();
		carro.configuraDados("BMW ", "Z4", "800Cv");
		carro.exibirDados();
		
		
		Moto Moto = new Moto();
		Moto.configuraDados( "kawasaki", "Z", "900cc");
		Moto.exibirDados();
		
		
		
	}

}
