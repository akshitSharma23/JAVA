import java.util.*;

public class recursion {
    /*
    public static int func(int a){
        if(a==0)
            return(0);
        System.out.println(a);
        return(func(a-1));
    }*/
    /*
    public static int func(int a,int b){
        if(a<b)
            return(0);
        System.out.println(b);
        return(func(a,b+1));
    }*/
    /*
    public static int func(int a){
        if(a==0)
            return(0);
        func(a-1);
        System.out.println(a);
        return(0);
    }*//*
    public static int func(int a,int b){
        if(a==1)
            return(b);
        return(func(a-1,b*a));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(func(a,1));
    }*/
/*
    public static int sumofdigit(int a){
        if(a<=0)
            return 0;
        return a%10+sumofdigit(a/10);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(sumofdigit(a));
    }*/
/*
    public static int rope(int n,int a,int b,int c){
        if(n==0)
            return 0;
        if(n<0)
            return-1;
        int x=rope(n-a,a,b,c);
        int y=rope(n-b,a,b,c);
        int z=rope(n-c,a,b,c);
        x=Math.max(x,y);
        x=Math.max(x,z);
        if(x==-1)
            return -1;
        else
            return x+1;
    }

    public static void main(String[] args){
        System.out.println(rope(23,14,12,11));
    }
*/
/*
    public static void subset(String a, String k,int i){
        if(i==a.length()){
            System.out.println(k);
            return;}
        subset(a,k,i+1);
        System.out.println(i);
        subset(a,k+a.charAt(i),i+1);

    }

    public static void main(String[] args){
        subset("abcc","",0);
    }*/
/*
    public static void subset(String n, String curr, int i){
        if(i==n.length()){
            System.out.println(curr);
            return;
        }
        subset(n,curr,i+1);
        subset(n,curr+n.charAt(i),i+1);
    }


    public static void main(String[] args){
        subset("abc","",0);
    }*/
    /*
    public static void tower(int i,char A,char B,char C){
        if(i==1){
            System.out.println("move 1 from "+A+" to "+C);
            return;
        }
        tower(i-1,A,C,B);
        System.out.println("move "+i+" from "+A+" to "+C);
        tower(i-1,B,A,C);
    }*/
/*
    public static void tower(int n,char a,char b,char c){
        if(n==1){
            System.out.println("move disk "+n+" from "+a+" to "+c);
            return;
        }
        tower(n-1,a,c,b);
        System.out.println("move disk "+n+" from "+a+" to "+c);
        tower(n-1,b,a,c);
    }

    public static void main(String[] args){
        tower(3,'A','B','C');
    }*/
/*
    public static int joes(int n, int k){
        if(n==0)
            return 0;
        return (joes(n-1,k)+k)%n;
    }

    public static void main(String[] args){
        System.out.println(joes(6,3));
    }
*/

    /*
    public static void setcount(String n, String s,int i){
        if(i==n.length()){
            System.out.println(s);
            return;
        }
        setcount(n,s,i+1);
        setcount(n,s+n.charAt(i),i+1);
    }
    public static void main(String[] args){
        setcount("123","",0);
    }
*/
/*
    public static void tower(int n, char A,char B,char C){
        if(n==1){
            System.out.println("move "+n+" from "+A+" to "+C);
            return;
        }
        tower(n-1,A,C,B);
        System.out.println("move "+n+" from "+A+" to "+C);
        tower(n-1,B,A,C);
    }

    public static void main(String[] args){
        tower(3,'A','B','C');
    }*/

    /*
    public static int setcount(int[] arr, int n,int sum){
        if(n==0)
            if(sum==0)
                return 1;
            else
                return 0;
        return setcount(arr,n-1,sum)+setcount(arr,n-1,sum-arr[n-1]);
    }

    public static void main(String[] args){
        int[] arr={10,20,15};
        System.out.println(setcount(arr,3,25));
    }
*/
/*
    public static String pal(String n){
        if(n.length()==0 || n.length()==1){
            return("yes");
        }
        if(n.charAt(0)==n.charAt(n.length()-1)){
            return pal(n.substring(1,n.length()-1));}
        else{
            return("no");
        }
    }

    public static void main(String[] args){
        System.out.println(pal("racecar"));
    }*/
/*
    public static int countset(int[] arr,int n,int sum){
        if(n==0)
            if(sum==0)
                return 1;
            else
                return 0;
        return countset(arr,n-1,sum)+countset(arr,n-1,sum-arr[n-1]);
    }

    public static void main(String[] args){
        int[] arr={10,20,15};
        System.out.println(countset(arr,arr.length,25));
    }
*/
/*
    public static void per(String n,String curr,int i){
        if(curr.length()==n.length()){
            System.out.println(curr);
            return;
        }
        for(int j=i;j<n.length()-1;j++){
            curr+=n.charAt(i);
            per(n,curr,i++);
        }
    }*/

   /* public static void main(String[] args){
        per("abc","",0);
    }*/
}