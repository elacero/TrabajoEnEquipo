package Pato_Entornos;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pato Juan = new Pato(0);
		Scanner  LaImaginacionDeJuan = new Scanner(System.in);
		int Opcion,N = 0;
		
		System.out.println("Hola, soy tu pato Juan");
		
		do
		{
			System.out.println("¿Quieres que avance o retroceda?(1.- Avanza, 2.- Retrocede, 0.- Salir)");
			Opcion = LaImaginacionDeJuan.nextInt();
			
			if(Opcion != 0)
			{
				System.out.println("¿Cuantos pasos quieres que de?");
				N = LaImaginacionDeJuan.nextInt();
			}
			
			if (Opcion == 1)
			{
				Juan.AndarHaciaAdelante(N);
			}
			else 
			{
				Juan.AndarHaciaAtras(N);
			}
			
			System.out.println("Estoy en la posición: "+Juan.DimePosicion());
			
		}while (Opcion != 0);
		
		LaImaginacionDeJuan.close();
		
	}
	

}
