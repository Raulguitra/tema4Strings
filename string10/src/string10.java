import java.util.Scanner;
public class string10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase1;
		String frase2;
		
	

		int desplazamiento;
		
		int i;
		int j;
		
		frase2 = "";
				int desplazamiento2;
		
		String frase3;
		int l;
		int m;
		frase3 = "";	
		String mayus= "HOLA";
		String minus= "abcdefghijklmnopqrstuwxyz";
		



		System.out.println( "teclee una frase");
		frase1=teclado.nextLine();
		
		

		for(i=0; i <frase1.length(); i++){
			for(j=0; j < mayus.length(); j++){
				
					if (j+ 1 >= mayus.length()){
						frase2 += mayus.charAt((j + 1) % mayus.length());
					}//end if
					else{
						frase2 += mayus.charAt(j + 1);
					}
					
				}

		}
		
		System.out.print( frase1);
		System.out.print( frase2);
		
	
		
		
	
		
		
	}
}