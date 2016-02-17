package pkgClaseAbstracta;

import java.util.Scanner;

public class Ñu {

	public Ñu() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int posicion(){
		Scanner lector = new Scanner (System.in);
	    int andaPalante = 0;
		int parado;
		int opcion;
		
			System.out.print("Que quieres que haga el Ñu: ");
		do{
			System.out.println("Pulsa 1 para avanzar, pulsa 0 para pararse y 2 para salir " );
			opcion=lector.nextInt();
		if ( (!(opcion == 1)) || (!(opcion ==0))){
			System.out.print("Error, debes introducir 0 o 1");
		}else if (opcion ==1 ){
			andaPalante = opcion + 1;
			System.out.print("La posicion del Ñu es: "+andaPalante);
		}else if (opcion ==0){
			parado = andaPalante;
			System.out.print(("La posicion del Ñu es: "+andaPalante) );
		}else{
			System.out.print("SALIR");
		}
		}while (!(opcion ==2));
		
		return andaPalante;
	}
	
}
