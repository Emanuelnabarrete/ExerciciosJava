//3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes. 

package v1;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		System.out.print("Qual seu nome :");
		String nome = sc.next();
		
		while(i<=10) {
			System.out.println("");
			System.out.println(nome);
			i++;
		}
			sc.close();
	}

}
