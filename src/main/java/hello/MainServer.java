package hello;

import static spark.Spark.*;


public class MainServer {
	
	final static Modelo model = new Modelo();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 1234;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarLivros();

		Controller controller = new Controller(model);
		
		controller.buscarLivroPorTitulo();
		controller.buscarLivroPorTomo();
		
    }
    
    public static void inicializarLivros(){
    	model.cadastrarLivro(new Livro("Harry Potter","Fantasia","1234","J. K. Rollin","7","2001","10","A23A", false));
		model.cadastrarLivro(new Livro("Lord of the Rings","Fantasia","5647","Token","5","2011","11","A51A", false));
		model.cadastrarLivro(new Livro("Da'Vinci Code","Suspense","5236","Dan Brown","4","2010","7","D23C", false));
		model.cadastrarLivro(new Livro("Pântano de Sangue","Aventura","5678","Pedro Bandeiras","8","1998","3","B23C", false));
		model.cadastrarLivro(new Livro("Pai Rico, Pai Pobre","Auto-Ajuda","89726","Robert Kiosak","5","2013","10","H12C", false));
		model.cadastrarLivro(new Livro("Pai Rico, Pai Pobre","Auto-Ajuda","23648","Robert Kiosak","5","2013","10","K25S", true));
		model.cadastrarLivro(new Livro("Pokemon","Infantil","698457","Desconhecido","1","1998","1","R23D", true));

    }
}
