/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.Scanner;

/**
 *
 * @author Achxron
 */
public class MitjanaArrays {

    public static void main(String[] args) {
        Scanner teclat = new Scanner (System.in);
        int suma = 0; 
        
        int [] llista = new int [5];  

        for (int i = 0; i < llista.length; i++){
            llista [i]= teclat.nextInt();   
            suma = suma + llista[i];
        }


        System.out.println();

        double mitjana = suma * 1.0/llista.length;

        System.out.println();

        System.out.println("Has entrat aquests nombres: ");

        for (int i = 0; i<llista.length; i++){
            System.out.print (llista[i] + " ");
        }

        System.out.println();
    
        System.out.println("S u m a : ");
        System.out.println(suma);

        System.out.println();

        System.out.println("M i t j a n a : ");
        System.out.println(mitjana);
        
        System.out.println();

        System.out.println("Valors més petits: ");
        for (int i = 0; i<llista.length; i++){
            if (llista[i] < mitjana){
                System.out.print(llista[i] + " ");
            }
        }

        System.out.println();


        System.out.println("Varlos més grans: ");
        for (int i = 0; i < llista.length; i++){
            if (llista[i] > mitjana){
                System.out.print(llista[i] + " ");
            }
        }   

    }
}
