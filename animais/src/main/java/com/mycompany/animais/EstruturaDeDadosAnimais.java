/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animais;

/**
 *
 * @author ALSOLIMA
 */
public class EstruturaDeDadosAnimais {

    public static void main(String[] args) {
        Animais a1 = new Animais("Cachorro");
        Animais a2 = new Animais("Gato");
        Animais a3 = new Animais("Pato");
        Animais a4 = new Animais("Hamster");
        Animais a5 = new Animais("Cavalo");
        Animais a6 = new Animais("Vaca");
        Animais a7 = new Animais("Cobra");
        Animais a8 = new Animais("Axolote");
        Animais a9 = new Animais("Rato");
        Animais a10 = new Animais("Cisne");
        
        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);
        lista.adiciona(a5);
        lista.adiciona(a6);
        lista.adiciona(a7);
        lista.adiciona(a8);
        lista.adiciona(a9);
        lista.adiciona(a10);
        
        System.out.println(lista);
    }
    }

