import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		//VARIAVEIS
		int num1, num2, soma;
		
		//LEITURAS 
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		num2 = sc.nextInt();
		
		//SOMA
		soma = num1 + num2;
		
		//RESULTADO
		System.out.println("Resultado: " + soma);
	}
}
