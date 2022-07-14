import java.util.*;

public class fib_number {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int x=-1,y=1;
        //System.out.println(x);
        //)System.out.println(y+x);
        for(int i=0;i<=a-2;i++){
            //System.out.println(y);
            int c=x+y;
            x=y;
            y=c;
            System.out.println(y);
        }
    }
}
