package ejercicio10;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*10.-Dado un numero n que filtraremos a que sea positivo, escribir un programa que nos
		diga cu�l es el numero primo m�s cercano a �l por debajo.
		*/
		
		int n;
		int contadiv;
		int div;
		int pp;
		boolean encontrado;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduzca un numero");
		n =teclado.nextInt();
		while(n < 0){
			System.out.println("introduzca un numero");
			n =teclado.nextInt();
		}//end while
		
		pp = n; 
		encontrado = false;
		while(encontrado ==false ){
			pp = pp - 1; contadiv = 0;
			for(div=2; div<pp-1; div++){
				if(pp % div ==0){
					contadiv = contadiv +1;
				}//end if
			
			}//end for
			if(contadiv == 0){
				encontrado = true;
				System.out.println("el numero " + pp + " es el mas cercano a " + n + " por debajo");
			}//end if
		
		}//end while
		
		
		
	}

}
