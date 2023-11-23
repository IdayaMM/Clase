import java.util.Random;
import java.util.Scanner;
public class Numerosecreto {

	public static void main(String[] args) {
		Random numSecreto; //Creo un objeto de tipo Random
		numSecreto = new Random(); //Mi objeto apunta a la clase Random
		int numOculto; //Crea una variable de tipo entero
		numOculto = 1+numSecreto.nextInt(9); //Le asigno a mi variable un numero
		
		Scanner sc = new Scanner(System.in); //Objeto de la clase Scanner para leer desde teclado
		
		int numero;
		int numIntentos = 5;
		while (numIntentos>0) {
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
			numIntentos--;
			
			if(numero==numOculto) {
				System.out.printf("Enhorabuena, el numero oculto era %d\n",numOculto);
				break;
			}
		}
		if(numIntentos==0) {
			System.out.println("NO HAS ACERTADO EL NUMERO");
		}
		System.out.printf("Te quedaban %d intentos\n",numIntentos);
		sc.close();
	}

}
