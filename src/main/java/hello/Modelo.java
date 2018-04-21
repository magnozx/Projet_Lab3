package hello;

import java.util.List;
import java.util.LinkedList;

public class Modelo {
	private List<Livro> livros = new LinkedList<Livro>();
//	private List<Usuario> usuarios = new LinkedList<Usuario>();
	
/*M�todo desenvolvido por Magno*/
	public void cadastrarLivro(Livro livro){
		livros.add(livro);
	}
	

/*M�todo desenvolvido por Magno*/
	public List<Livro> buscarLivroPorTitulo(String titulo){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		for(Livro livro:livros){
			if(livro.getTitulo().equals(titulo)) livrosEncontrados.add(livro);
		}
		return livrosEncontrados;
	}

/*M�todo desenvolvido por Carlos Eduardo*/
	public Livro buscarLivroPorTomo(String tomo){
		Livro livroEncontrado = null;
		for(Livro livro:livros){
			if(livro.getTomo().equals(tomo)) livroEncontrado=livro;
		}
		return livroEncontrado;           
	}

/*M�todo desenvolvido por Carlos Eduardo*/
	public List<Livro> buscarLivroPorTituloAutor(String titulo, String autor){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		for(Livro livro:livros){
			if( (livro.getTitulo().equals(titulo)) && (livro.getAutor().equals(autor))) livrosEncontrados.add(livro);
		}
		return livrosEncontrados;
	}	
	
	
	public List<Livro> getLivros() {
		return livros;
	}


	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}


}
