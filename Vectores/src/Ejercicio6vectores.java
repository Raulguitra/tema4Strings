import java.util.Scanner;
public class Ejercicio6vectores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
	
	
	//6. Generar una matriz de 10x10, asignarles n�mero reales aleatorios a cada elemento entre -5 y 5.
	//Calcular e imprimir la suma de cada una de sus filas y de cada una de sus columnas junto con la
	//matriz.
	
	
	int suma=0;
			int sumac=0;
	
	int Array1[][];
	Array1=new int [10][10];
	int Array2[];
	Array2=new int [10];
	int i=0;
	int j=0;
	
	for(i=0; i<10; i++){
		for(j=0; j<10; j++){
		Array1[i][j]=(int)Math.floor(Math.random()*11-5);
		System.out.printf("%3d", Array1[i][j]);
		
	
		}
		
		System.out.println();
		
		
	}
	
	System.out.println( "\t\t\t\t\t\t suma filas");
	
	for(i=0; i<10; i++){
		for(j=0; j<10; j++){
		suma += Array1[i][j];
		System.out.printf("%3d", Array1[i][j]);
	
	
	}
		System.out.print( "   " +suma);
		System.out.println();
	}
	for(i=0; i<10; i++){
		for(j=0; j<10; j++){
		sumac += Array1[j][i];

		}
		System.out.printf("%3d", sumac);
	}
		
	}
}