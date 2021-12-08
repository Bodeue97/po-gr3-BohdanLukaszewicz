package Osoba;


import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba> {

    private String nazwisko;
    private LocalDate dataUrodzenia;


    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public int compareTo(Osoba o) {
        int ctr = 0;
        if(this.nazwisko.compareTo(o.nazwisko) > 0){
            ctr+=2;
        }
        if(this.nazwisko.compareTo(o.nazwisko) < 0){
            ctr-=2;
        }
        if(this.dataUrodzenia.compareTo(o.dataUrodzenia) < 0){
            ctr-=1;
        }
        if(this.dataUrodzenia.compareTo(o.dataUrodzenia) > 0){
            ctr+=1;
        }
        return ctr;
    }

    public boolean equals(Osoba o){
        if(this.nazwisko.equals(o.nazwisko) && this.dataUrodzenia.equals(o.dataUrodzenia)){
            return true;
        }
        return false;

    }

    public String toString(){
        String rtn = this.getClass().getSimpleName() + "[" + this.nazwisko + "]" + this.dataUrodzenia;
        return rtn;


    }
}
