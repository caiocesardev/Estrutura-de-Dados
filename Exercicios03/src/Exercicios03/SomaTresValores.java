package Exercicios03;
import java.util.Scanner;

public class SomaTresValores {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		valor2 = scanner.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		valor3 = scanner.nextInt();
		
		int soma = valor1 + valor2 + valor3;
		System.out.println("A soma dos três valores é: " + soma);
		
		scanner.close();
			
	}
	
}

