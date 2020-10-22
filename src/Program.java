import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int continuar = 1;
		
		int numero1;
		int numero2;
		int operacao;
		
		do {
			System.out.println("Escolha a opera��o desejada:");
			System.out.println("1 - Adi��o");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			operacao = scan.nextInt();
			
			System.out.println("Digite o primeiro n�mero:");
			numero1 = scan.nextInt();
			System.out.println("Digite o segundo n�mero:");
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
				System.out.println("Opera��o inv�lida");
			}
			
			System.out.println("Deseja fazer outra opera��o?");
			System.out.println("1 - Sim");
			System.out.println("0 - N�o");
			continuar = scan.nextInt();
		}while(continuar == 1);
	}

}
