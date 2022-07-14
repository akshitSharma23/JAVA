import java.util.*;

public class recursion_1 {
    /*static int power(int a, int b){
        if(b==0)
            return 1;
        return a*power(a,b-1);
    }     */
/*
    static int rec_add(int a){
        if(a==0)
            return(0);
        return a+rec_add(a-1);
    }
    public static void main(String[] args){
        //System.out.println(power(3,4));
        System.out.println(rec_add(10));
    }
 */

    public static int func(int a,int x,int y,int z){
        if(a==0)
            return(0);
        if(a<0)
            return(-1);
        int f=func(a-x,x,y,z);
        int g=func(a-y,x,y,z);
        int h=func(a-z,x,y,z);
        int l=Math.max(f,g);
        l=Math.max(l,h);
        if(l==-1)
            return(-1);
        else
            return(l+=1);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),x=2,y=5,z=7;
        System.out.println(func(a,x,y,z));
    }
}
