import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int continuar = 1;
		
		final String MENSAGEM_RESULTADO =  "Resultado: ";

		double numero1;
		double numero2;
		int operacao;
		
		do {
			System.out.println("Escolha a operacao desejada:");
			System.out.println("1 - Adicao");
			System.out.println("2 - Subtracao");
			System.out.println("3 - Multiplicacao");
			System.out.println("4 - Divisao");
			operacao = scan.nextInt();
			
			System.out.println("Digite o primeiro numero:");
			numero1 = scan.nextInt();
			System.out.println("Digite o segundo numero:");
			numero2 = scan.nextInt();
			
			switch(operacao) {
			case 1:
				System.out.println(MENSAGEM_RESULTADO + Adicao(numero1, numero2));
				break;
			case 2:
				System.out.println(MENSAGEM_RESULTADO + Subtracao(numero1, numero2));
				break;
			case 3:
				System.out.println(MENSAGEM_RESULTADO + Multiplicacao(numero1, numero2));
				break;
			case 4:
				System.out.println(MENSAGEM_RESULTADO + Divisao(numero1, numero2));
				break;
			default:
				System.out.println("Operacao invalida");
			}
			
			System.out.println("Deseja fazer outra operacao?");
			System.out.println("1 - Sim");
			System.out.println("0 - Nao");
			continuar = scan.nextInt();
		}while(continuar == 1);
	}

	public double Adicao(double num1, double num2){
		return num1 + num2;
	}

	public double Subtracao(double num1, double num2){
		return num1 - num2;
	}

	public double Multiplicacao(double num1, double num2){
		return num1 * num2;
	}

	public double Divisao(double num1, double num2){
		return num1 / num2;
	}
}
