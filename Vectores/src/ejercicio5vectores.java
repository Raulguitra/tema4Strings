import java.util.Scanner;
public class ejercicio5vectores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//*Generar dos vectores de dimensi�n 10 (dar valores aleatorios entre 1 y 5 a cada elemento) y
		//comprobar para cada uno de los elementos del primer vector cu�ntas veces est� en el segundo,
		//es decir para
		//vector1= {3,7,2}
		//vector2= {3,3,5}
		//el resultado debe ser:
		//elemento 1 : 2 veces
		//elemento 2 : 0 veces
		//elemento 3 : 0 veces
		
		int Array1[];
		Array1=new int [10];
		int Array2[];
		Array2=new int [10];
		int i;
		
		System.out.println("Array1");
		for (i=0;i<10;i++){
			Array1[i]=(int)Math.floor(Math.random()*6);
			System.out.println(Array1[i]);
			
		}
		System.out.println("Array2");
		for (i=0;i<10;i++){
			Array2[i]=(int)Math.floor(Math.random()*6);
			System.out.println(Array2[i]);
		}
		
		
		
}
}