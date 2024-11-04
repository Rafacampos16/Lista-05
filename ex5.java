import java.util.Scanner;
public class ex5 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		
		int ano, nasc, voto;
		
		System.out.println("Entre com o ano atual: ");
		ano = leia.nextInt();
		System.out.println("Entre com o ano em que nasceu: ");
		nasc = leia.nextInt();
		
		voto = ano - nasc;
		
		if (voto >= 16){
			System.out.print("Pode votar!!");
		} else {
			System.out.print("Nao pode votar ainda!!");
		}
	}
}

/*Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu).*/
