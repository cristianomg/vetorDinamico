/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.util.ArrayList;
import java.util.Scanner;

import Sistema.classes.AlunoDisciplina;
import Sistema.classes.Disciplina;
import Vetor.classes.Vetor;

/**
 *
 * @author cristiano pc
 */
public class App {

    private static Scanner sc;

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int application = 1;
        sc = new Scanner(System.in);
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        String nomeDisciplina;
        int codigoDisciplina = 1;
        AlunoDisciplina aluno;
        boolean realizouOperacao;
        Vetor<AlunoDisciplina> alunos;
        while (application ==1) {
            System.out.println("1- Cadastrar disciplina");
            System.out.println("2- Cadastrar aluno em uma disciplina");
            System.out.println("3- Listar alunos aprovados em uma disciplina");
            System.out.println("4- Listar alunos reprovados em uma disciplina"); 
            System.out.println("5- Listar alunos com a maior nota em uma disciplina");
            System.out.println("6- Trancar aluno em uma disciplina");
            System.out.println("7- Sair");
            int opc = sc.nextInt();
            switch(opc) {
            case 1:
                System.out.println("Nome da disciplina: ");
                nomeDisciplina = sc.next();
                disciplinas.add(new Disciplina(codigoDisciplina, nomeDisciplina));
                codigoDisciplina ++;
                break;
            case 2:
                System.out.println("Nome da disciplina: ");
                nomeDisciplina = sc.next();
                realizouOperacao =false;
                for(Disciplina disciplina: disciplinas){
                    if (disciplina.getNome().equals(nomeDisciplina)){
                        System.out.println("Matricula: ");
                        int matricula = sc.nextInt();
                        System.out.println("Nome do Aluno: ");
                        String nomeAluno = sc.next();
                        System.out.println("nota 1: ");
                        float nota1 = sc.nextFloat();
                        System.out.println("nota 2:");
                        float nota2 = sc.nextFloat();
                        aluno = new AlunoDisciplina(matricula, nomeAluno, nota1, nota2);
                        disciplina.cadastrarAluno(aluno);
                        realizouOperacao = true;
                    }
                }
                if (!realizouOperacao){
                    System.out.println("Disciplina não encontrado!!!");
                }
                break;
            case 3:
                System.out.println("Nome da disciplina: ");
                nomeDisciplina = sc.next();
                realizouOperacao =false;
                for(Disciplina disciplina: disciplinas){
                    if (disciplina.getNome().equals(nomeDisciplina)){
                        System.out.printf("%-15s%-15s%-15s%-15s%s\n", "Matricula", "Aluno", "Nota 1", "Nota 2", "Media");
                        alunos = disciplina.getAlunos();
                        for (int i=0; i<alunos.tamanho(); i++) {
                            aluno = (AlunoDisciplina) alunos.buscar(i);
                            if (aluno.getMedia() >= 6) {
                                System.out.printf("%-15s%-15s%-15s%-15s%s\n",
                                        aluno.getMatricula(), aluno.getNomeAluno(),
                                        aluno.getNota1(), aluno.getNota2(), aluno.getMedia());
                            }
                        }
                        realizouOperacao = true;
                    }
                }
                if (!realizouOperacao){
                    System.out.println("Disciplina não encontrado!!!");
                }
                break;
            case 4:
                System.out.println("Nome da disciplina: ");
                nomeDisciplina = sc.next();
                realizouOperacao =false;
                for(Disciplina disciplina: disciplinas){
                    if (disciplina.getNome().equals(nomeDisciplina)){
                        System.out.printf("%-15s%-15s%-15s%-15s%s\n", "Matricula", "Aluno", "Nota 1", "Nota 2", "Media");
                        alunos = disciplina.getAlunos();
                        for (int i=0; i<alunos.tamanho(); i++) {
                            aluno = (AlunoDisciplina) alunos.buscar(i);
                            if (aluno.getMedia() < 6) {
                                System.out.printf("%-15s%-15s%-15s%-15s%s\n",
                                        aluno.getMatricula(), aluno.getNomeAluno(),
                                        aluno.getNota1(), aluno.getNota2(), aluno.getMedia());
                            }
                        }
                        realizouOperacao = true;
                    }
                }
                if (!realizouOperacao){
                    System.out.println("Disciplina não encontrado!!!");
                }
                break;
            case 5:
                System.out.println("Nome da disciplina: ");
                nomeDisciplina = sc.next();
                realizouOperacao =false;
                for(Disciplina disciplina: disciplinas){
                    if (disciplina.getNome().equals(nomeDisciplina)){
                        System.out.printf("%-15s%-15s%-15s%-15s%s\n", "Matricula", "Aluno", "Nota 1", "Nota 2", "Media");
                        float maiorMedia = disciplina.getMaiorMedia();
                        alunos = disciplina.getAlunos();
                        for (int i=0; i<alunos.tamanho(); i++) {
                            aluno = (AlunoDisciplina) alunos.buscar(i);
                            if (aluno.getMedia() == maiorMedia) {
                                    System.out.printf("%-15s%-15s%-15s%-15s%s\n",
                                        aluno.getMatricula(), aluno.getNomeAluno(),
                                        aluno.getNota1(), aluno.getNota2(), aluno.getMedia());
                            }
                        }
                        realizouOperacao = true;
                    }
                }
                if (!realizouOperacao){
                    System.out.println("Disciplina não encontrado!!!");
                }
                break;
            case 6:
                System.out.println("Nome da disciplina: ");
                nomeDisciplina = sc.next();
                realizouOperacao =false;
                for(Disciplina disciplina: disciplinas){
                    if (disciplina.getNome().equals(nomeDisciplina)){
                        System.out.println("Nome do aluno! ");
                        String nomeAlunoTrancar = sc.next();
                        alunos = disciplina.getAlunos();
                        int posicaoAluno =0;
                        for(AlunoDisciplina alunoTrancar: alunos){
                            if (alunoTrancar.getNomeAluno().equals(nomeAlunoTrancar)){
                                System.out.println("entrou");
                                alunos.remover(posicaoAluno);
                                realizouOperacao = true;
                                break;
                            }
                            posicaoAluno++;
                        }
                    }
                }
                if (!realizouOperacao){
                    System.out.println("Disciplina não encontrado!!!");
                }
                break;
            case 7:
                    application = 0;

            }


    }



    }
    
}
