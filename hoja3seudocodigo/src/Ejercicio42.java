import java.util.Scanner;
public class Ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//42.-Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus tres
		//representantes a lo largo de doce meses de sus cuatro productos, VENTAS [representante,
		//mes, producto]. Queremos proyectar el array tridimensional sobre uno de dos dimensiones que
		//represente el total de ventas, TOTAL [mes, producto], para lo cual sumamos las ventas de
		//cada producto de cada mes de todos los representantes. Imprimir ambos arrays.
		
		
		
		
		
		int Array [][][];
		Array = new int [12][4][3];
		int totalventas [][];
		totalventas = new int [12][4];
		
		int rep=0;
		int mes=0;
		int prod=0;
		int suma;
		
		
		for (mes=0; mes<12; mes++){
			System.out.println();
			System.out.println("----------------------------------------------------------------------");
			for (prod=0; prod<4; prod++){
				System.out.println();
				for (rep=0; rep<3; rep++){
					Array[mes][prod][rep]=(int)Math.floor(Math.random()*11);	
		
				
				System.out.printf("%5d", Array[mes][prod][rep]);
				
		}
			} 	
		}
		System.out.println();
		for (mes=0; mes<12; mes++){
			
			
			for (prod=0; prod<4; prod++){
				System.out.println();
				suma=0;
				for (rep=0; rep<3; rep++){
					suma+=Array[mes][prod][rep];
				}
				
				totalventas[mes][prod]=suma;
				
				System.out.printf("%5d", totalventas[mes][prod]);
			}
			System.out.printf("\n");
			}
		
		
	}
	       
}
