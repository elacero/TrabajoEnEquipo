package pkgJoseCordonesCobo;

import pkgClaseAbstracta.Animal;

public class SapoSimpson extends Animal {
	
	private String tamaño;
	

	

	public SapoSimpson(String genero, String especie, String nombreVulgar, int tiempoMedioVida, String tam) {
		super(genero, especie, nombreVulgar, tiempoMedioVida);
		// TODO Apéndice de constructor generado automáticamente
		
		this.setTamaño(tam);
	}

	@Override
	public void SeDesplaza() {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public void SeAlimenta() {
		// TODO Apéndice de método generado automáticamente

	}

	/**
	 * @return el tamaño
	 */
	public String getTamaño() {
		return tamaño;
	}

	/**
	 * @param tamaño el tamaño a establecer
	 */
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

}
