package pkMoisesCampos;

import pkgClaseAbstracta.Animal;

public class Ardilla extends Animal {

	private boolean voladora;
	
	

	public Ardilla(String genero, String especie, String nombreVulgar, int tiempoMedioVida,boolean vuela) {
		super(genero, especie, nombreVulgar, tiempoMedioVida);
		// TODO Auto-generated constructor stub
		this.voladora=voladora;
		}

	@Override
	public void SeDesplaza() 
	{
		

	}

	@Override
	public void SeAlimenta() 
	{

	}
	public boolean isVolador() {
		return voladora;
	}
	public void setVolador(boolean volador) {
		this.voladora = volador;
	}
}
