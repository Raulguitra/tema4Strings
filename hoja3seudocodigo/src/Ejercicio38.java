import java.util.Scanner;
public class Ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//38.-Cargar en una matriz las notas de los alumnos de un colegio en funci�n del n�mero de
		//cursos (filas) y del n�mero de alumnos por curso (columnas).	
		
		
		
		Scanner teclado = new Scanner(System.in);
		int i=0; int j=0; 
		int Array1[][];
		
		
		
		
		
		int a=0;
		int cur=0;
		System.out.println("intoduce curso");
		cur=teclado.nextInt();
		System.out.println("intoduce alumno");
		a=teclado.nextInt();
		Array1 = new int [cur][a];
		
		for(i=0; i<cur; i++){
			for(j=0; j<a; j++){
				
			Array1[i][j]=(int)Math.floor(Math.random()*11);
			
			System.out.printf("%3d",Array1[i][j]);
			
			}
			System.out.println();
		}}}
		