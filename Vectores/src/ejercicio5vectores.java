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
		Array1=new int [3];
		int Array2[];
		Array2=new int [3];
		int i;
		int j;
		int k;
		int conta=0;
		
		
		System.out.println("Array1");
		for (i=0;i<3;i++){
			Array1[i]=(int)Math.floor(Math.random()*6);
			System.out.println(Array1[i]);
			
		}
		System.out.println("Array2");
		for (j=0;j<3;j++){
			Array2[j]=(int)Math.floor(Math.random()*6);
			System.out.println(Array2[j]);
		}
		
		for (i=0;i<3;i++){
			conta=0;
			for (j=0;j<3;j++){
				if(Array1[i]==Array2[j]){
					conta++;
				}
			}
			System.out.println(Array1[i] + " esta " + conta );
		}
		
		
		
}
}