
import java.lang.StringBuffer;
import java.io.*;
import java.math.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //a
//        String s = "heheiksde";
//        char c = 'e';
//        System.out.println("w napisie " + s+ " znak " + c + " wystepuje tyle razy: " + countChar(s, c));
//        //b
//        String s = "hehehehihihohohe";
//        String sub = "hehe";
//
//        System.out.println(countSubStr(s, sub));

        //c
//
//        Scanner scn = new Scanner(System.in);
//        String s = scn.next();
//
//        System.out.println(middle(s));
        //d

//        Scanner scn = new Scanner(System.in);
//        String s = scn.next();
//        System.out.println(repeat(s, 10));

        //e
//        String s = "hehehihihehe";
//        String sub = "he";
//        int[] tab = where(s, sub);
//        for(int i = 0; i <=tab.length-1; i++){
//            System.out.println(tab[i]);
//        }

        //f






    }
    public static String change(String str){
        String changed = "";
        StringBuffer sb = new StringBuffer(str);



        return changed;
    }

    public static int[] where(String str, String subStr){
        int n = countSubStr(str, subStr);
        int[] where = new int[n];
        int j = 0;
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i <= sb.length()-1; i++){
            if((sb.length()-1) >= i+subStr.length()-1){
                String s = sb.substring(i, i+subStr.length());
                if(s.equals(subStr)) {
                    where[j] = i;
                    j++;

                }
            }
        }



        return where;
    }


    public static String repeat(String s, int n){
        StringBuffer sb = new StringBuffer();
        String str = s;
        for(int i = 0; i <= n-1; i++){
            sb.append(str);
        }

        return sb.toString();
    }


    public static String middle(String s){

        StringBuffer sb = new StringBuffer(s);
        StringBuffer str = new StringBuffer();
        if (sb.length()%2 == 0){
            str.append(sb.charAt(sb.length()/2-1)).append(sb.charAt(sb.length()/2));
        }
        if(s.length()%2 != 0){
            str.append(sb.charAt(sb.length()/2));
        }

        return str.toString();
    }

    public static int countSubStr(String str, String subStr){
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        if(subStr.length() > str.length())
            return 0;
        for(int i = 0; i <= sb.length()-1; i++){
            if((sb.length()-1) >= i+subStr.length()-1){
                String s = sb.substring(i, i+subStr.length());
                if(s.equals(subStr)) {

                    count++;
                }
            }
        }

        return count;

    }



    public static int countChar(String str, char c){
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i <= sb.length()-1; i++){
            if(sb.charAt(i) == c)
                count++;
        }


        return count;
    }

}
