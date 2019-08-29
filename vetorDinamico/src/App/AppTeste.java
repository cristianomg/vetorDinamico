/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Vetor.classes.Vetor;

/**
 *
 * @author cristiano pc
 */
public class AppTeste {
    public static void main(String[] args) {
        Vetor vetorTest = new Vetor();
        vetorTest.adicionar(3);
        vetorTest.adicionar(4);
        for(Object vetor: vetorTest){
            System.out.println(vetor);
        }
        vetorTest.remover(1);
        for(Object vetor: vetorTest){
            System.out.println(vetor);
        }
    }

}
