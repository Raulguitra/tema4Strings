import java.util.Scanner;
public class Ejercicio35 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//35.-Usando el segundo ejemplo, hacer un programa que busque una nota en el vector
		
		int i,conta=0;
		int arrayNotas[] = new int[10];
		int n;
		for (i=0; i<arrayNotas.length; i++){
			arrayNotas[i]=(int)Math.floor(Math.random()*11);////(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
			System.out.printf("%3d", (int)arrayNotas[i]);                                      //(10-0+1)+(0)
			conta= conta + arrayNotas[i];                                                      //11
		}
		System.out.println("\nLa media es: " +(float)conta/10); //salto de linea
		if (((float)conta/10)>5){
			System.out.print(" (Aprobado)");
		}else{
			System.out.print(" (Suspenso)");
		}
		System.out.println();
		System.out.print("Escribe una nota que quieras buscar");
		 n= sc.nextInt();
		for (i=0; i<arrayNotas.length; i++){
			if(n==arrayNotas[i]){
				System.out.print(" su nota esta en la posicion " + (i+1));
			}
			
			
		}
	}

}
        
		
	

