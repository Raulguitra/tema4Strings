
import java.util.Scanner;
public class string7 {
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//ejercicio 7 programa que de una frase nos diga mayusculas minusculas y numeros que tiene*/
		
		Scanner teclado = new Scanner(System.in);	
		
		int i;
		int contamayus; contamayus=0;
		int contaminus; contaminus = 0;
		int contanum; contanum = 0;
		String frase;
		
		
		System.out.println( "teclee una frase");
		frase=teclado.nextLine();
		
		while (frase.length() > 80){
			
			System.out.println( "teclee una frase menor de 80 caracteres");
			frase=teclado.nextLine();
		}//end while
		
		for(i=0; i < frase.length(); i++){
			
			if(frase.charAt(i)>=65 && frase.charAt(i)<=90){
				contamayus ++;
			
			
			}else if(frase.charAt(i)>=97 && frase.charAt(i)<=122){
				contaminus ++;
			
			
			}else if (frase.charAt(i)>=48 && frase.charAt(i)<=57){
				contanum ++;
			}//end else if
		}//end for
		System.out.println( "se han introducido " + contamayus + " mayusculas " + contaminus + " minusculas y " + contanum + "numeros");
		


			
			
		
		
		
		
		
		
	}//end main

}//end class
