import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*12.-Un n�mero se dice que es perfecto cuando la suma de sus divisores excluido �l es
		igual a dicho n�mero. Hacer un programa que lea un n�mero y nos diga si es � no
		perfecto
		 */

		int n;
		int k;
		int sumadivisores;

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un numero mayor que 0");
		n=teclado.nextInt();

		while(n <= 0){
			System.out.println("introduzca un numero mayor que 0");
			n=teclado.nextInt();
		}

		sumadivisores = 0;
		for (k=1; k<n; k++){
			if(n % k==0){
				sumadivisores = sumadivisores +k;
			}
		}
		if(sumadivisores==n){
			System.out.println("el numero " + n + " es perfecto");

		}
		else{
			System.out.println("el numero " + n + " no es perfecto");
		}

	}
}
