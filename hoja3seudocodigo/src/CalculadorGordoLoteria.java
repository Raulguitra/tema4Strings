import java.util.Scanner;

import javax.swing.SingleSelectionModel;
public class CalculadorGordoLoteria {





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//41.-Se dispone de una tabla de 5 p�ginas, 10 filas y 20 columnas, que se refieren al centro, al
		//curso y al n�mero de alumnos de un colegio respectivamente. Imprimir la nota media por curso
		//y la nota media m�xima y su centro de pertenencia


		int  Array1 [][][];
		Array1 = new int [5][10][20];
		int medianotas[][];
		medianotas = new int [10][20];
		int centro =0;
		int curso=0;
		int  alumno=0;
		int suma=0;
		int mediamax=0;
		int cursomax =0;


		for(centro=0; centro<5; centro++){
			System.out.println();
			System.out.println("----------------------------------------------------------------------");
			for(curso=0; curso<10; curso++){
				System.out.println();
				for(alumno=0; alumno<20; alumno++){
					Array1[centro][curso][alumno]=(int)Math.floor(Math.random()*11);////(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
					System.out.printf("%3d", (int)Array1[centro][curso][alumno]);                                      //(10-0+1)+(0)
				}
			}
		}
		System.out.println("\n----------------------------------------------------------------------");



		for(centro=0; centro<5; centro++){
			for(curso=0; curso<10; curso++){
				for(alumno=0; alumno<20; alumno++){
					suma+=Array1[centro][curso][alumno];        
				}
				medianotas[centro][curso]=(suma/20);
				System.out.printf("%5d", medianotas[centro][curso]);
				suma=0;
			}
			System.out.printf("\n");
		}
		System.out.println("\n----------------------------------------------------------------------");
		for(centro=0; centro<5; centro++){
			mediamax=0;cursomax=0;
			for(curso=0; curso<10; curso++){	
				if(mediamax<medianotas[centro][curso]);
				mediamax=medianotas[centro][curso];
				cursomax=curso;
				
			}
			System.out.print(+mediamax +" " +cursomax+" ");
		}
		System.out.printf("\n");

	}
}