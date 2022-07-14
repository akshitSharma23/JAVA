import java.util.*;

public class percentage {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter maximum marks achive in a particular subject");
        int a=in.nextInt();
        System.out.println("enter a number of subject you have");
        int n=in.nextInt();
        int[] arr=new int[n];
        int x=0;
        for(int i=0;i<n;i++){
            System.out.print("enter marks of "+(i+1)+"st subject ");
            arr[i]=in.nextInt();
            x=x+arr[i];
        }
    int b=a*n;
        System.out.println(x*100/(a*n)+"%");
    }
}
