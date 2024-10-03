/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturadadosalunos;

import java.util.Arrays;

/**
 *
 * @author ALN
 */
public class Vetor {
 private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

   
    public void adiciona(Aluno aluno) {
          this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
        //recebe um aluno
    }

    
    public Aluno pega(int posicao) {
        //recebe uma posição e devolve o aluno
        return null;
    }

    
    public void remove(int posicao) {
        //remove pela posição
    }

    public boolean contem(Aluno aluno) {
        //descobre se o aluno está ou não na lista
        return false;
    }

    public int tamanho() {
        //devolve a quantidade de alunos
        return 0;
    }

    public String toString() {
        //facilitará na impressão
        return Arrays.toString(alunos);
    }

}
