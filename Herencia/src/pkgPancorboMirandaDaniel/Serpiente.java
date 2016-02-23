package pkgPancorboMirandaDaniel;

import pkgClaseAbstracta.Animal;

public class Serpiente extends Animal {
	
	//Nueva propiedad: Serpiente
	private int Longitud;

	public Serpiente(String genero, String especie, String nombreVulgar, int tiempoMedioVida, int Longitud) {
		super(genero, especie, nombreVulgar, tiempoMedioVida);
		this.setLongitud(Longitud);
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
	
	// geter y seter de mi propiedad de mi Serpiente
	public int getLongitud() {
		return Longitud;
	}

	public void setLongitud(int longitud) {
		Longitud = longitud;
	}
	
	// comentariosssssssssssssssssss
	// metodo de mi Serpiente para saber la longitud
	/**
	 * Metodo que nos dice la longitud del cuerpo de nuestra Serpiente
	 * @return nos devuelve un entero que es la longitud
	 */
	public int DimeLongitud()
	{
		return this.Longitud;
	}

}
