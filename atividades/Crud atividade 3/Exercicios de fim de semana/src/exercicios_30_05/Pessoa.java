package exercicios_30_05;

public class Pessoa {

	String nome;
	int anoDeNascimento;
	String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Pessoa(String nome, int anoDeNascimento) {
		super();
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
	}
	
	
}
