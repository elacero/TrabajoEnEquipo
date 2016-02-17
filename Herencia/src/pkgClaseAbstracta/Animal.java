package pkgClaseAbstracta;

public abstract class Animal {
	
	//Propiedades de tienen todos los animales
	private String Genero;
	private String Especie;
	private String NombreVulgar;
	private int TiempoMedioVida;
	
	//Constructor
	public Animal(String genero, String especie, String nombreVulgar, int tiempoMedioVida) {
		Genero = genero;
		Especie = especie;
		NombreVulgar = nombreVulgar;
		TiempoMedioVida = tiempoMedioVida;
	}
	
	//Todos los animales se desplazan pero cada uno lo hace de una manera especial
	public abstract void SeDesplaza();
	
	//Todos los animales se alimentan pero cada uno lo hace de comida y forma distinta
	public abstract void SeAlimenta();
	
	//Todos se mueren cuando llega su hora, simulemos esta situación con un método
	public boolean SeMuere(int tiempovida)
	{
		return tiempovida>TiempoMedioVida?true:false;
	}

}
