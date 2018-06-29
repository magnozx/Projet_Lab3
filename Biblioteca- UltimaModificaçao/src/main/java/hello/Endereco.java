package hello;

public class Endereco {
	private String rua;
	private String cep;
	private int numero;
	private String cidade;
	private String bairro;
	
	public Endereco(String rua, String cep, int numero, String cidade, String bairro){
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		this.cidade = cidade;
		this.bairro = bairro;
	}
	
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
