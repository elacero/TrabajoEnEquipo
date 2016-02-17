package Pato_Entornos;

public class Pato {

	private int Posicion;
	
	public Pato(int Pos)
	{
		this.Posicion = Pos;
	}
	
	public int AndarHaciaAdelante(int Pasos)
	{
		this.Posicion += Pasos;
		return this.Posicion;
	}
	
	public int AndarHaciaAtras(int Pasos)
	{
		this.Posicion -= Pasos;
		return this.Posicion;
	}
	
	public int DimePosicion()
	{
		return this.Posicion;
	}
	
}