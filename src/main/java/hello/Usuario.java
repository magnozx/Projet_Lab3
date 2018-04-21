package hello;

import java.util.List;
import java.util.LinkedList;

public class Usuario {
	private String nome;
	private Endereco endereco;
	private List<String> telefone = new LinkedList<String>();
	private TipoDeCliente tipoDeUsuario;
	
	public Usuario(String nome, Endereco endereco, List<String> telefone, TipoDeCliente tipoDeUsuario){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.tipoDeUsuario = tipoDeUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<String> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<String> telefone) {
		this.telefone = telefone;
	}

	public TipoDeCliente getTipoDeUsuario() {
		return tipoDeUsuario;
	}

	public void setTipoDeUsuario(TipoDeCliente tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}	

}
