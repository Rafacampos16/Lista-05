import java.util.Scanner;
public class ex3 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		
		int qntd; 
		double maca;
		
		System.out.println("Entre com a quantidade de maca compradas: ");
		qntd = leia.nextInt();
		
		if (qntd >= 12){
			maca =  1.00;
		} else {
			maca = 1.30;
		}
		
		double custoTotal = qntd * maca;

        System.out.printf("O custo total da compra eh: R$ %.2f%n", custoTotal);
	}
}

/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
compradas, calcule e escreva o custo total da compra.. */
