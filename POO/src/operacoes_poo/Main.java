package operacoes_poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		Opera��es Op =  new Opera��es();
		
		System.out.println("Digite os valores");
		
		System.out.println("1� Valor (Inteiro): ");
		int num1 = scanf.nextInt();
	
		System.out.println("2� Valor (Float): ");
		float num2 = scanf.nextFloat(); 
			
		System.out.println("\nOpera��es\n");
            
		Op.setNum1(num1);
		Op.setNum2(num2);
		Op.Somar();
		Op.Subtra��o();
		Op.Divis�o();
		Op.Multiplica��o();
		Op.Fatorial();
			
	}

}
