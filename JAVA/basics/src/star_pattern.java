import java.util.*;

public class star_pattern {
    public static void main(String[] args) {
        /*
        for(int i=0;i<5;i++){
            for(int j=0;j<=8;j++){

                if(j>=(4-i)&&j<=(4+i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
                 */


        /*
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= (i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
         */

        /*
        for(int i=0;i<5;i++){
            for(int j=0;j<=8;j++){

                if(j>=(4-i)&&j<=(4+i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.print("\n");
        }
                 */

        /*
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                if(j==i||j==4-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
                 */

        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(i%2==0&&j>5-i&&j<5+i&&j%2==0)
                            System.out.print("*");
                else if(i%2!=0&&j>5-i&&j<5+i&&j%2!=0)
                            System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}