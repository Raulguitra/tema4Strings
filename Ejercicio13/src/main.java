


import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*13.-Dado un numero n le�do por teclado encontrar el numero p primo mas cercano a
		�l por exceso.
		*/
		
		int num;
		int divisor;
		int contadiv;
		int pp;
		boolean encontrado;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		
		while (num <= 0){
			System.out.println("Escribe un numero pero mayor que cero: ");
			num=teclado.nextInt();
		}
			pp = num;
			encontrado = false;
			
			while(encontrado = false){ 
				pp = pp + 1;
				contadiv= 0;
				for( divisor = 2; divisor == pp-1; divisor++){
					if(pp % divisor==0){
						contadiv=contadiv+1;
					}
				}
						
						if( contadiv==0){
						encontrado = true;
						}
			}
						System.out.println("el numero primo mas cercano a " + num + " exceso es " + pp);
				
			
	
		
			

	}

}
