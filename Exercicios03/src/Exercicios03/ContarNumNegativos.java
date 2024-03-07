package Exercicios03;
import java.util.Scanner;

public class ContarNumNegativos {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contadorNegativos = 0;

        System.out.print("Digite o primeiro valor: ");
        double valor1 = entrada.nextDouble();
        if (valor1 < 0) {
            contadorNegativos++;
        }

        System.out.print("Digite o segundo valor: ");
        double valor2 = entrada.nextDouble();
        if (valor2 < 0) {
            contadorNegativos++;
        }

        System.out.print("Digite o terceiro valor: ");
        double valor3 = entrada.nextDouble();
        if (valor3 < 0) {
            contadorNegativos++;
        }

        System.out.println("Quantidade de valores negativos: " + contadorNegativos);

        entrada.close();
    }

}
