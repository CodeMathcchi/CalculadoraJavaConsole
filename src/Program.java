import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int continuar = 1;
		
		int numero1;
		int numero2;
		int operacao;
		
		do {
			System.out.println("Escolha a operação desejada:");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			operacao = scan.nextInt();
			
			System.out.println("Digite o primeiro número:");
			numero1 = scan.nextInt();
			System.out.println("Digite o segundo número:");
			numero2 = scan.nextInt();
			
			switch(operacao) {
			case 1:
				System.out.println("Resultado: " + (numero1 + numero2));
				break;
			case 2:
				System.out.println("Resultado: " + (numero1 - numero2));
				break;
			case 3:
				System.out.println("Resultado: " + (numero1 * numero2));
				break;
			case 4:
				System.out.println("Resultado: " + (numero1 / numero2));
				break;
			default:
				System.out.println("Operação inválida");
			}
			
			System.out.println("Deseja fazer outra operação?");
			System.out.println("1 - Sim");
			System.out.println("0 - Não");
			continuar = scan.nextInt();
		}while(continuar == 1);
	}

}
