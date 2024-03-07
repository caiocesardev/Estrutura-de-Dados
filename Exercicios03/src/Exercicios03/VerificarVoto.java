package Exercicios03;
import java.util.Scanner;

public class VerificarVoto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if (idade >= 16 && idade <= 17 || idade > 70) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }

        entrada.close();
    }
}