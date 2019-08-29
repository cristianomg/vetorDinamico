package Sistema.classes;

public class AlunoDisciplina {
	private final int matricula;
	private final String nomeAluno;
	private final float nota1;
	private final float nota2;
	private final float media;
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public float getNota1() {
		return nota1;
	}
	
	public float getNota2() {
		return nota2;
	}
	
	public float getMedia() {
		return media;
	}

	public AlunoDisciplina(int matricula, String nomeAluno, float nota1, float nota2) {
		super();
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = (this.nota1*4 + this.nota2*6)/10;
	}
	
}
