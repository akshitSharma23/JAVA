import java.util.*;

public class loops {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        /*
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
               if(j<(5-i))
                   System.out.print("*");
               else
                   System.out.print(" ");
            }
            System.out.print("\n");
        }
                 */


        /*
        System.out.println("enter n number you want sum");
        int n=in.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the "+(i+1)+" number");
            int a=in.nextInt();
            c=c+a;
        }
        System.out.println("the sum is "+c);
                 */


        /*
        System.out.println("enter the number");
        int a=in.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(a+" * "+i+" --> "+(a*i));
                     */


        /*
        for(int i=10;i>0;i--)
            System.out.println(10+" * "+i+" --> "+(10*i));
                     */



        /*
        System.out.println("enter n number you want sum");
        int c=0,n=in.nextInt();
        for(int i=n;i>0;i--){
            //System.out.println(i);
            c=c+i;
        }
        System.out.println(c);
                 */



        /*
        System.out.println("enter n number you want sum");
        int c=0,n=in.nextInt(),i=n;
        while(i>0){
            //System.out.println(i);
            c=c+i;
            i--;
        }
        System.out.println(c);
                 */


        /*
        int i=0;
        while(i<5){
            int j=0;
            while(j<5){
                if(j<(5-i))
                    System.out.print("*");
                else
                    System.out.print(" ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
                 */


        /*
        int a=0;
        for(int i=1;i<=10;i++)
            a=a+(8*i);
        System.out.println(a);
                 */


        System.out.println("enter n number you want sum");
        int n=in.nextInt(),c=0,i=0;
        while(i<n){
            System.out.print("enter the "+(i+1)+" number ");
            int a=in.nextInt();
            c=c+a;
            i++;
        }
        System.out.println("the sum is "+c);
    }
}
