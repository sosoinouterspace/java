/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturadadosalunos;

/**
 *
 * @author ALN
 */
public class Aluno {
    private String nome;
    
    public Aluno (String nome){
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean equals (Object obj){
        Aluno outro = (Aluno) obj;
        return outro.getNome().equals(this.nome);
    }
    
    public String toString() {
    return nome;
    
    }
}