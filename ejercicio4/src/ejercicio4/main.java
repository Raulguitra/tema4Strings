package ejercicio4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*4.-Escribir un programa que una vez que lea un n�mero n por teclado calcule y escriba
sus divisores por la pantalla
*/
		int N , k;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un numero");
		N = teclado.nextInt();

		if (N<0){
			N=-N;


		}
		for (k=1; k<=N; k++){
			if(N%k==0){
				System.out.println(k + " es divisor de " +N);
			}
		}
			
		
	}

}
