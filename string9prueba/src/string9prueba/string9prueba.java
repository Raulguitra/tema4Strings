

package string9prueba;
import java.util.Scanner;
public class string9prueba {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//se generan 20 numeros de tipo entre 10 y -10 almacenados en un vector.
			//calcula y muestra la media y cuantoss numeros hay
		
		
		
		int Array1[];
		Array1 = new int [4];
		int Array2[];
		Array2 = new int [4];
		int i=0;
		int Array3[];
		Array3 = new int [4];
		
	
	
		
		for (i=0; i < 4; i++){
			Array1[i]=(int)Math.floor(Math.random()*21-10);
			
			System.out.printf("%5d",Array1[i]);
		}
		System.out.println();
		for (i=0; i < 4; i++){
			Array2[i]=(int)Math.floor(Math.random()*21-10);
			
			System.out.printf("%5d",Array2[i]);
		}
		System.out.println();
		
		for (i=0; i < 4; i++){
		Array3[i] =Array2[i]+ Array1[i];
		
		System.out.print( Array3[i]);
		}
}
}