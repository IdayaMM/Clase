import java.util.Scanner;

public class Suma {
	
	public static void main (String []args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();
		//Voy a ir sumando en un acumulador siempre el ultimo digito
		//Cada vez que sume el ultimo digito , lo elimino del numero
		//1250 Acumulador = acumulador + 0
		//125 Acumulador = acumulador + 5
		//12 Acumulador = acumulador + 2
		//1 Acumulador = acumulador + 1
		//0 FIN
		int acumulador=0;//Para inicializar las variables aho que poner = .
		while(numero>0) {
			acumulador = acumulador + (numero%10);
			numero = numero / 10;
			System.out.printf("%d/n",numero);
		}
		System.out.printf("La suma de los digitos es: %d", acumulador);
		teclado.close();
	}
	
}