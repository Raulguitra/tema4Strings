import java.util.Scanner;
public class pruebaejercicio3condudas {
	public static void main(String[] args) {
		//3. Leer un vector de 20 enteros. Encontrar el mayor y el menor de ellos y los lugares donde se
		//encuentran.

		int Array1[];
		Array1 = new int[5];
		
		int i=0;
	
		int posimax=0;
		int max=0;
		int min;
		int posimin;
		
		


		for(i=0; i<5; i++){

			Array1[i]=(int)Math.floor(Math.random()*21-10);
			if (max < Array1[i]){
				max=Array1[i];
				posimax = i+1;
			}
		
			System.out.printf("%5d", Array1[i]);
			
		}
		System.out.println();
		System.out.println( " el numero maximo es " + max);
		System.out.println( " y esta en la posicion " + posimax);


		posimin =0;
		min=0;
		
		for(i=0; i<5; i++){

			if (min > Array1[i]){
				min=Array1[i];
				posimin = i+1;
			}
		}
				System.out.println();
				System.out.println( " el numero minimo es " + min);
				System.out.println( " y esta en la posicion " + posimin);
	
		
		}
		}