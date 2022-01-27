import java.util.Scanner;

public class NumeroParImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa un numero = ");
		int numero = input.nextInt();
		if(numero%2==0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
		/*System.out.println( input.nextInt() % 2==0 ? "El numero es par":"El numero impar");*/
	}
}
