import java.util.*;

public class methodCALL {                           // there are 3 ways to call a method
    static int sum(int x,int y){                    // one by using static keyword ---> call same as other programming language
        return(x+y);                                // and other 2 are using public keyword or just keep it empty
    }                                                        // ----> call by declaring objects
    int sub(int x,int y){
        return x-y;
    }
    public int mul(int x, int y){
        return(x*y);
    }
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        System.out.println("enter 2 the number");
        int a=in.nextInt(), b=in.nextInt();
        methodCALL obj0=new methodCALL();                   // object creation
        int c=obj0.sub(a,b);                                // method call upon an object    -->  associated to object of class
        int e=sum(a,b);                             // direct method call for static keyword  --> associated with class
        int d=obj0.mul(a,b);                                // method call upon an object
        System.out.println(c+", "+e+", "+d);
    }
}
