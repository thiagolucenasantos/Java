package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	
	final List<Curso> cursos = new ArrayList<Curso>();

	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	//método procurando curso por nome
	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	//método convertendo um objeto para o formato String
		public String toString() {
		return nome;
	}
}
