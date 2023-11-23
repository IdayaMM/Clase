import java.util.Scanner;
public class resta {
	

	public static void main (String []args) {	
	Scanner sc = new Scanner(System.in);
	//Pido el primer numero
	System.out.println("Introduce un numero: ");
	int num1 = sc.nextInt();
	//Pido el segundo numero
	System.out.println("Introduce el segundo numero: ");
	int num2 = sc.nextInt();
	
	if(num1==num2) {
		System.out.println("Los dos numeros introducidos son iguales");
}
	else if(num1>num2) {
	System.out.printf("La resta de %d menos %d es: %d",num1,num2,(num1-num2));
 }
	else System.out.printf("La resta es= %d",(num2-num1));
	//Cierro el objeto scanner
	sc.close();
  }
}

	