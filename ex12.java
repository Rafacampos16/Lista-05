import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o preco do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite o codigo de origem do produto: ");
        int codigoOrigem = scanner.nextInt();


        String regiao = "";
        double porcentagemFrete = 0.0;

        switch (codigoOrigem) {
            case 1:
                regiao = "Norte";
                porcentagemFrete = 10.0;
                break;
            case 2:
            case 5:
            case 9:
                regiao = "Sul";
                porcentagemFrete = 3.0;
                break;
            case 3:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                regiao = "Leste";
                porcentagemFrete = 1.2;
                break;
            case 7:
            case 20:
                regiao = "Oeste";
                porcentagemFrete = 7.3;
                break;
            default:
                regiao = "Importado";
                porcentagemFrete = 22.2;
                break;
        }

        double valorFrete = preco * (porcentagemFrete / 100);
        double precoFinal = preco + valorFrete;


        System.out.println("Regiao de procedencia: " + regiao);
        System.out.println("Valor do frete: R$ " + String.format("%.2f", valorFrete));
        System.out.println("Valor final a ser pago: R$ " + String.format("%.2f", precoFinal));

    }
}
