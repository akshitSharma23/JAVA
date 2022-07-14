import java.util.*;

public class array_1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        /*
        int[] arr=new int[5];                   //4 bites per block    --> 5block*4bites->20
        int [] srr;
        srr=new int[6];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the number");
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }*/


        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i:arr)
            System.out.print(i);
    }
}
