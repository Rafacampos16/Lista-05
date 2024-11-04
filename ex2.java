import java.util.Scanner;

public class ex2 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		
		int valor;
		
		System.out.println("Entre com um valor: ");
		valor = leia.nextInt();
		
		if (valor >= 0){
			System.out.print("POSITIVO");
		}else {
			System.out.print("NEGATIVO");
		} 
	}
}

/*Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo
(considere o valor zero como positivo).
*/
