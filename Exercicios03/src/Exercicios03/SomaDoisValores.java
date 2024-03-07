package Exercicios03;
import java.util.Scanner;

public class SomaDoisValores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = entrada.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = entrada.nextInt();
		
		
		
		if (valor1 > valor2 ) {
			System.out.println("O maior valor é: " + valor1);
		} else if(valor2 > valor1) {
			System.out.println("O maior valor é: " + valor2);
		} else {
			System.out.println("Os valores são iguais.");
		}
		
		entrada.close();

	}

}
