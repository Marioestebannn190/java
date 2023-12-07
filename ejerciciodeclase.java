package ejerciciodeclase;
import java.util.Iterator;
import java.util.Scanner;
public class ejerciciodeclase {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); 
		 System.out.println("Debes ingresar siete cantidades enteras");
		 int suma = 0 ;
		 int cantidadesingresadas=0;
		 int primerN=0;
		 int ultimoN=0;
		 int cantidadesingresadasmenor=Integer.MAX_VALUE;
		 for (int i = 1; i <=7; i++) {
			 System.out.print("ingresa el numero" + i + ":");
			 int cantidades = scanner.nextInt();
			 suma += cantidades;
			 if (cantidades > cantidadesingresadas) {
				 cantidadesingresadas=cantidades;
			 }
			 if (cantidades < cantidadesingresadasmenor) {
				 cantidadesingresadasmenor=cantidades;
			 }
			 if (i==1) {
				 primerN=cantidades;
			 }	
			 ultimoN=cantidades;
		}
		 System.out.println("la suma de las cantidades ingresadas es:" + suma);
		 int promedio=suma/7;
		 System.out.println("el promedio de las cantidades ingresadas es:" + promedio);
		 System.out.println("el numero mayor es:" + cantidadesingresadas);
		 System.out.println("el numero menor es:" + cantidadesingresadasmenor);
		 System.out.println("el primer numero ingresado es:" + primerN);
		 System.out.println("el ultimo numero ingresado es:" + ultimoN);
	    }//publicargs
	

	}//public class

