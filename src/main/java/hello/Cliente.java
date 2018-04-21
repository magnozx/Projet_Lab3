package hello;

public class Cliente {
	private String codigoDoCliente;
	private String dataDeCadastro;
	
	public Cliente(String codigoDoCliente, String dataDeCadastro){
		this.codigoDoCliente=codigoDoCliente;
		this.dataDeCadastro=dataDeCadastro;
	}

	public String getCodigoDoCliente() {
		return codigoDoCliente;
	}

	public void setCodigoDoCliente(String codigoDoCliente) {
		this.codigoDoCliente = codigoDoCliente;
	}

	public String getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(String dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

}
