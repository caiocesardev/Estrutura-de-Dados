package Exercicios03;
import java.util.Scanner;

public class VerificarTriangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double lado1, lado2, lado3;
		
		System.out.println("Digite o primeiro lado do triangulo: ");
		lado1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo lado do triangulo: ");
		lado2 = entrada.nextDouble();
		
		System.out.println("Digite o terceiro lado do triangulo");
		lado3 = entrada.nextDouble();
		
		if(lado1 == lado2 && lado2 == lado3) {
		System.out.println("É um triângulo equilátero.");
		} else {
			System.out.println("Não é um triângulo equilátero");
		}
		entrada.close();
	}
}
