import java.util.Scanner;
public class ex7 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		
		int valor1, valor2;
		
		System.out.println("Entre com um valor 1: ");
		valor1 = leia.nextInt();
		System.out.println("Entre com um valor 2: ");
		valor2 = leia.nextInt();
		
		if (valor1 > valor2){
			 System.out.println("Os valores em ordem crescente sao: " + valor2 + ", " + valor1);
		} else if(valor2 > valor1){
			System.out.println("Os valores em ordem crescente sao: " + valor1 + ", " + valor2);
		}else {
			System.out.println("Os valores sao iguais: " + valor1 + ", " + valor2);
		}
	}
}


/*Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrevê-los em ordem crescente.*/
