package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
1. Napiszcie program, który będzie potrafił dodawać ułamki zwykłe.
Użytkownik poda licznik i mianownik pierwszego ułamka a następnie drugiego.
Wynik wyświetlcie także w formie ułamka zwykłego.
 */
        Scanner wejscie = new Scanner(System.in);
        float wynikMianownika;
        float wynikLicznika;

        //pierwszy ułamek
        System.out.println("Podaj licznik pierwszego ulamka: ");
        float licznik1 = wejscie.nextFloat();
        System.out.println("Podaj mianownik pierwszego ulamka: ");
        float mianownik1 = wejscie.nextFloat();

        //drugi ułamek
        System.out.println("Podaj licznik drugiego ulamka: ");
        float licznik2 = wejscie.nextFloat();
        System.out.println("Podaj mianownik drugiego ulamka: ");
        float mianownik2 = wejscie.nextFloat();


        if (mianownik1 == mianownik2) {
            wynikLicznika = licznik1 + licznik2;
            wynikMianownika = mianownik1;
        } else {
            wynikLicznika = (licznik1 * mianownik2) + (licznik2 * mianownik1);
            wynikMianownika = mianownik1 * mianownik2;
        }

        System.out.println(wynikLicznika);
        System.out.println("---------");
        System.out.println(wynikMianownika);


    }


}
