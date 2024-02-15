/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areaquadrado;
import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {
        float lado, area;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print ("Informe o lado de um quadrado em metros: ");
        lado = entrada.nextFloat();
        
        area = lado*lado
        
        System.out.printf ("A área do quadrado é: %.2f", area);
      
    }
}
