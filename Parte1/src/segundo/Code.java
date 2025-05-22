package segundo;

import java.util.ArrayList;
import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		ArrayList<Float> lista=new ArrayList<Float>();
		
		int i=0;
		
		while(i<10)
		{
			System.out.printf("Insira o número %d:",i+1);
			lista.add(x.nextFloat());
			i++;
		}
		float maior=0;
		for (Float num : lista) {
			maior= num>maior ? num : maior;
		}
		
		System.out.println(maior);
	}
}
