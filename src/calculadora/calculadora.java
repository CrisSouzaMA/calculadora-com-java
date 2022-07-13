package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b;
		
		System.out.println("Digite um número:");
		a = scan.nextDouble();
		System.out.println("Digite um numero:");
		b = scan.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("soma:" + soma);
		System.out.println("subtração:" + subtracao);
		System.out.println("multiplicação:" + multiplicacao);
		System.out.println("divisão:" + divisao);
	}

	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
}
