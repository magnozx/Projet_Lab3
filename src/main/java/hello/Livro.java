package hello;

public class Livro {
	
	private String titulo;
	private String genero;
	private String tomo;
	private String autor;
	private String edicao;
	private String anoDeEdicao;
	private String volume;
	private String estante;
	private Boolean disponivel;

	
	public Livro(String titulo, String genero, String tomo, String autor, String edicao, String anoDeEdicao, String volume, String estante, Boolean disponivel) {
		this.titulo = titulo;
		this. genero = genero;
		this.tomo = tomo;
		this.autor = autor;
		this.edicao = edicao;
		this.anoDeEdicao = anoDeEdicao;
		this.volume = volume;
		this.estante = estante;
		this.disponivel = disponivel;
		
	}

	
	public String getEstante() {
		return estante;
	}


	public void setEstante(String estante) {
		this.estante = estante;
	}


	public Boolean getDisponivel() {
		return disponivel;
	}


	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}


	public String getTomo() {
		return tomo;
	}


	public void setTomo(String tomo) {
		this.tomo = tomo;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getAnoDeEdicao() {
		return anoDeEdicao;
	}

	public void setAnoDeEdicao(String anoDeEdicao) {
		this.anoDeEdicao = anoDeEdicao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	
	
}
