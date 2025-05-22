package quinto;

import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Insira a string a ser invertida: ");
		String inverter=x.nextLine();
		String invertida= new StringBuilder(inverter).reverse().toString();
		System.out.println("A string invertida é: "+invertida);
		x.close();
	}
}
