/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;
import java.util.Arrays;
/**
 *
 * @author ALSOLIMA
 */
public class Vetor {
  private Animais[] animais = new Animais[10];

  private int totalDeAnimais = 0;

    public void adiciona(Animais animal) {
        this.animais[totalDeAnimais] = animal;
        totalDeAnimais++;
    }


    public Animais pega(int posicao) {
        //recebe uma posição e devolve o aluno
        return null;
    }

    public void remove(int posicao) {
        //remove pela posição
    }

    public boolean contem(Animais animal) {
        //descobre se o aluno está ou não na lista
        return false;
    }

    public int tamanho() {
        //devolve a quantidade de alunos
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        //facilitará na impressão
        return Arrays.toString(animais);
    }

}