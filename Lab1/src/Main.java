public class Main {

    public static void main(String[] args) {
        //Zad1

        System.out.println(31+29+31);
        //Zad2
        int suma = 0;
        for (int i = 1; i <=10; i++){
            suma+=i;

        }
        System.out.println(suma);
        //Zad3
        int iloczyn = 1;
        for (int i = 1; i <=10; i++){
            iloczyn*=i;

        }
        System.out.println(iloczyn);
        //Zad4
        float stanKonta = 1000;
        for (int i = 1; i <=3; i++){
            stanKonta+=stanKonta*0.06;
            System.out.println("Saldo po " + i + " roku/latach wynosi "+stanKonta);


        }
        //Zad5

        System.out.println("______\n|JAVA|\n------");

        //Zad6
        System.out.println("   /////  \n  +\"\"\"\"\"+\n(| o   o |)\n  |  ^  |\n  | `_\' |\n  +-----+");
        //Zad7

        System.out.println("" +
                "* * *                     *                     *                       *       \n" +
                "*     *                   *                     *                       *       \n" +
                "*    *                    *                *    *                       *       \n" +
                "* * * *        * * *      * * * *             * *           *       *   *     * \n" +
                "*      *     *       *    *      *              * *         *       *   *   *   \n" +
                "*       *   *         *   *      *              *    *      *       *   * *     \n" +
                "*      *     *       *    *      *              *           *       *   *   *   \n" +
                "* * * *        * * *      *      *              * * * * *     * * *     *     *  ");


        //Zad8
        System.out.println("    +    \n   + +   \n  +   +  \n +-----+ \n |     | \n | .-. | \n | | | | \n +-+-+-+ ");
    }

}
