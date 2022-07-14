import java.util.*;
import java.lang.*;
import java.math.*;

public class practice2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        /*float k=7/4.F*9/2.F;
        System.out.println(k);
       */

        char grade='C';
        grade=(char)(grade+8);
        System.out.println("encrypt --> "+grade);
        //decrypt
        grade=(char)(grade-8);
        System.out.println("decrypt --> "+grade);
        /*
        System.out.println((int)(Math.random()*100));

        int a=in.nextInt();
        System.out.println(a>8);

        float v=3,u=5,a=4,s=7;
        System.out.println(((v*v)-(u*u)/(2*a*s)));

        int a=7;
        System.out.println((7*49)/7+(35/7));
        double d=1000*10000;
        System.out.println(d);
                 */
    }
}
