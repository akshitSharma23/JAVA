import java.util.*;
import java.lang.*;

public class practice_set1 {
    public static void main(String[] args) {
        //float n=0;
        Scanner in=new Scanner(System.in);
        /*for(int i=0;i<3;i++){
            n=n+in.nextInt();
        }
        float k=n/(3*10);
        System.out.println("CGPA is "+k);
        System.out.println("what's your name ");
        String name=in.nextLine();
        System.out.println("hello "+name);
        System.out.println("enter distance in km");
        float km=in.nextFloat();
        float l=(float)(km/1.609);
        System.out.println(l);*/
        if(in.hasNextInt())
            System.out.println("input is integer");
        else
            System.out.println("input is not integer");
    }
}
