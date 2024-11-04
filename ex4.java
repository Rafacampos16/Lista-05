import java.util.Scanner;
public class ex4 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		
		int nota1, nota2, media;
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("Entre com a segunda nota: ");
		nota2 = leia.nextInt();
		
		//media aritimetica
		media = (nota1 + nota2) / 2;
		
		if (media >= 6){
			System.out.print("APROVADO");
		} else{
			System.out.print("REPROVADO");
		}
		
		System.out.print("\nSua media final foi: " + media);
	}
}

/*Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
também a média calculada.*/
