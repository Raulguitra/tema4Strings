import java.util.Scanner;
public class prueba {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int i;
		final int n = 10;
		int Array1 [];
		int Array2 [];
		int Array3 [];
		Array1 = new int [10];
		Array2 = new int [10];
		Array3 = new int [10];
		System.out.println("introduce los primeros diez numeros");
		for(i=0; i < 10; i++){
			System.out.println("numero");
			Array1[i] =sc.nextInt();
			
			
		}//end for
		System.out.println("introduce los segundos diez numeros");
		for(i=0; i<10; i++){
			System.out.println("numero");
			Array2[i] =sc.nextInt();
			
		}//end for
		
		System.out.println("la sumica de las matrices es ");
		for(i=0; i<10; i++){
			Array3[i]=Array2[i]+Array1[i];		
			System.out.print(Array3 [i]);
			System.out.print(" ");
			
		}//end for
		
		System.out.print("   ");
		System.out.print("  -Array3");
		System.out.println("");
		System.out.print(" array1 es ");
		for(i=0; i < 10; i++){
			System.out.print(Array1[i]);
			System.out.print(" ");
		}//end for
		
		System.out.println("");
		System.out.print(" array2 es ");
		for(i=0; i < 10; i++){
			System.out.print(Array2[i]);
			System.out.print(" ");
		}//end for

	
		
	
}
}
