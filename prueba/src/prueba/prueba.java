
package prueba;

import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);


		//ejercicio 7 programa que de una frase nos diga mayusculas minusculas y numeros que tiene*/




		int canta=0;
		int cante=0;
		int canti=0;
		int canto=0;
		int cantu=0;
		int max=0;



		int k;

		String frase;



		System.out.println( "teclee una frase");
		frase=teclado.nextLine();
		for(k=0; k< frase.length(); k++){
			if(frase.charAt(k)== 'a'){
				canta ++;
				if (canta>max){
					max=canta;
				}//if
			}//if


			if(frase.charAt(k)== 'e'){
				cante ++;
				if (cante>max){
					max=cante;
				}//if
			}//if


			if(frase.charAt(k)== 'i'){
				canti ++;
				if (canti>max){
					max=canti;
				}//if
			}//if

			if(frase.charAt(k)== 'o'){
				canto ++;
				if (canto>max){
					max=canto;
				}//if
			}//if

			if(frase.charAt(k)== 'u'){
				cantu ++;
				if (cantu>max){
					max=cantu;
				}//if
			}//if

		}//end for

		if (max==canta){
			
		System.out.println( "la letra que mas se repite es la A "+ max +  "  veces " );
	}

		if (max==cante){
			
			System.out.println( "la letra que mas se repite es la E "+ max +  "  veces " );
		}

		if (max==canti){
			
		System.out.println( "la letra que mas se repite es la I "+ max +  "  veces " );
	}



		if (max==canto){
			
		System.out.println( "la letra que mas se repite es la O "+ max +  "  veces " );
	}


		if (max==cantu){
			
		System.out.println( "la letra que mas se repite es la U "+ max +  "  veces " );
	}




		System.out.println( " La frase tiene " + canta + " A's " + cante + " E's " + "    " + canti + " I`s"+  "   " +canto + " O's " + "    " + cantu + " U's");


	}
}






