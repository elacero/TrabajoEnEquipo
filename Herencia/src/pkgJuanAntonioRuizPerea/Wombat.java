package pkgJuanAntonioRuizPerea;

import pkgClaseAbstracta.Animal;

public class Wombat extends Animal {

	public Wombat(String genero, String especie, String nombreVulgar, int tiempoMedioVida) {
		super(genero, especie, nombreVulgar, tiempoMedioVida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void SeDesplaza() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SeAlimenta() {
		// TODO Auto-generated method stub

	}
	
	public int diasDigestion()
	{
		int dias=14;
		return dias;
	}
}
