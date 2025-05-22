package Primeiro;

import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.println("Insira o número a ser analisado: ");
		float num=x.nextFloat();
		
		System.out.println(num%2==0 ? "Par" : "Ímpar");
		x.close();
	}
}
