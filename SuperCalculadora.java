package org.yourcompany.calculadora;

import java.util.Scanner;


public class SuperCalculadora {
//menú para llamar
    public static void mostrarMenuConsola() {
        System.out.println("MENÚ SUPER CALCULADORA");
        System.out.println("1 - Suma dels primers n números");
        System.out.println("2 - Factorial d'un nombre");
        System.out.println("3 - Suma dels quadrats dels primers n números");
        System.out.println("4 - Potència d'un nombre (base ^ exponent)");
        System.out.println("5 - Nombre de dígits d'un nombre");
        System.out.println("6 - Comprovar si un nombre és primer");
        System.out.println("7 - Comprovar si un nombre és perfecte");
        System.out.println("0 - Sortir");
    }

 //primeros nums
    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

//factorial
    public static long calcularFactorial(int n) {
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }

//los cuadra2
    public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

//potencias
    public static int calcularPotencia(int base, int exponent) {
        if (exponent == 0) return 1;
        int resultat = base;
        for (int i = 1; i < exponent; i++) {
            int acumulador = 0;
            for (int j = 0; j < base; j++) {
                acumulador += resultat;
            }
            resultat = acumulador;
        }
        return resultat;
    }

 //número dígitos
    public static int nombreDigits(int n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int comptador = 0;
        while (n > 0) {
            n /= 10;
            comptador++;
        }
        return comptador;
    }

//El primo
    public static boolean esPrimer(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

//777
    public static boolean esPerfecte(int n) {
        if (n <= 1) return false;
        int sumaDivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sumaDivisors += i;
        }
        return sumaDivisors == n;
    }

//vaina para clasificar
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int opcio;

        do {
            mostrarMenuConsola();
            System.out.print("Escull una opció: ");
            opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    System.out.print("Introdueix n: ");
                    int n1 = teclat.nextInt();
                    System.out.println("Resultat: " + sumaPrimersNumeros(n1));
                    break;
                case 2:
                    System.out.print("Introdueix n: ");
                    int n2 = teclat.nextInt();
                    System.out.println("Resultat: " + calcularFactorial(n2));
                    break;
                case 3:
                    System.out.print("Introdueix n: ");
                    int n3 = teclat.nextInt();
                    System.out.println("Resultat: " + sumaQuadrats(n3));
                    break;
                case 4:
                    System.out.print("Introdueix la base: ");
                    int base = teclat.nextInt();
                    System.out.print("Introdueix l’exponent: ");
                    int exp = teclat.nextInt();
                    System.out.println("Resultat: " + calcularPotencia(base, exp));
                    break;
                case 5:
                    System.out.print("Introdueix un nombre: ");
                    int n5 = teclat.nextInt();
                    System.out.println("Té " + nombreDigits(n5) + " dígits.");
                    break;
                case 6:
                    System.out.print("Introdueix un nombre: ");
                    int n6 = teclat.nextInt();
                    System.out.println(esPrimer(n6) ? "És primer." : "No és primer.");
                    break;
                case 7:
                    System.out.print("Introdueix un nombre: ");
                    int n7 = teclat.nextInt();
                    System.out.println(esPerfecte(n7) ? "És perfecte!" : "No és perfecte.");
                    break;
                case 0:
                    System.out.println("Sortint de la SuperCalculadora...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna-ho a provar.");
            }

        } while (opcio != 0);

    }
}
