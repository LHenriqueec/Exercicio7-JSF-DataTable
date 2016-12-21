package com.iveso.exercicio.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.iveso.exercicio.entity.Livro;



@Named
@SessionScoped
public class LivrosBean implements Serializable {

	private List<Livro> livros = new ArrayList<Livro>();
	
	public List<Livro> getLivros() {
		return livros;
	}
	
	public String inserir() {
		Livro livro = new Livro();
		livro.setEdit(true);
		livros.add(livro);
		return null;
	}
	
	public String gravar(Livro livro) {
		livro.setEdit(false);
		return null;
	}
	
	public String alterar(Livro livro) {
		livro.setEdit(true);
		return null;
	}
	
	public String deletar(Livro livro) {
		livros.remove(livro);
		return null;
	}
}
