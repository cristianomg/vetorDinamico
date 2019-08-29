package Sistema.classes;

import Vetor.classes.Vetor;

public class Disciplina {
	private final int codigoDisciplina;
	private final String nome;
	private final Vetor<AlunoDisciplina> alunos = new Vetor<AlunoDisciplina>();
	private float maiorMedia;
	
	
	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public String getNome() {
		return nome;
	}
	public Vetor<AlunoDisciplina> getAlunos() {
		return alunos;
	}
	
	public float getMaiorMedia() {
		return maiorMedia;
	}
	public Disciplina(int codigoDisciplina, String nome) {
		this.codigoDisciplina = codigoDisciplina;
		this.nome = nome;
	}
	
	public void cadastrarAluno(AlunoDisciplina aluno) {
		this.alunos.adicionar(aluno);
		if (this.maiorMedia <= aluno.getMedia()) {
			this.maiorMedia = aluno.getMedia();
		}
	}
	
}
