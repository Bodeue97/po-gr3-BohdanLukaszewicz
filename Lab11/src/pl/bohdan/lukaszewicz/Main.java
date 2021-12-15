package pl.bohdan.lukaszewicz;

import pl.bohdan.lukaszewicz.ArrayUtil.ArrayUtil;
import pl.bohdan.lukaszewicz.pair.Pair;
import pl.bohdan.lukaszewicz.pair.PairUtil;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


    Pair<Integer> para = new Pair<Integer>(1, 2);
    para.swap(para);
        System.out.println(para.getFirst());
        System.out.println(para.getSecond());

        Pair para2 = new Pair();
        para2 = PairUtil.swap(para);

        System.out.println(para2.getFirst());
        System.out.println(para2.getSecond());

//        ArrayList<Integer> ar1 = new ArrayList<Integer>();
//        ArrayList<Integer> ar2 = new ArrayList<Integer>();

        ArrayList<LocalDate> ar1 = new ArrayList<LocalDate>();

//        ar1.add(1);
//        ar1.add(2);
//        ar1.add(3);
//        ar1.add(4);
//        ar1.add(4);
//        ar1.add(6);
//
//        ar2.add(1);
//        ar2.add(2);
//        ar2.add(3);
//        ar2.add(4);
//        ar2.add(3);
//        ar2.add(5);
//        ar2.add(6);

        ArrayUtil.isSorted(ar1);
        ArrayUtil.isSorted(ar2);






    }
}
