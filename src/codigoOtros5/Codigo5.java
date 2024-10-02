package codigoOtros5;

import java.util.Scanner;

public class Codigo5 {

	//se añadio el metodo main
	public static void main(String[] args) {
		//se añadio el system.in y se importo el escaner
	    Scanner s = new Scanner(System.in);
	    //
	    System.out.println("Introduzca un número: ");
	    //se corrigo el tipo de variable y de lectura
	    int ni = s.nextInt();
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    //se quito el while para evitar ciclos infinitos
	  
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }
	    if (afo > noAfo) {
	    	//se corrigio el comando print
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  
	} 
}
