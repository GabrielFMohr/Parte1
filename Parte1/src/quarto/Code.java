package quarto;

import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.print("Insira o número: ");
		int num=x.nextInt();
		
		for(int i=2;i<=10;i++) {
			System.out.printf("%d x %d = %d\n",num,i,(num*i));
		}
	}
}
