import java.util.*;

public class varargs {

        static int add(int ...arr){
            int f=0;
            for(int A:arr)
                f=f+A;
            return(f);
        }

    static int add_1(int d,int ...arr){                 // to make one element compulsory
        for(int A:arr)
            d=d+A;
        return(d);
    }


    public static void main(String [] args){
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        int x,y,z,w;
        int k=add(x=1,y=2,z=3,w=4);                             //this is for normal varargs
        int p=add(x,y,z,w,k);
        int v=add(x,y,z,w,k,p);
        System.out.println("the sum of zero elements are "+add());
        System.out.println(k);
        System.out.println(p);
        System.out.println(v);


        int K=add_1(x=1,y=2,z=3,w=4);
        System.out.println(K);
        int V=add_1(1,2,3,4,78);
        System.out.println(V);
        //System.out.println("the sum of zero elements are "+add_1());        // error
        System.out.println(add_1(5));
        }
}
