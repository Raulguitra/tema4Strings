package ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*3.-Leer un n�mero n que debe filtrarse entre 1 y 100 y a continuaci�n calcular y escribir
		la tabla de multiplicar de ese n�mero con el siguiente formato:
		TABLA DE MULTIPLICAR DE 8*/
		
		int N , producto, k;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un numero");
		N = teclado.nextInt();
		while (N<1 || N>100){
			System.out.println("Ingrese un valor entre 1 y 100");
			N = teclado.nextInt();
		}//while
		for (k=1; k<11; k++) {

			producto=N*k;
			System.out.println(N +"x" +k +"=" +producto); 

		}//for


	}//main	

}//class
