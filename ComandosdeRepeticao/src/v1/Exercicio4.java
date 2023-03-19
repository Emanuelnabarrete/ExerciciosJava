//4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N
//vezes. 
package v1;
import java.util.Scanner;
public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    int 	i = 1;
		System.out.print("Seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Escreva um numero : ");
		int num = sc.nextInt();
		
		while(i <= num) {
			System.out.println(nome);
			i++;
			
		}
		sc.close();
	}

}
