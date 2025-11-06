/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.Scanner;

/**
 *
 * @author Achxron
 */
public class ArrayInvertit {

    public static void main(String[] args) {
        Scanner teclat = new Scanner (System.in);
        
        System.out.println("Entra quant medirà l'array: ");
        int mida = teclat.nextInt(); 

        int [] nums = new int [mida];

        System.out.println(" Entra " + mida + " nombres enters");

        for (int i = 0; i < nums.length; i++){
            nums [i] = teclat.nextInt();
        }

        int [] invertit = new int [mida]; 
        for (int i = 0; i < nums.length; i++){
            invertit [i] = nums [nums.length - 1 - i];
        }

        System.out.println("Array invertit: ");
        System.out.println();

        for (int i = 0; i < invertit.length; i++){
            System.out.println(invertit[i] + " ");
        }
    }
    
}

