import java.util.Scanner;
public class Ejercicio7vectores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. Generar una matriz de 5x5 num�rica entera entre -10 y 10, a continuaci�n pedir dos n�meros
		//de fila, que se deben filtrar entre 1 y 5 e intercambiar ambas filas. Presentar las matrices antes
		//y despu�s del cambio.
		
		//NO LO ENTIENDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
	
		final int f = 10;
		final int c = 10;
		int Array1 [][];
		Array1 = new int[f][c];
		int i,j=0,temp, fila1=0, fila2=0;
		for (i=0; i<f; i++){
			for (j=0; j<c; j++){
				Array1[i][j]=(int)Math.floor(Math.random()*21-10);
				System.out.printf("%3d", Array1[i][j]);
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de fila que quieras mover: ");
		fila1 = sc.nextInt();
		while (fila1<1 || fila1>5){
			System.out.println("Numero entre 1 y 5 ");
			fila1 = sc.nextInt();
		}
		System.out.println("Introduce el numero de fila donde quieras mover la anterior: ");
		fila2 = sc.nextInt();
		while (fila2<1 || fila2>5){
			System.out.println("Numero entre 1 y 5 ");
			fila2 = sc.nextInt();
		}
		for (i=0; i<f; i++){ 
			temp = Array1[fila1-1][i]; // matriz auxiliar para que no sobreescriba las filas
			Array1[fila1-1][i] = Array1[fila2-1][i];
			Array1[fila2-1][i] = temp; //
		}
		for (i=0; i<f; i++){
			for (j=0; j<c; j++){
				System.out.printf("%3d", Array1[i][j]);
			}
			System.out.println();
			
		}
	}//main

}//Class