package exercicios_30_05; 
import java.util.Date; 
import java.util.Scanner; 
import java.text.DateFormat; 
import java.text.SimpleDateFormat; 
public class CadPessoa { 
	public static void main(String[] args) { 
			Pessoa pessoa = new Pessoa(null, 0); 
			Scanner sc = new Scanner(System.in); 
			System.out.println("Programa que determina se uma pessoa possui idade superior a 17 anos");
			System.out.print("Qual e o seu nome?: "); 
			pessoa.nome = sc.nextLine(); 
			System.out.print("Qual e o seu e-mail?: "); 
			pessoa.email = sc.nextLine();
			System.out.print("Qual e o seu ano de nascimento?: "); 
			pessoa.anoDeNascimento = Integer.parseInt(sc.nextLine()); 
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy"); 
			
			Date date = new Date(); 
			
			int anoAtual = Integer.parseInt(dateFormat.format(date)); 
			
			int idade = anoAtual - pessoa.getAnoDeNascimento(); 
			if (idade > 17){ 
				System.out.println(pessoa.nome + " voce possui maioridade"); 
				}
				else{ 
				System.out.println(pessoa.nome + " voce não possui maioridade");
				} 
			} 
		}
	
