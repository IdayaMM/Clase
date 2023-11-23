import java.util.Scanner;
public class CalculadoraEuros {
	
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		final double FACTOR_CONV = 166.386; //Sirve para dividir. Las constantes se declaran en mayuscula
		
		System.out.println("Introduce una cantidad en pesetas: ");
		int pesetas = teclado.nextInt();//Para que se lean las pesetas 
		
		System.out.printf("La cantidad en euros es %.2f",(pesetas/FACTOR_CONV));//%.2f para q salgan 2nº dps de la coma (lo q sta entre parentesis es la division de pesets a eur)
		
		teclado.close();
	}
}