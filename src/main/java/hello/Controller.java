package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Modelo model;
	
	
	public Controller(Modelo model){
		this.model = model;
	}
	
	public void buscarLivroPorTitulo(){
		get("/livro/:titulo", (req, res) -> {
		
			String titulo = (req.params(":titulo")).replace("%20"," ");
			List<Livro> livrosEncontrados = model.buscarLivroPorTitulo(titulo);	
			return new Gson().toJson(livrosEncontrados);
		});
	}
	
	public void buscarLivroPorTomo(){
		get("/livro2/:tomo", (req, res) -> {
			Livro livroEncontrado = model.buscarLivroPorTomo(req.params(":tomo"));	
			return new Gson().toJson(livroEncontrado);
		});
	}
		
}

