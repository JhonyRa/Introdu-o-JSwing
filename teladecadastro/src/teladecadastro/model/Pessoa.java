package teladecadastro.model;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String numero;
	private String telefone;
	
	public Pessoa(String nome, String endereco, String numero, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", numero=" + numero + ", telefone=" + telefone + "]";
	}

}
