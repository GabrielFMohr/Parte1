package terceiro;

import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		float n=0,nt=0;
		int qn=0;
		
		while(n!=-1)
		{
			System.out.printf("Insira a nota de número %d:",qn);
			n=x.nextFloat();
			if(n==-1)
			{
				break;
			}
			else {
				nt=n+nt;
				qn++;
			}
		}
		System.out.printf(qn>0 ? "A média da turma é "+(nt/qn):"Você não inseriu nenhuma nota");
		x.close();
	}
}
