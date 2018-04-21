package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void test1() {
		
/*Instanciando o objeto model da classe Modelo*/
		Modelo model = new Modelo();
		
/*Cadastrando uma lista de livros dentro de model*/
		model.cadastrarLivro(new Livro("Harry Potter","Fantasia","1234","J. K. Rollin","7","2001","10","A23A", false));
		model.cadastrarLivro(new Livro("Lord of the Rings","Fantasia","5647","Token","5","2011","11","A51A", false));
		model.cadastrarLivro(new Livro("Da'Vinci Code","Suspense","5236","Dan Brown","4","2010","7","D23C", false));
		model.cadastrarLivro(new Livro("Pântano de Sangue","Aventura","5678","Pedro Bandeiras","8","1998","3","B23C", false));
		model.cadastrarLivro(new Livro("Pai Rico, Pai Pobre","Auto-Ajuda","89726","Robert Kiosak","5","2013","10","H12C", false));
		model.cadastrarLivro(new Livro("Pai Rico, Pai Pobre","Auto-Ajuda","23648","Robert Kiosak","5","2013","10","K25S", true));
		model.cadastrarLivro(new Livro("Pokemon","Infantil","698457","Desconhecido","1","1998","1","R23D", true));

/*Testes do método cadastrarLivro*/
		assertEquals(model.getLivros().get(0).getAutor(), "J. K. Rollin");
		assertEquals(model.getLivros().get(2).getGenero(), "Suspense");
		assertEquals(model.getLivros().get(4).getTitulo(), model.getLivros().get(5).getTitulo());
		assertEquals(model.getLivros().get(4).getDisponivel(),false);
		assertEquals(model.getLivros().get(3).getEstante(), "B23C");
		assertEquals(model.getLivros().size(), 7);
	}


@Test
public void test2() {
	
/*Instanciando o objeto model da classe Modelo*/
	Modelo model = new Modelo();
	
/*Cadastrando uma lista de livros dentro de model*/
	model.cadastrarLivro(new Livro("Harry Potter","Fantasia","1234","J. K. Rollin","7","2001","10","A23A", false));
	model.cadastrarLivro(new Livro("Lord of the Rings","Fantasia","5647","Token","5","2011","11","A51A", false));
	model.cadastrarLivro(new Livro("Da'Vinci Code","Suspense","5236","Dan Brown","4","2010","7","D23C", false));
	model.cadastrarLivro(new Livro("Pântano de Sangue","Aventura","5678","Pedro Bandeiras","8","1998","3","B23C", false));
	model.cadastrarLivro(new Livro("Pai Rico, Pai Pobre","Auto-Ajuda","89726","Robert Kiosak","5","2013","10","H12C", false));
	model.cadastrarLivro(new Livro("Pai Rico, Pai Pobre","Auto-Ajuda","23648","Robert Kiosak","5","2013","10","K25S", true));
	model.cadastrarLivro(new Livro("Pokemon","Infantil","698457","Desconhecido","1","1998","1","R23D", true));
	
	assertEquals(model.buscarLivroPorTitulo("Lord of the Rings").get(0).getTomo(),"5647");			
	assertEquals(model.buscarLivroPorTitulo("Pai Rico, Pai Pobre").size(),2);
	
	}

@Test
public void test3() {
	
/*Instanciando o objeto model da classe Modelo*/
	Modelo model = new Modelo();
	
/*Cadastrando uma lista de livros dentro de model*/
	model.cadastrarLivro(new Livro("Harry Potter","Fantasia","1234","J. K. Rollin","7","2001","10","A23A", false));
	model.cadastrarLivro(new Livro("Lord of the Rings","Fantasia","5647","Token","5","2011","11","A51A", false));
	model.cadastrarLivro(new Livro("Da'Vinci Code","Suspense","5236","Dan Brown","4","2010","7","D23C", false));
	model.cadastrarLivro(new Livro("Pântano de Sangue","Aventura","5678","Pedro Bandeiras","8","1998","3","B23C", false));
	model.cadastrarLivro(new Livro("Pai Rico, Pai Pobre","Auto-Ajuda","89726","Robert Kiosak","5","2013","10","H12C", false));
	model.cadastrarLivro(new Livro("Pai Rico, Pai Pobre","Auto-Ajuda","23648","Robert Kiosak","5","2013","10","K25S", true));
	model.cadastrarLivro(new Livro("Pokemon","Infantil","698457","Desconhecido","1","1998","1","R23D", true));
	
	assertEquals(model.buscarLivroPorTomo("5647").getAutor(),"Token");			
	assertEquals(model.buscarLivroPorTomo("1234").getTitulo(),"Harry Potter");
	
	}


}
