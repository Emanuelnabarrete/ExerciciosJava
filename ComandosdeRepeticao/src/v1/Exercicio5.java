//5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
//números. 

package v1;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int soma = 0;
		 int num = 0;
		
		
		for(int i = 1; i<= 10; i++) {
			System.out.println("Digite um numero : ");
			 num = sc.nextInt();
			 soma = soma + num;
			
		}
		System.out.println("A soma dos numeros é : " + soma);
		sc.close();
	}
		
}
