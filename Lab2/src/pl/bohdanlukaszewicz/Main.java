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
        //1.2
        float[] liczby2 = new float[10];
        float n = liczby[0];
        for(int i = 0; i<=liczby.length-2; i++) {
            liczby2[i] = liczby[i+1];

        }
        System.out.println("\n\n\n");
        liczby2[liczby2.length-1] = n;
        for(int i = 0; i <=liczby2.length-1; i++){
            System.out.println(liczby2[i]);
        }

        //Zad2
        //2.1
            //a
        int[] naturalne = {1, 2, 3, 4, 5,100, 6, 7, 8, 9, 10};
        int counter = 0;
        for(int i = 0; i<=naturalne.length-1; i++){
            if(naturalne[i] % 2 == 0) {
                counter++;
                }
            }
        System.out.println("\n\n\n\n\n\n\n"+counter+"\n");
            //b
        counter = 0;
        for(int i = 0; i<=naturalne.length-1; i++){
            if(naturalne[i] % 3 == 0 && naturalne[i] % 5 != 0) {
                counter++;
            }
        }
        System.out.println(counter+"\n");

        //c
        counter = 0;
        for(int i = 0; i<=naturalne.length-1; i++){
            if(sqrt(naturalne[i]) % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter+"\n");
        //d
        counter = 0;
        for(int i = 1; i<=naturalne.length-2; i++){
            if(naturalne[i] < (naturalne[i-1]+naturalne[i+1])/2) {
                counter++;
            }
        }
        System.out.println(counter+"\n");

        //e
        counter = 0;
        factorial = 1;
        for(int i = 1; i<=naturalne.length-1; i++){
            factorial*=i;
            if (pow(2, i) < naturalne[i] && naturalne[i] < factorial) {
                counter++;
            }
        }
        System.out.println(counter+"\n");
        //f


    }
}
