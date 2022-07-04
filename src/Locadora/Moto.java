package Locadora;

public class Moto {
	public String fabricante ;
	public String modelo;
	public String cilindrada;
	public void configuraDados (String fabricanteMoto, String modeloMoto, String cilindrada) {
		this.fabricante = fabricanteMoto;
		this.modelo = modeloMoto;
		this.cilindrada = cilindrada;
	}
	
	
	public void exibirDados() {
		System.out.println("Moto: " + this.fabricante + " " + this.modelo + " " + this.cilindrada );
		
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
}
