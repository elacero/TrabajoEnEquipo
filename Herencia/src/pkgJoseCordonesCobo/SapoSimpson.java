package pkgJoseCordonesCobo;

import pkgClaseAbstracta.Animal;

public class SapoSimpson extends Animal {
	
	private String tama�o;
	

	

	public SapoSimpson(String genero, String especie, String nombreVulgar, int tiempoMedioVida, String tam) {
		super(genero, especie, nombreVulgar, tiempoMedioVida);
		// TODO Ap�ndice de constructor generado autom�ticamente
		
		this.setTama�o(tam);
	}

	@Override
	public void SeDesplaza() {
		// TODO Ap�ndice de m�todo generado autom�ticamente

	}

	@Override
	public void SeAlimenta() {
		// TODO Ap�ndice de m�todo generado autom�ticamente

	}

	/**
	 * @return el tama�o
	 */
	public String getTama�o() {
		return tama�o;
	}

	/**
	 * @param tama�o el tama�o a establecer
	 */
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

}
