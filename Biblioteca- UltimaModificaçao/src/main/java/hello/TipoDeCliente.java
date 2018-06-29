package hello;

public class TipoDeCliente {
	private Cliente cliente;
	private Funcionario funcionario;
	
	public TipoDeCliente(Cliente cliente){
		this.cliente=cliente;
	}
	
	public TipoDeCliente(Funcionario funcionario){
		this.funcionario=funcionario;
	}
	
	public TipoDeCliente(Cliente cliente, Funcionario funcionario){
		this.cliente=cliente;
		this.funcionario=funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
