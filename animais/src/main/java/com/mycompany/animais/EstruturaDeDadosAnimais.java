/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animais;
import java.util.*;

public class EstruturaDeDadosAnimais {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        Animais a1 = new Animais("Cachorro");
        Animais a2 = new Animais("Gato");
        Animais a3 = new Animais("Pato");
        Animais a4 = new Animais("Hamster");
        Animais a5 = new Animais("Cavalo");
        Animais a6 = new Animais("Vaca");
        Animais a7 = new Animais("Cobra");
  
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);
        lista.adiciona(a5);
        lista.adiciona(a6);
        lista.adiciona(a7);
        
        System.out.println("Animais no Zoologico: " + lista);
        
        System.out.println("Deseja remover algum animal da lista? Por favor digite a posição de 0-9( caso não deseje, digite um número fora do intervalo):");
			int p = entrada.nextInt();

			switch(p){
				case 0: 
					lista.remove(0);
				break;
				case 1: 
					lista.remove(1);
				break;
				case 2: 
					lista.remove(2);
				break;
				case 3: 
					lista.remove(3);
				break;
				case 4: 
					lista.remove(4);
				break;
				case 5: 
					lista.remove(5);
				break;
				case 6: 
					lista.remove(6);
				break;
                                case 7: 
					lista.remove(7);
				break;
                                case 8: 
					lista.remove(8);
				break;
                                case 9: 
					lista.remove(9);
				break;
				default:
					System.out.println("Sem remoção");
			}
       System.out.println("Animais no Zoologico: " + lista);
       System.out.println("Pegar posição 1 do vetor: " + lista.pega(1));
       System.out.println("A lista contém o animal de número 7? :" + lista.contem(a7));
       System.out.println("Tamanho da lista: " + lista.tamanho());
       
       Animais a8 = new Animais("Coelho");
       Animais a9 = new Animais("Capivara");
       Animais a10 = new Animais("Pombo");
       
       lista.adiciona(a8);  
       lista.adiciona(a9);
       lista.adiciona(a10);
       
       System.out.println("Animais no Zoologico: " + lista);
    }
    }


