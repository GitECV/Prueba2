/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen6;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Examen6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int cantidad = 0;
        do{
            System.out.println("Introduce un número entero positivo, para finalizar, introduce uno negativo");
            numero = scan.nextInt();
            String str = String.valueOf(numero);
            String trim = str.trim();
            int logitud = trim.length();
                if("2".equals(trim.substring(logitud-1))){
                    cantidad++;
                }
                
        }while(numero>=0);
        System.out.println("La cantidad de números acabados en 2 es "+cantidad);
    }
    
}