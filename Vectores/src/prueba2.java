import java.util.Scanner;
public class prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Generar una matriz de 5x5 (num�rica entera entre -100 y 100) e imprimir el valor mayor y el
		//menor y los lugares donde se encuentran.


		final int f=5;
		final int c=5;

		int Array1[][];
		Array1=new int[f][c];
		int i;
		int j;
		int max=0;
		int min=0;

		for(i=0;i<f;i++){

			for(j=0;j<c;j++){
				Array1[i][j]=(int)Math.floor(Math.random()*201-100);
				System.out.printf("%5d",Array1[i][j]);
				if(Array1[i][j]>max){
					max=Array1[i][j];
				}else if(Array1[i][j]<min){
					min=Array1[i][j];	
				}


			}
		}
		System.out.print("el max es " + max + " y el minimo " + min );
	}
}