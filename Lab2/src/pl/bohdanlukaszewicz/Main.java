package pl.bohdanlukaszewicz;
import  java.lang.Math;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        float[] liczby = {1, 2.5F, -3.27F, 4, -5, 6, 7.2F, 8, -9, 10.01F};
        float wynik;
        float wynik2;

    //zad1
        //a
        wynik = 0;
        for(int i = 0; i<=liczby.length-1; i++) {
            wynik+=liczby[i];
        }
        System.out.println(wynik);
        //b
        wynik = 1;
        for(int i = 0; i<=liczby.length-1; i++) {
            wynik*=liczby[i];
        }
        System.out.println(wynik);
        //c
        wynik = 0;
        for(int i = 0; i<=liczby.length-1; i++) {
            wynik+=abs(liczby[i]);
        }
        System.out.println(wynik);
        //d
        wynik = 0;
        for(int i = 0; i<=liczby.length-1; i++) {
            wynik+=sqrt(abs(liczby[i]));
        }
        System.out.println(wynik);
        //e
        wynik = 1;
        for(int i = 0; i<=liczby.length-1; i++) {
            wynik*=abs(liczby[i]);
        }
        System.out.println(wynik);
        //f
        wynik = 0;
        for(int i = 0; i<=liczby.length-1; i++) {
            wynik+=pow(liczby[i], 2);
        }
        System.out.println(wynik);
        //g
        wynik = 0;
        wynik2 = 1;
        for(int i = 0; i<=liczby.length-1; i++) {
            wynik+=liczby[i];
            wynik2*=liczby[i];
        }
        System.out.println(wynik + "\n"+wynik2);
        //h
        wynik = 0;
        for(int i = 0; i<=liczby.length-1; i++) {
            wynik+=pow(-1, i+1)*liczby[i];
        }
        System.out.println(wynik);
        //i
        wynik = 0;
        int factorial = 1;
        for(int i = 0; i<=liczby.length-1; i++) {
            factorial*=i+1;
            wynik+=(pow(-1, i+1)*liczby[i])/factorial;
        }
        System.out.println(wynik);

    }
}
