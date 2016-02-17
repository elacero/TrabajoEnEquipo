package practicaguit;

import pkgClaseAbstracta.Animal;

public class Lobo extends Animal 
{
	private boolean alfa;

	public Lobo(String genero, String especie, String nombreVulgar, int tiempoMedioVida, boolean alfa) 
	{
		super(genero, especie, nombreVulgar, tiempoMedioVida);
		// TODO Auto-generated constructor stub
		this.alfa=false; // nacemos sin ser macho alfa eso lo conseguiremos con nuestros logros
		
	}

	@Override
	public void SeDesplaza() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SeAlimenta() {
		// TODO Auto-generated method stub

	}

	public boolean isAlfa() {
		return alfa;
	}

	public void setAlfa(boolean alfa) {
		this.alfa = alfa;
	}

}
