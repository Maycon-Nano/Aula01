import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		//Criando uma variavel capaz de armazenar valores.
		double valor1;
		double valor2;
		double soma;
		
		System.out.println("Por favor, digite um valor: ");
		valor1 = leitor.nextDouble();
		System.out.println("Por favor, digite o seundo valor: ");
		valor2 = leitor.nextDouble();
		soma = valor1 + valor2;
		System.out.println("A soma entre os dois valores informado é " + soma);
		leitor.close();
	
	}

}
