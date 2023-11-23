import java.util.Random;
public class NumeroRamdon {
	
	public static void main(String[] args) {
		//Este metodo hasido creado automaticamente
		Random rd;
		rd = new Random();
		
		int numRandom;
		numRandom = 5 + rd.nextInt(10); //Entre 5 y 15
		System.out.printf("%d", numRandom);
		
	}
	
}