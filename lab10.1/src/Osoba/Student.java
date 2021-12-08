package Osoba;

import java.time.LocalDate;


public class Student extends Osoba implements Comparable<Student>, Cloneable {
    private double srednia;

    public Student(String nazwisko, LocalDate dataUrodzenia, double srednia) {

        super(nazwisko, dataUrodzenia);
        this.srednia=srednia;
    }




    @Override
    public int compareTo(Student s) {

        int ctr = 0;
        if(super.getNazwisko().compareTo(s.getNazwisko()) > 0){
            ctr+=2;
        }
        if(this.nazwisko.compareTo(s.nazwisko) < 0){
            ctr-=2;
        }
        if(this.dataUrodzenia.compareTo(s.dataUrodzenia) < 0){
            ctr-=1;
        }
        if(this.dataUrodzenia.compareTo(s.dataUrodzenia) > 0){
            ctr+=1;
        }
        return ctr;
    }






}
