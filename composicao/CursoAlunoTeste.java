package oo.composicao;

public class CursoAlunoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Thiago");
		Aluno aluno3 = new Aluno("Marcos");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Html");
		Curso curso3 = new Curso("CSS");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso3);
		
		for (Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso de " + curso1.nome);
			System.out.println("Meu nome é: " + aluno.nome);
			
		}
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
		
		if (cursoEncontrado  != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);			
		}
	}

}
