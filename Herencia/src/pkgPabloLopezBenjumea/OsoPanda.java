package pkgPabloLopezBenjumea;

import pkgClaseAbstracta.Animal;

public class OsoPanda extends Animal {
	private int altura;
	private int edad;
	
	public OsoPanda(String genero, String especie, String nombreVulgar, int tiempoMedioVida, int alt, int edad) {
		super(genero, especie, nombreVulgar, tiempoMedioVida);
		// TODO Apéndice de constructor generado automáticamente
		this.setAltura(alt);
		this.setAltura(edad);
	}

	@Override
	public void SeDesplaza() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SeAlimenta() {
		// TODO Auto-generated method stub
		
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
