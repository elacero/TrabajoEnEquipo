package pkgFranciscoJavierCarrascosaRus;

import pkgClaseAbstracta.Animal;

public class ReyLeon extends Animal {

	double peso, volumenMelena;
	
	public ReyLeon(String genero, String especie, String nombreVulgar, int tiempoMedioVida, double peso, double volmenMelena) {
		super(genero, especie, nombreVulgar, tiempoMedioVida);
		// TODO Auto-generated constructor stub		
		this.peso=peso;
		this.volumenMelena=volmenMelena;
	}
	
	public double getPeso() {
		return peso;
	}

	public double getVolumenMelena() {
		return volumenMelena;
	}

	@Override
	public void SeDesplaza() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SeAlimenta() {
		// TODO Auto-generated method stub
		
	}

}
