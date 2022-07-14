import java.util.*;

public class recursion {
    /*
    static void fib(int n){
        int f=-1,l=1,h=0;
        //System.out.println(f);
        //System.out.println(l);
        for(int i=0;i<n;i++){
            h=f+l;
            System.out.println(h);
            f=l;
            l=h;
        }

    }
    static int  factorial(int a){
        if(a==1 || a==0){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }
    }

    public static void main(String[] args){
        System.out.println(factorial(5));
    }
     */

    /*
    static int factorial(int a){
        if(a==1)
            return 1;
        else
            return (a+factorial(a-1));

    }
    static int bunny(int a){
        int i=2;
        if(a==0)
            return(0);
        else{
            return 2+bunny(a-1);
        }
    }

    static int fib(int a){
        if(a==1||a==2)
            return(1);
        return (fib(a-1)+fib(a-2));

    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();
        //int a=factorial(n);
        for(int i=1;i<=n;i++){
            System.out.println(fib(i));
        }
//        String name="akshit";
//        if(name.equals("akshit"))
//            System.out.println(true);
//        else
//            System.out.println(false);
    }
     */

    /*
    public static int fib_1(int n){
        if(n>=0&&n<2)
            return 1;
        return fib_1(n-1)+fib_1(n-2);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(fib_1(i));
        }
    }
         */

    /*
    public static int bunny_1(int n) {
        if(n==0)
            return 0;
        else if (n % 2 == 0)
            return (3+bunny_1(n-1));
        else
            return(2+bunny_1(n-1));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(bunny_1(n));
    }
     */

    /*
    public static int triangle(int n){
        if(n==0)
            return 0;
        return(n+triangle(n-1));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(triangle(n));
    }
         */

    /*
    public static int sumDigits(int n){
        if(n==0)
            return(0);
        return((n%10)+sumDigits(n/10));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(sumDigits(n));
    }
         */

    /*
    public static int count7(int n){
        if(n==0)
            return(0);
        if(n%10==7)
            return(1+count7(n/10));
        else
            return(0+count7(n/10));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(count7(n));
    }
        */

    /*
    public static int count8(int n){
        if(n==0)
            return(0);
        else if(n%10==8)
            if ((n/10)%10==8 )
                return(2+count8(n/10));
            else
            return(1+count8(n/10));
        else
            return(0+count8(n/10));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(count8(n));
    }
         */

/*
    public static int powerN(int base,int n){
        if(n==0)
            return 1;
        return(base*powerN(base,n-1));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int n=in.nextInt();
        System.out.println(powerN(a,n));
    }
     */

    /*
    public static int countX1(String str,int len){
        if(len==0)
            return (0);
        else if(str.charAt(len-1)=='x')
            return (1+countX1(str,len-1));
        else
            return (0+countX1(str,len-1));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int len=str.length();
        System.out.println(countX1(str,len));
    }
         */

    /*
    public static int countX(String str){
        if(str.length()==0)
            return(0);
        if(str.charAt(0)=='X')
            return(1+countX(str.substring(1)));
        else
            return(0+countX(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(countX(str));
    }
         */

    /*
    public static int countHI(String str){
        if(str.length()==1)
            return(0);
        if(str.substring(0,2).equals("hi"))
            return(1+countHI(str.substring(1)));
        else
            return(0+countHI(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(countHI(str));
    }
         */

    /*
    public static String changeXY(String str){
        if(str.length()==0)
            return(str);
        if (str.charAt(0)=='x'){
            //str=str.replace('x','y');
            return('y'+changeXY(str.substring(1)));}
        else
            return(str.charAt(0)+changeXY(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(changeXY(str));
    }
     */

    /*
    public static String changePi(String str){
        if(str.length()==1 || str.length()==0)
            return(str);
        if(str.substring(0,2).equals("pi"))
            return("3.14"+changePi(str.substring(2)));
        return(str.charAt(0)+changePi(str.substring(1)));
    }

       public static void main(String[] args){
           Scanner in=new Scanner(System.in);
           String str= in.nextLine();
           System.out.println(changePi(str));
       }
            */

    /*
    public static String noX(String str){
        if(str.length()==0)
            return(str);
        if(str.charAt(0)=='x')
            return(noX(str.substring(1)));
        else
            return(str.charAt(0)+noX(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(noX(str));
    }
         */

    /*
    public static boolean array6(int[] arr,int index){
        if(index==arr.length)
            return(false);
        if(arr[index]==6)
            return(true);
        else
            return(array6(arr,index+1));
    }

    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        //System.out.println(arr.length);
        System.out.println(array6(arr,0));
    }
         */

    /*
    public static int array11(int[] arr,int index){
        if(index==arr.length)
            return(0);
        if(arr[index]==11)
            return(1+array11(arr,index+1));
        else
            return(array11(arr,index+1));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.println(array11(arr,0));
    }
         */

    /*
    public static boolean array220(int[] arr,int index){
        if(index==arr.length-1||arr.length==0)
            return(false);
        if(arr[index]*10==arr[index+1])
            return(true);
        return(array220(arr,index+1));
    }

    public static void main(String[] args ){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.println(array220(arr,0));
    }
     */

    /*
    public static String allstar(String str){
        if(str.length()==1||str.length()==0)
            return(str);
        return(str.charAt(0)+"*"+allstar(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(allstar(str));
    }
         */

        /*
    public static String pairStar(String str){
        if(str.length()==1)
            return(str);
        if(str.charAt(0)==str.charAt(1))
            return(str.charAt(0)+"*"+pairStar(str.substring(1)));
        return(str.charAt(0)+pairStar(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(pairStar(str));
    }
             */

    /*
    public static String endX(String str){
        if(str.length()==0)
            return(str);
        if(str.charAt(0)=='x')
            return(endX(str.substring(1))+str.charAt(0));
        return(str.charAt(0)+endX(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(endX(str));
    }
         */

    /*
    public static int countPairs(String str){
        if(str.length()<=2)
            return(0);
        if(str.charAt(0)==str.charAt(2))
            return(1+countPairs(str.substring(1)));
        return(0+countPairs(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(countPairs(str));
    }
         */

    /*
    public static int countAbc(String str){
        if(str.length()<=2)
            return(0);
        if(str.substring(0,3).equals("abc")||str.substring(0,3).equals("aba"))
            return(1+countAbc(str.substring(1)));
        return(0+countAbc(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(countAbc(str));
    }
         */

    /*
    public static int count11(String str){
        if(str.length()<2)
            return(0);
        if(str.substring(0,2).equals("11"))
            return(1+count11(str.substring(2)));
        return(0+count11(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(count11(str));
    }
         */

    /*
    public static String stringClean(String str){
        if(str.length()==1)
            return(str);
        if(str.charAt(0)==str.charAt(1))
            return(stringClean(str.substring(1)));
        return(str.charAt(0)+stringClean(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(stringClean(str));
    }
         */

    /*
    public static int countHi2(String str){
        if(str.length()<=1)
            return(0);
        if(str.length()>=3&&str.substring(0,3).equals("xhi"))
            return(countHi2(str.substring(2)));
        if(str.length()>=2&&str.substring(0,2).equals("hi"))
            return(1+countHi2(str.substring(1)));
        return(countHi2(str.substring(1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(countHi2(str));
    }
     */

    /*
    public static String BIT(String str){
        if(str.charAt(0)==')')
            return(str.substring(0,1));
        if(str.length()==1)
            return(str);
        return(str.charAt(0)+BIT(str.substring(1)));
    }

    public static String parenBit(String str){
        if(str.length()==0)
            return("");
        if(str.charAt(0)=='(') {
            String k = str.substring(0, 1) + BIT(str.substring(1));
            return(k+parenBit(str.substring(1)));
        }
        return(parenBit(str.substring(1)));
    }



    public static String parenBit(String str){
        if(str.length()==0)
            return(str);
        if(str.charAt(0)!='(')
            return(parenBit(str.substring(1)));
        if(str.charAt(str.length()-1)!=')')
            return(parenBit(str.substring(0,str.length()-1)));
        return(str);

    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(parenBit(str));
    }
    */

    /*
    public static boolean nestParen(String str){
        if(str.length()==0)
            return(true);
        if(str.length()==1)
            return(false);
        if(str.charAt(0)=='('&&str.charAt(str.length()-1)==')')
            return(nestParen(str.substring(1,str.length()-1)));
        return(false);
    }

    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        String str=in.nextLine();
        System.out.println(nestParen(str));
    }
         */

/*
    public static int strCount(String str,String sub){
        int l=sub.length();
        if(str.length()<l)
            return(0);
        if(str.length()>=l && str.substring(0,l).equals(sub))
            return(1+strCount(str.substring(1),sub));
        return(0+strCount(str.substring(1),sub));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine(),sub=in.nextLine();
        System.out.println(strCount(str,sub));
    }
         */

    /*
    public static boolean strCopies(String str,String sub,int n){
        if(n==0)
            return(true);
        if(str.length()<sub.length())
            return(false);
        if(str.length()>=sub.length() && str.substring(0,sub.length()).equals(sub))
            return(strCopies(str.substring(1),sub,n-1));
        return(strCopies(str.substring(1),sub,n));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine(),sub=in.nextLine();
        int n=in.nextInt();
        System.out.println(strCopies(str,sub,n));
    }
         */

    /*
    public static int strDist(String str,String sub){
        if(str.length()<sub.length())
            return(0);
        if(str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length(),str.length()).equals(sub))
            return(str.length());
        if(!str.substring(0,sub.length()).equals(sub))
            return(strDist(str.substring(1),sub));
        if(!str.substring(str.length()-sub.length(),str.length()).equals(sub))
            return(strDist(str.substring(0,str.length()-1),sub));
        return(strDist(str,sub));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine(),sub=in.nextLine();
        System.out.println(strDist(str,sub));
    }
     */
    /*
    public static void func(int a){
        if(a==0){
            System.out.println("no digit is same");
            return;}

        else if((a/10)%10==a%10){
            System.out.println("same digit is found");
            return;}
        else
            func(a/10);
    }

    public  static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        func(a);
    }*/

    /*
    public static int func(int a){
        if(a==0)
            return(1);
        return(a*func(a-1));
    }

    public static int func_1(int a){
        if(a<=1)
            return(a);
        else
            return(func_1(a-1)+func_1(a-2));
    }

    public static int func_2(int n){
        if(n==1)
            return(1);
        return(n+func_2(n-1));
    }

    public static String func_3(String n){
        if(n.length()==0||n.length()==1)
            return("yes");
        else if(n.charAt(0)!=n.charAt(n.length()-1))
            return("no");
        else
            return(func_3(n.substring(1,n.length()-1)));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //int a=in.nextInt();
        //System.out.println(func(a));
        //System.out.println(func_1(a));
        //System.out.println(func_2(a));
        String n=in.nextLine();
        System.out.println(func_3(n));
    }*/

    /*
    public static int func(int a){
        if(a==0)
            return(0);
        else
            return(a%10+(func(a/10)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        //System.out.println(func(a));

        /*int z=0;
        for(int i=a;i!=0;i=a){
            z+=a%10;
            a=a/10;
        }
        System.out.println(z);
    }*/

    public static int func(int a,int x,int y,int z){
        if(a==0)
            return(0);
        if(a<0)
            return(-1);
        int q=func(a-x,x,y,z);
        int w=func(a-y,x,y,z);
        int e=func(a-z,x,y,z);
        int t=Math.max(q,w);
        t=Math.max(t,e);
        if(t==-1)
            return(t);
        else
            return(t+=1);
    }

    public static void func_1(String a, String v, int i){
        if(i==a.length()){
            System.out.println(v);
            return;
        }
        func_1(a,v,i+1);
        String h=v+a.charAt(i);
        func_1(a,h,i+1);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //int a=in.nextInt();
//        int x=11,y=9,z=12;
//        System.out.println(func(a,x,y,z));
        String b=in.nextLine();
        func_1(b,"",0);
    }
}