import java.util.Scanner;
public class Ejercicio8vectores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	//*8. Tenemos 10 asignaturas y 10 alumnos numerados del 1 al 10 tanto las asignaturas como los
	//alumnos. Introducimos las 10 notas de los 10 alumnos (generaci�n aleatoria de 1 a 10) y
	//pidiendo por teclado bien n�mero de asignatura � bien n�mero de alumno, calcular media del
	//alumno tecleado � media de la asignatura tecleada.//
		
		
		
		Scanner teclado = new Scanner(System.in);	

		
		
		int Array1 [][];
		Array1 = new int[10][10];
		int i=0 , j=0;
		int contalum;
		int contasig=0;
		int n=0;
		int a=0;
		
		for (i=0; i<10; i++){
			for (j=0; j<10; j++){
			
				Array1[i][j]=(int)Math.floor(Math.random()*11);
				
				System.out.printf("%3d", Array1[i][j]);
			}
			
			System.out.println();
		}
		System.out.println("introduzca el numero del alumno");
		n=teclado.nextInt();
		contalum=0;
		for (i=0; i<1; i++){
		
			for (j=0; j<10; j++){
			
				
				contalum= contalum + Array1[n-1][j];
				
				
			}
			
			
		}
		System.out.println((float)contalum/10);
		
		System.out.println("introduzca el numero de la asignatura");
		a=teclado.nextInt();
		contasig=0;
		for (i=0; i<10; i++){
		
			for (j=0; j<1; j++){
			
				
				contasig= contasig + Array1[i][a-1];
				
}
		}
		System.out.println((float)contasig/10);
	}
}
