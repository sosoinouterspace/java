/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Imc {
   
    public static void main(String[] args) {
       float peso, altura, imc;
    
    Scanner entrada = new Scanner (System.in);
    System.out.print ("Entre com seu peso, em Kg: ");
    peso = entrada.nextFloat ();
    
    System.out.print ("Entre com sua altura, em metros: ");
    altura = entrada.nextFloat ();
    
    imc = peso/pow(altura,2)
    
    System.out.printf ("Seu IMC vale: %.2f", imc);
    
    }
}
