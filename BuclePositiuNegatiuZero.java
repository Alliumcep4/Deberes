/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclepositiunegatiuzero;
import java.util.Scanner;
/**
 *
 * @author achxron
 */
public class BuclePositiuNegatiuZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner teclat = new Scanner(System.in);

    System.out.println("Entra una secuencia de números acabada en zero");

    int num = teclat.nextInt(); 

    while (num != 0) {
        if (num > 0) {
            System.out.println("El número " + num + " és positiu");
        } else {
            System.out.println("El número " + num + " és negatiu");
        }

            System.out.println("Introdueix un altre número (0 per acabar):");
        num = teclat.nextInt(); 
        }

            System.out.println("Adéu!");
    }
}