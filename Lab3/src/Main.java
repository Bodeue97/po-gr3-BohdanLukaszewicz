
import java.util.Random;



public class Main {






    public static void main(String[] args) {
        Random r = new Random();

        int n = r.nextInt(100-1)+1;
        int[] tab = new int[n];
        for (int i = 0; i <=n-1; i++){
            tab[i] = r.nextInt(1000+999)-999;
            System.out.println(tab[i]);
        }
        //a
//        int counter1 = 0;
//        int counter2 = 0;
//        for(int i = 0; i <=tab.length-1; i++) {
//            if (tab[i] % 2 == 0)
//                counter1++;
//            if (tab[i] % 2 != 0)
//                counter2++;
//        }
//
//        System.out.println("Parzystych jest: " + counter1+ "\n Nieparzystych jest: "+counter2);

        //b
//        counter1 = 0;
//        counter2 = 0;
//        int counter3 = 0;
//        for(int i = 0; i <=tab.length-1; i++) {
//            if (tab[i] > 0)
//                counter1++;
//            if (tab[i] < 0)
//                counter2++;
//            if (tab[i] == 0)
//                counter3++;
//        }
//
//
//        System.out.println("dodatnich jest: "+ counter1+"\nujemnych jest: "+counter2+"\nzer jest:"+counter3);

        //c

//        int counter1 = 0;
//        int max = tab[0];
//        for(int i = 0; i <= n-2; i++){
//            if(max < tab[i+1])
//                max = tab[i+1];
//        }
//        for(int i = 0; i<=n-1; i++){
//            if(tab[i] == max)
//                counter1++;
//        }
//        System.out.println("max = "+max+"\n ilosc max w tablicy: "+counter1);


        //d traktuje zero jako element, który nie wystepuje w zadnym ze zbiorow
//        int suma1 = 0;
//        int suma2 = 0;
//        for(int i = 0; i<=n-1; i++){
//            if(tab[i] > 0)
//                suma1+=tab[i];
//            if(tab[i] < 0)
//                suma2+=tab[i];
//
//
//        }
//        System.out.println("suma dodatnich: "+ suma1 +"\nsuma ujemnych: "+suma2);

        //e

//        int count1 = 0;
//        int count2 = 0;
//        for(int i = 0; i<=n-1; i++){
//            if(tab[i] > 0)
//                count1++;
//            if(tab[i] < 0) {
//                if(count1 < count2)
//                count1 = 0;
//                else {
//                    count2 = count1;
//                    count1 = 0;
//                }
//
//            }
//
//        }
//        System.out.println("długosc: " + count2);
        //f
//        for(int i = 0; i<=n-1;i++){
//            if(tab[i] > 0)
//                tab[i] = 1;
//            if(tab[i] < 0)
//                tab[i] = -1;
//            System.out.println(tab[i]);
//        }
        //g
        int lewy = r.nextInt(n-1)+1;
        int prawy = r.nextInt(n-1)+1;
        if(prawy < lewy) {
            int bufor = lewy;
            lewy = prawy;
            prawy = bufor;
        }
        int bufor;



        System.out.println("prawy = "+ prawy + "\nlewy = "+lewy);
        for(int i = 0; i <=n-1; i++){
            for(int j = n-1; j>=0; j-- ){
                if(lewy-1 >= prawy-1)
                    break;
            if(i == lewy-1 && j == prawy-1){
                bufor = tab[lewy-1];
                tab[lewy-1] = tab[prawy-1];
                tab[prawy-1] = bufor;
                lewy++;
                prawy--;

            }

            }
        }


            for(int i = 0; i <=n-1; i++){
                System.out.println(tab[i]);
            }




        System.out.println(n);



    }
}
