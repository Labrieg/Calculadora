import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
        System.out.print("Informe dois números: ");

        double primeiro = reader.nextDouble();
        double segundo = reader.nextDouble();
        System.out.print("Informe um operador (+, -, *, /): ");
        char operador = reader.next().charAt(0);
        double resultado;
        switch(operador)
        {
            case '+':
                resultado = primeiro + segundo;
                break;
            case '-':
                resultado = primeiro - segundo;
                break;
            case '*':
                resultado = primeiro * segundo;
                break;
            case '/':
                resultado = primeiro / segundo;
                break;

            default:
                System.out.printf("Erro! operador não está correto");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", primeiro, operador, segundo, resultado);
    }

	}

