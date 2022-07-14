import java.util.*;

public class arr_prob {
    public static void main(String[] args){
        System.out.println("enter the size fo your array");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("time to enter "+n+" elements in array");
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter a number you want a search in array");
        int x=in.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("we found it at "+i+1+" position");
                break;
            }
            else{
                if(i+1==n)
                    System.out.println("element is not present");
                continue;
            }
        }
    }
}