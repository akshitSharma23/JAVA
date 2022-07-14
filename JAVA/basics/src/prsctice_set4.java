import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;

public class prsctice_set4 {
    static void table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + (i * a));
        }
    }

    static void star(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void star1(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star2(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j >= a - 1 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void star3(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == i || j == (a - 1 - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void star4(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void star5(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j < a - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void star6(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < (a * 2) - 1; j++) {
                if (j >= ((a - 1) - i) && j <= ((a - 1) + i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = 5;
        //table(a);
        //star(a);
        //star1(a);
        //star2(a);
        //star3(a);
        //star4(a);
        //star5(a);
        //star6(a);
        //char v='C';
        //v=(char)(v+4);
        //System.out.println((char)(v+i));
        /*char grade = 'C';
        grade = (char) (grade + 8);
        System.out.println("encrypt --> " + grade);
         */
        
    }
}