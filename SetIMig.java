/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class SetIMig {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();
        
        System.out.print("Quant vols apostar? ");
        int aposta = teclat.nextInt();
        teclat.nextLine();
        
        double punts = 0;
        char continuar = 's';
        
        while (continuar == 's' && punts <= 7.5) {
            int carta = generador.nextInt(1, 11);
            
            System.out.print("Ha sortit: ");

            if(carta == 8){
                System.out.println("Sota");
                punts = punts + 0.5;
            }
            
            if(carta == 9){
                System.out.println("Cavall");
                punts = punts + 0.5;

            }
            
            if(carta == 10) {
                System.out.println("Rei");
                punts = punts + 0.5;

            }
            
            if(carta >= 1 && carta <= 7) {
                System.out.println(carta);
                punts = punts + carta;
            }
            
            System.out.println("Portes " + punts + " punts");
            
            if(punts > 7.5){
                System.out.println("Has Perdut!!!!");
            }
            
            if(punts == 7.5){
                int guanys = aposta * 2;
                System.out.println("Has Guanyat " + guanys + " euros.");
            }
            
            if(punts < 7.5){
                System.out.print("Vols continuar? (s/n): ");
                continuar = teclat.next().charAt(0);
                
                if(continuar == 'n'){
                    System.out.println("El jugador es planta!!!");
                }
            }
        }

    }
}
