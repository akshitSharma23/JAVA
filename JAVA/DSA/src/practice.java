import javax.swing.*;
import java.util.*;

public class practice {

    /*
    public static void bubble(int[] arr, int n){
        for(int i=1;i<=n-1;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]+=arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

public static void bubble_1(int[] arr, int n ){
    for(int i=0;i<n-1;i++){
        for(int j=1;j<n-i;j++){
            if(arr[j-1]>arr[j]){
                arr[j-1]+=arr[j];
                arr[j]=arr[j-1]-arr[j];
                arr[j-1]=arr[j-1]-arr[j];
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}

public static void selection(int arr[],int n){
        int swap=0;
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    arr[i]+=arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                    swap+=1;
                    //System.out.println(swap);
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    System.out.println();
    System.out.println("number of swap is "+swap);
}
*/
    /*public static int GCF(int a,int b){
        while(a!=b)
            if(a>b)
                a=a-b;
            else
                b=b-a;
        return(a);*/

       /* if(b==0)
            return(a);
        return(GCF(b,b%a));*/
    /*
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        System.out.println(GCF(a,b));
    }*/


    /*public static int LCM(int a,int b){
        int i=1,x=Math.max(a,b),y=Math.min(a,b);
        while(true){
            if((x*i)%y==0)
                return(x*i);
            i++;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        System.out.println(LCM(a,b));
    }*/
/*
    public static void delete_arr(i-nt n,int arr[], int a){
        for(int i=a-1;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<n-1;i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of an array ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the arraya elemnents");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the index of deletion ");
        int a=in.nextInt();
        delete_arr(n,arr,a);
    }*/

    /*
    public static int pri(int n){
        if(n==0)
            return 0;
        return n%10+pri(n/10);
    }
    public static int count(int a){
        if(a<=9)
            return a;
        return count(pri(a));

    }*/
/*
    public static int fib(int a,int x, int y, int i){
        if(a==i)
            return(y);
        return fib(a,y,x+y,i+1);
    }

    public static void main(String[] args){
        int a=20;
        System.out.println(fib(a,0,1,1));
    }*/
/*
    public static long tower(int n,int A,int B, int H){
        if(n==1){
            System.out.println("move disk "+n+" from rod "+A+" to rod "+B);
            return 1;
        }
        tower(n-1,A,B,H);
        System.out.println("move disk "+n+" from rod "+A+" to rod "+B);
        tower(n-1,H,A,B);
        return((long) Math.pow(2,n)-1);
    }

    public static void main(String[] args){
        System.out.println(tower(3,1,2,3));
    }*/
/*
    public static int jos(int n, int k){
        if(n==1)
            return 0;
        return ((jos(n-1,k))+k)%n;
    }
    public static int aws(int n,int k){
        return 1+jos(n,k);
    }

    public static void main(String args[]){
        System.out.println(aws(3,2));
    }*/
/*
    public static int lucky(int n ,int k){
        if(n==1){
            return 0;
        }
        return (lucky(n-1,k+1)+k)%n;
    }

    public static void main(String[] args){
        System.out.println(lucky(19,2));
    }
*/
/*
    public static boolean luck(int n, int k){
        if(n<k)
            return true;
        if(n%k==0)
            return false;
        return luck(n-n/k,k+1);
    }


    public static void main(String[] args){
        System.out.println(luck(11,2));
    }*/
/*
    public static int power(int n, int p){
        if(p==1)
            return n;
        return n*power(n,p-1);
    }
    public static void main(String[] args){
        System.out.println(power(2,9));
    }*/

    //     aux --> start --> end/*
   /* public static void tower(int n,char a,char b, char c){
        if(n<=1){
            System.out.println("move disk "+n+" from "+b+" to "+c);
            return;
        }
        tower(n-1,c,b,a);
        System.out.println("move disk "+n+" from "+b+" to "+c);
        tower(n-1,b,a,c);
    }

    public static void main(String[] args){
        tower(3,'a','b','c');
    }*/
/*
    static int firstOcc(int arr[], int n, int x)
    {
        int low = 0, high = n - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(x > arr[mid])
                low = mid + 1;
            else if(x < arr[mid])
                high = mid - 1;
            else
            {
                if(mid == 0 || arr[mid - 1] != arr[mid])
                    return mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
*/
/*
    public static int second(int[] arr){
        int max=0,smax=-1,n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[max]){
                smax=max;
                max=i;
            }
            if(arr[i]!=arr[max])
                smax=i;
        }
        return smax;
    }
*/
/*
    public static void rev(int[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int k=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=k;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
*/
    /*
    public static int dup(int[] arr){
        int n=arr.length,res=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1])
                continue;
            else{
                arr[res]=arr[i];
                res++;}
        }
        return res;
    }
*/
/*
    public static void zeros(int[] arr){
        int n=arr.length,pos=-1;
        for (int i=0;i<n;i++){
            if(arr[i]==0 && pos==-1)
                pos=i;
            if(pos!=-1 && arr[i]!=0){
                arr[pos]=arr[i];
                arr[i]=0;
                pos++;
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
*/
/*
    public static void swap(int[] arr,int low,int high){
        while(low<high){
            int h=arr[low];
            arr[low]=arr[high];
            arr[high]=h;
            low++;
            high--;
        }
    }
    public static void move(int[] arr,int d){
        swap(arr,0,d-1);
        swap(arr,d,arr.length-1);
        swap(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
*//*
    public static void leader(int [] arr,int n){
        int k=arr[n-1];
        System.out.print(k+" ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>k){
                k=arr[i];
                System.out.print(k+" ");}
        }
    }*/
/*
    public static void rev(int[] arr,int k,int d){
        for(int i=k;i<=d/2;i++) {
            int h=arr[i];
            arr[i]=arr[d-i];
            arr[d-i]=h;
        }
    }

    public static void move(int[] arr,int d){
        int n=arr.length-1;
        rev(arr,0,d-1);
        rev(arr,d,n+d);
        rev(arr,0,n);
        for(int i=0;i<=n;i++)
            System.out.print(arr[i]+" ");
    }
*//*
    public static void maxdiff(int [] arr,int n){
        int max=0,min=0,l=-1;
        for(int i=1;i<n;i++){
            if(arr[min]>arr[i])
                min=i;
            if(arr[max]<arr[i]){
                if(l==-1)
                    l=max;
                max=i;
            }
            if(l!=-1 && min<max)
                l=min;
        }
        if(l!=-1){
            System.out.println(arr[max]);
            System.out.println(arr[l]);
            System.out.println(arr[max]-arr[l]);}
        else
            System.out.println(l);
    }
*/
/*
    public static int maxdiff(int [] arr,int n){
        int diff=arr[1]-arr[0],k,min=arr[0];
        for(int i=2;i<n;i++){
            min=Math.min(arr[i-1],min);
            diff=Math.max(diff,arr[i]-min);
        }
        return diff;
    }
*/
    /*
    public static int max(int[] arr,int n){
        int diff=-1,k=arr[0],j=arr[n-1];
        int[] l=new int[n];
        int [] h=new int[n];
        l[0]=k;
        h[n-1]=j;
        for(int i=1;i<n;i++){
            l[i]=Math.min(arr[i],l[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            h[i]=Math.max(arr[i],h[i+1]);
        }
//        for(int i=0;i<n;i++)
//            System.out.println(l[i]+" "+r[i]);
        int low=0,high=0;
        while(low!=n&&high!=n){
            if(l[low]<=h[high]){
                diff=Math.max(diff,(high-low));
                high++;
            }
            else if(l[low]>h[high])
                low++;

        }
        return diff;
    }
     */
/*
    public static int maxdiff(int[] arr,int n){
        int diff=arr[1]-arr[0],min=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[min])
                min=i-1;
            diff=Math.max(diff,arr[i]-arr[min]);
        }
        return diff;
    }
*//*
    public static void freq(int[] arr,int n){
        int k=1;
        for(int i=1;i<n;i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.println(arr[i-1] + " -->" + k);
                k = 1;
            } else
                k++;
            if (i == n - 1)
                System.out.println(arr[n - 1] + " -->" + k);
        }
    }
*/
/*
    public static int stocks(int[] arr,int n){
//        int p=0;
//        for(int i=1;i<n;i++){
//            if(arr[i]>arr[i-1])
//                p+=arr[i]-arr[i-1];
//        }
//        return p;

        int p=0,b=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1])
                p+=arr[i+1]-arr[i];
        }
        return p;
    }*/

    public static int rain(int[] arr,int n){
        
    }
    public static void main(String[] args){
        int[] arr={1,5,3,8,12};
        int n=arr.length;
        System.out.println(stocks(arr,n));
    }
}
