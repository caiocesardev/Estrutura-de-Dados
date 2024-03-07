package Exercicios03;
import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroMes;
		
		while(true) {
			System.out.print("Digite o número do mês de 1 a 12: ");
			numeroMes = entrada.nextInt();
			
		
		String nomeMes;
		switch (numeroMes) {
		case 1:
			nomeMes = "Janeiro";
			break;
		case 2:
			nomeMes = "Feveiro";
			break;
		case 3:
			nomeMes = "Março";
			break;
		case 4:
			nomeMes = "Abril";
			break;
		case 5:
			nomeMes = "Maio";
			break;
		case 6:
			nomeMes = "Junho";
			break;
		case 7:
			nomeMes = "Julho";
			break;
		case 8:
			nomeMes = "Agosto";
			break;
		case 9:
			nomeMes = "Setembro";
			break;
		case 10:
			nomeMes = "Outubro";
			break;
		case 11:
			nomeMes = "Novembro";
			break;
		case 12:
			nomeMes = "Dezembro";
			break;
		default:
			System.out.println("O número digitado não corresponde a nenhum mês do ano, por favor digite a seguir um número de 1 a 12.");
			continue;
		}
		System.out.println("O numero "+ numeroMes + " corresponde a o mês de " + nomeMes);
		break;
		}
		entrada.close();		
	}
}
