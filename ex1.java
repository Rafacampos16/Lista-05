import java.util.Scanner;

public class ex1 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		
		int valor;
		
		System.out.println("Entre com um valor: ");
		valor = leia.nextInt();
		
		if (valor > 10){
			System.out.println("EH MAIOR QUE 10!");
		} else {
			System.out.println("NAO EH MAIOR QUE 10!");
		}
	}
}

