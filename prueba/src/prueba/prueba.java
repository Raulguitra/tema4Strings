
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
		}
			for(k=0; k< frase.length(); k++){
			 if(frase.charAt(k)== 'e'){
					cante ++;
					if (cante>max){
						cante= max;
					}//if
			 }//if
			}
			for(k=0; k< frase.length(); k++){
					 if(frase.charAt(k)== 'i'){
						canti ++;
						if (canti>max){
							canti=max;
						}//if
					 }//if
			}
					 for(k=0; k< frase.length(); k++){
						 if(frase.charAt(k)== 'o'){
							canto ++;
							if (canto>max){
								canto=max;
							}//if
						 }//if
					 }
					 for(k=0; k< frase.length(); k++){
							if(frase.charAt(k)== 'u'){
								cantu ++;
								if (cantu>max){
									cantu=max;
								}//if
							}//if
							
					}//end for

		
			
		
	
		
		
	

		System.out.println( + max +  "  veces la frase tiene " + canta + " a's " + cante + " e's " + "    " + canti + " i`s"+  "   " +canto + " o's " + "    " + cantu + " u`s");


						}
						}
		



	
		
