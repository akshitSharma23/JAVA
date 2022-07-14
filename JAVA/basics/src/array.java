import java.util.*;
public class array {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        /*
        int[] marks={81,20,32,57,16};
        boolean[] TF=new boolean[2];
        TF[0]=true;
        TF[1]=false;
        String[] name={"akshit","arahan","aarush"};
        System.out.println(marks[1]);
        System.out.println(name[1]);
        System.out.println(TF[1]);
        int[] rollno=new int[1];
        rollno[0]=10;
        String[] letter=new String[4];
        letter[0]="p";
        letter[1]="K";
        letter[2]="Z";
        letter[3]="z";
        System.out.println("the length is "+marks.length);
        Arrays.sort(marks);
        Arrays.sort(letter);
        System.out.println(marks[4]+" "+letter[3]);
        System.out.println(Math.max(20,10));
        System.out.println(Math.min(20,10));
        System.out.println((int)(Math.random()*100));
                 */

        // practice

        /*Random a=new Random();
        int o=a.nextInt(0,10);
        System.out.println(o);



        float[] k={10.0f,20.5f,45.7f, 67.8f, 63.4f, 99.2f};
        float[] m= new float[5];
        float h=0f;
        for(int i=0;i<5;i++){
            m[i]=in.nextFloat();
            h=h+m[i];}
        System.out.println("thr sum is "+h);
                 */



        /*
        int[] arr={1,2,3,4,5,6,7,8};
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println("\nenter the number");
        int n=in.nextInt(),k=-1;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==n)
                k=i;
        if(k>-1)
            System.out.println("number found at "+(k+1)+" location");
        else
            System.out.println("number is not found");
                     */


        /*
        System.out.println("enter the size of an array");
        int n=in.nextInt(),d=0;
        int[] arr=new int[n];
        for(int i=1;i<=n;i++){
            System.out.print("enter the element "+i+" ");
            arr[i-1]=in.nextInt();
            d=d+arr[i-1];
        }
        System.out.println("the avg is "+(d/n));
                 */


        /*
        int[][] m1={{1,2},{1,2,3}},m2={{1,2},{1,2,3}},m3=new int[2][3];
        for(int i=0;i<m1.length;i++)
            for(int j=0;j<m1[i].length;j++){
                m3[i][j]=m1[i][j]+m2[i][j];
                System.out.println(m3[i][j]);
            }
                     */


        /*
        int[] arr={1,3,5,7,9};
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(" "+arr[i]);
        System.out.println();
                 */



        /*
        int[] arr1={3,3,5,7,9,11,13,15,17,19,21,23,25,27,25};
        int g=0;
        if(arr1.length==0)
            System.out.println("array has no element ");
        else{
            for(int i=1;i<arr1.length;i++){
               if(arr1[i-1]>arr1[i]){
                   g=-1;
                   break;
               }
            }
            if(g==-1)
                System.out.println("array is not sorted");
            else
                System.out.println("array is sorted");
        }

        int[] arr={3,3,5,7,9,-1,11,13,29,15,17,19,21,23,25,27,25};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];}
        System.out.println("the maximum element is "+max);
        System.out.println("the minimum element in array is "+min);
                 */


        int[] arr={3,3,5,7,9,11,13,15,17,19,21,23,25,27};
        boolean s=true;
        for(int i=0;i<arr.length-1;i++)
            if(arr[i]>arr[i+1]){
                s=false;
                break;
            }
        if(s==true)
            System.out.println("array is sorted");
        else
            System.out.println("array is not sorted");
    }
}