
package org.yourcompany.calculadora;


import java.util.Scanner;

/**
 * Classe Calculadora amb diversos mètodes de càlcul bàsic.
 * 
 * @author Dunia
 */

 
public class Calculadora {

    /**
     * Mètode principal que mostra exemples d’ús dels mètodes de la classe.
     *
     * @param args Arguments de la línia d’ordres (no s’utilitzen)
     */

     public static void mostrarMenuConsola (){
            System.out.println("Supermenú: ");
            System.out.println("[1] Suma dels primers X números");
            System.out.println("[2] Factorials d'un número");
            System.out.println("[3] Suma dels quadrats dels primers X números");
            System.out.println("[4] Potència d'un número");
            System.out.println("[5] Calcular si es primer el número");
            System.out.println("[6] Calcular si el número és perfecta");
            System.out.println("[7] Nombre de digitrs d'un número");
            System.out.println("[0] Sortir");

    }
    

        // Exemples de crida per al mètode nombreDigits
        /*System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));
        */

        // Exemples de crida per al mètode sumaPrimersNumeros
        //System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        //System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        //System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
        //System.out.println("Factorial de 5: " + calcularFactorial(5));
        //System.out.println("Factorial de 7: " + calcularFactorial(7));
        //System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        //System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        //System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        //System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        //System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        //System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        //System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

        // Exemples  Crida a la Resta de mètodes aquí
        // 


        // Fer menú aquí:

    public static void main(String[] args) {

        Scanner teclat = new Scanner (System.in);
        int opcio;

        mostrarMenuConsola();
        opcio=teclat.nextInt();
        while (opcio != 0) {
            switch (opcio){
             case 1: {
                    System.out.print("Introdueix n: ");
                    int n1 = teclat.nextInt();
                    System.out.println("Suma: " + sumarPrimersNumeros(n1));
                    break;
                }

                case 2: {
                    System.out.print("Introdueix n: ");
                    int n2 = teclat.nextInt();
                    System.out.println("Factorial: " + calcularFactorial(n2));
                    break;
                }

                case 3: {
                    System.out.print("Introdueix n: ");
                    int n3 = teclat.nextInt();
                    System.out.println("Suma dels quadrats: " + sumaQuadrats(n3));
                    break;
                }

                case 4: {
                    System.out.print("Introdueix la base: ");
                    int base = teclat.nextInt();
                    System.out.print("Introdueix l'exponent: ");
                    int exp = teclat.nextInt();
                    System.out.println("Potència: " + calcularPotencia(base, exp));
                    break;
                }

                case 5: {
                    System.out.print("Introdueix un número: ");
                    int n5 = teclat.nextInt();
                    System.out.println(n5 + (esPrimer(n5) ? " és primer" : " no és primer"));
                    break;
                }

                case 6: {
                    System.out.print("Introdueix un número: ");
                    int n6 = teclat.nextInt();
                    System.out.println(n6 + (esPerfecte(n6) ? " és perfecte" : " no és perfecte"));
                    break;
                }

                case 7: {
                    System.out.print("Introdueix un número: ");
                    int n7 = teclat.nextInt();
                    System.out.println("Nombre de dígits: " + nombreDigits(n7));
                    break;
                }

                default: {
                    System.out.println("Opció no vàlida, torna-ho a intentar.");
                    break;
                }
            }
            mostrarMenuConsola();
            opcio = teclat.nextInt();
        }

    System.out.println("Sortint de la SuperCalculadora...");
}   

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
//1 
    public static int sumarPrimersNumeros(int n) {
      
        int suma = 0; 

        for (int i = 1; i <= n; i++){
            suma +=i;
            
        }
        return suma;
        }
//2 + sumarPrimersNumeros(n);
                
    public static int calcularFactorial(int n) {
        int factorial = 1; 

        for (int i = 1; i<=n; i++){
            factorial = factorial * i;
        }
        return factorial; 
    }
    //3
    public static int sumaQuadrats (int n) {
        int quadrats = 0;

        for (int i = 1; i<=n; i++){
            quadrats += i * i; 
        }
        return quadrats; 
    }
    //4
    public static int calcularPotencia(int base, int exponent) {
        int potencia = 1; 

        for (int i=1; i<=exponent; i++){

            int multi = 0; 

            for (int o = 1; o <= base; o++){
                multi += potencia; 
            }
            potencia = multi;
        }
        return potencia;
    }
//5
    public static boolean esPrimer(int n) {
        boolean primo = true; 
        
        if (n<= 1){
            primo = false;
        }else{
            for (int i = 2; i < n; i++){
                if (n%i==0){
                    primo = false;
                }
            }
        }
        return primo;
        
        }
//6
    public static boolean esPerfecte(int n) {
        int sumaDiv = 0; 
        boolean perfecto = false; 
        
        for (int i = 1; i<n; i++){
            if (n%1==0){
                sumaDiv +=i;
            }
        }
        if (sumaDiv == n){
            perfecto = true; 
        }
        return perfecto;
    }
//7
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1;
        }
        int comptador = 0;
        nombre = Math.abs(nombre);
        while (nombre > 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }
}
