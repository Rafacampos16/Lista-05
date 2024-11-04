import java.util.Scanner;
public class ex6 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		
		int valor1, valor2;
		
		System.out.println("Entre com um valor 1: ");
		valor1 = leia.nextInt();
		System.out.println("Entre com um valor 2: ");
		valor2 = leia.nextInt();
		
		if (valor1 > valor2){
			System.out.print("O valor 1 eh o mair!!");
		} else if(valor2 > valor1){
			System.out.print("O valor 2 eh o maior!!");
		}else {
			System.out.print("Os valores sao iguais!!");
		}
	}
}

/*) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrever o maior deles.*/
