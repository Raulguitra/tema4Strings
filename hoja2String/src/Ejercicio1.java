import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Escribir un programa que pida por teclado una cadena y una letra, de manera que
		//ponga en may�sculas cada ocurrencia de la letra que haya en la cadena y lo
		//muestre por pantalla.
		
		 Scanner teclado = new Scanner(System.in);
		 String s1, letra;
			System.out.println("Escribe una frase");
			s1 = teclado.nextLine();
			do{
				System.out.println("Escribe una letra");
				letra = teclado.nextLine();
			}while (letra.length()>1);
			if (s1.indexOf(letra)==-1){
				System.out.println("No est� la letra");
			}else{
				System.out.println(s1.replace(letra, letra.toUpperCase()));
			}
		}//main

	}//Class
		
		
		


