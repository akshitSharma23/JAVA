import java.util.Scanner;

public class condition_1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        /*System.out.print("enter a number ");
        int x=(int)scan.nextDouble();
        if(x>=30)
            System.out.println("you can buy pen and pencil both");
        else if(x>=20)
            System.out.println("you con buy pen or a pencil");
        else if(x>=10)
            System.out.println("you can buy pencil only");
        else
            System.out.println("you don't have enough money");
        System.out.println(x);
        System.out.println(x);
        if(x<10){
            System.out.println("you can't buy anything");
            System.out.println("go get some more money");
        }
        else if(x>=10 && x<=50){
            System.out.println("you can buy pen or a pencil");
        }
        else
            System.out.println("you can buy both pen and a pencil");         */
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
        String V=scan.nextLine();

        // Write your code here.
        //System.out.println(V);

        System.out.println("String: " +V);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
