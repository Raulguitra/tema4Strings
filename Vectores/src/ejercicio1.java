import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//se generan 20 numeros de tipo entre 10 y -10 almacenados en un vector.
		//calcula y muestra la media y cuantoss numeros hay
		final int n = 20;
		int Array1 [];
		Array1 = new int[n];
		int i,conta=0, max=0, min=0;
		double media;
		System.out.print("Lista de 20 numeros: ");
		for (i=0; i < n; i++){
			Array1[i]=(int)Math.floor(Math.random()*21-10);  //(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
			conta = conta + Array1[i];						//				                 *  (10  + 10)  - 10 
			System.out.print((int)Array1[i]);
			System.out.print(" ");
			if (max < Array1[i]){
				max = Array1[i];
			}
			if (min > Array1[i]){
				min = Array1[i];
			}
		}	
		System.out.println();
		media = (double) conta/20;
		System.out.println("La media es: " +media);
		System.out.println("Num max: " +max);
		System.out.println("Num min: " +min);
		
		System.out.print("Numeros mayores que " +media +": ");
		for (i=0; i < n; i++){
			if (Array1[i] > media){
				System.out.print((int)Array1[i]);
				System.out.print(" ");
			}		
		}
		System.out.println();
		System.out.print("Numeros menores que " +media +": ");
		for (i=0; i < n; i++){
			if (Array1[i] < media){
				System.out.print((int)Array1[i]);
				System.out.print(" ");
			}		
		}
		System.out.println();
		System.out.print("Numeros iguales que " +media +": ");
		for (i=0; i < n; i++){
			if (Array1[i] == media){
				System.out.print((int)Array1[i]);
				System.out.print(" ");
			}
		}
	}//main

}//Class