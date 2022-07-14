import java.util.*;

public class hello {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input number");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            boolean flag=false;
            for(int j=0;j*j<=i;j++){
                if(i%j==0)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                System.out.println("number is prime"+i);
            }
        }
    }
}
