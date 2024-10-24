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
        return animais [posicao];
    }

    public void remove(int posicao) {
          if (posicao >= 0 && posicao < totalDeAnimais) {
            for (int i = posicao; i < totalDeAnimais - 1; i++) {
                this.animais[i] = this.animais[i + 1];
            }
          totalDeAnimais--;
            this.animais[totalDeAnimais] = null; // limpar a última posição
          }
    }

    public boolean contem(Animais animal) {
        for (int i = 0; i < totalDeAnimais; i++) {
            if (animais.equals(animais[i])) {
                return true;
            }
        }
        return false;
    }


    public int tamanho() {
        //devolve a quantidade de alunos
        return totalDeAnimais;
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
