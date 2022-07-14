import java.util.*;

public class methodOVERLOAD {
    static void joke() {
        System.out.println("A ham sandwich walks into a bar and orders a beer, bartender says \"sorry, we don’t serve food here\"");
    }

    public void joke(String k) {
        System.out.println(k + " is a good boy");
        System.out.println("java is easy language");
    }

    public void joke(String k, String m) {
        System.out.println(k + " is a good boy");
        System.out.println(m + " is a good boy");
    }

    public void joke(int t, int r) {
        System.out.println(t);
        System.out.println(r);
    }

    //public int joke(int g, int q){
        // return(g+q);                                 --> error --> method overloading cannot be performed by changing the return type of method
    //}
    static int joke(int t, int r,int e){
        return(t+r+e);
    }


    static void change(int[] a){        //in case of arrays the reference is passed
        a[0]=98;                       // same with the case for object passing to method
    }

    public static void main(String[] args){
        joke();
        methodOVERLOAD obj1=new methodOVERLOAD();
        obj1.joke("akshit");                    // method overloading is declaring method with same name and same return type but with different parametrs
        String b="arahan";                          // method overloading cannot be performed by changing the return type of method
        obj1.joke("akshit",b);
        obj1.joke(2,4);
        int t=joke(2,3,4);
        System.out.println(t);


        int[] arr={52,73,77,89,98,94};                  // arr is reference of array not a variable who store array
        change(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}