package pkgMarcosCano;

import pkgClaseAbstracta.Animal;

public class Xenomorfo extends Animal {
	
	
	private boolean hibrido;
	private boolean reina;
	

	public Xenomorfo(String genero, String especie, String nombreVulgar, int tiempoMedioVida, boolean hibrido, boolean reina) {
		super(genero, especie, nombreVulgar, tiempoMedioVida);
		
		this.hibrido(hibrido);
		this.reina(reina);
	}

	private void hibrido(boolean hibrido2) {
		// TODO Auto-generated method stub
		
	}

	public void EscupeAcido() {
		// TODO Auto-generated method stub

	}
	
	public void PoneHuevos() {
		// TODO Auto-generated method stub

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
