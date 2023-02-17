package com.generation;

// se importa la utileria para el Scanner
import java.util.Scanner;

public class Codigo5 {

	// se agrego metodo main ya que no lo tenia incluido
	public static void main(String[] args) {

		// se agrego el System.in para que pueda leer los datos de la consola
		 Scanner s = new Scanner(System.in);
		 // se arreglo la commila simple y se cambio por unas dobles para cerrar lo que se imprimir
		    System.out.print("Introduzca un número: ");
		    //se modifico el tipo de entrada a nextInt() y se cambio el tipo de dato String por int
		    int ni = s.nextInt();
		    int c = ni;
		    
		    int afo = 0;
		    int noAfo = 0;
		    
		    while (ni > 0) {
			  int digito = (ni % 10);
		      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
		      } else {
				noAfo++;
			  
			  ni /= 10;
		    }

		    if (afo > noAfo) {
		    	// se agrego la t en el metodo println
		      System.out.println("El " + c + " es un número afortunado.");
		      // se agrego el break para teminar el ciclo
		      break;
		    } else {
		      System.out.println("El " + c + " no es un número afortunado.");
		   // se agrego el break para teminar el ciclo
		      break;
		    }
		    
		  }
		
	}

}


// el programa imprime si un numero es afortunado o no dependiendo de las comparaciones