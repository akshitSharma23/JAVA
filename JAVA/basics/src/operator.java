public class operator {
    public static void main(String[] args) {
        //int a = 6 * 5 - 34 / 2;
        /*
         * 30-34/2
         * 30-17
         * 13
         */
        //int b = 60 / 5 - 34 * 2;
        /*
         * 12-34*2
         * 12-68
         * -56
         */
        //System.out.println(a);
        //precedence & associativity
        //System.out.println(b);
        /*
        highest precedence goes to * and /. they are then evaluated on the bases of left ot right associativity
        *,/,% --> 12  L to R
        +,- --> 11    L to R
        () --> 13     L to R
        */
        /*
        int a=5,b=1,c=2;
        int k=b*b-4*a*c;
        System.out.println(k);*/


        //resulting data type
        /*
                                b+s --> int                         b --> byte
                                s+i --> int                         s --> short
                                l+f --> float                       i --> integer
                                i+f --> float                       l --> long
                                c+i --> int                         f --> float
                                c+s --> int                         d --> double
                                l+d --> int                         c --> char
                                f+d --> int

        double is by-default for every decimal language
         float de=3.345;        --> error
         float de=3.345f;       --> f for compiler to know that value is float data type
         */

        int a=654+6;
        System.out.println(a);
    }
}