package es.florida.tema1;

public class Vehiculo {

	private String tipo;
	private String marca;
	private String modelo;
	
	public Vehiculo(String tipo, String marca, String modelo) {
		this.tipo=tipo;
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public void mostrarVehiculo() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Tipo: "+this.tipo);
		System.out.println("Modelo: "+this.modelo);
	}
	
}
