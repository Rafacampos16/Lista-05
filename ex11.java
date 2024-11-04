import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

   
        System.out.print("Digite a operacao (+, -, *, /): ");
        char operacao = scanner.next().charAt(0); 

        double resultado;

    
        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                System.out.printf("Resultado: %.2f + %.2f = %.2f%n", valor1, valor2, resultado);
                break;
            case '-':
                resultado = valor1 - valor2;
                System.out.printf("Resultado: %.2f - %.2f = %.2f%n", valor1, valor2, resultado);
                break;
            case '*':
                resultado = valor1 * valor2;
                System.out.printf("Resultado: %.2f * %.2f = %.2f%n", valor1, valor2, resultado);
                break;
            case '/':
              
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                    System.out.printf("Resultado: %.2f / %.2f = %.2f%n", valor1, valor2, resultado);
                } else {
                    System.out.println("Erro: Divisao por zero nao eh permitida.");
                }
                break;
            default:
                System.out.println("Operacao invalida. Por favor, use +, -, * ou /.");
                break;
        }
    }
}
