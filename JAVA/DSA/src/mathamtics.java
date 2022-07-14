import java.util.*;

public class mathamtics {

    /*
    public static long fac(long n){
        if(n<=1)
            return(1);
        return(n*fac(n-1));
    }
    public static long zero(long n){
        if(n%10==0)
            return(1+zero(n/10));
        return(0);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long s=1L;
        for(int i=n;i>0;i--)
            s*=i;
        System.out.println(s);
        System.out.println(fac(n));
        int count=0;
        System.out.println(zero(s));
        while(s/10!=0){
            if(s%10!=0)
                break;
            count++;
            s=s/10;
        }
        System.out.println(count);
    }
         */

    /*
    public static int GCF(int a,int b,int n){
        if(n==1)
            return(1);
        if(a%n==0&&b%n==0)
            return(n);
        return(GCF(a,b,n-1));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        for(int i=Math.min(a,b);i>=1;i--)
            if(a%i==0&&b%i==0){
                System.out.println(i+" is the GCF");
                break;
            }
        System.out.println(GCF(a,b,Math.min(a,b)));
    }
         */

    /*          eculidean algorithms

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        while(b != a){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println(a);
    }
         */

    /*                      optimal eculidean algorithm


    public static int HCF(int a,int b){
        if(b==0)
            return(a);
        else
            return(HCF(b,a%b));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        System.out.println(HCF(a,b));
    }
         */

    /*                  LCM Least common multiple
    public static int LCM(int a, int b){
        for(int i=1;i>0;i++) {
            if (Math.max(a, b) * i % a == 0 && Math.max(a, b) * i % b == 0)
                return (Math.max(a,b)*i);
        }
    return(0);
    }

    public static int LCM_1(int a,int b){
        int i=1,x=Math.max(a,b),y=Math.min(a,b);
        while(true){
            if((x*i)%y==0)
                return(x*i);
            i++;
        }
    }

    public static int LCM1(int a,int b){
        if(b==0)
            return(a);
        return(LCM1(b,a%b));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        //System.out.println(LCM(a,b));
        System.out.println(a*b/LCM1(a,b));
    }
       */

/*
    public static boolean prime(int a){
        int f=0;
        if(a<2)
            return(false);
        if(a%2==0 || a%3==0)
            return(false);
        for(int i=5;i*i<a;i+=6)
            if(a%i==0 || a%i+2==0){
                return(false);
            }
        return(true);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(prime(a));
    }
    */
/*
    public static boolean prime(int a){
        if(a<2)
            return(false);
        if(a==2 || a==3)
            return(true);
        if(a%2==0 || a%3==0)
            return(false);
        for(int i=5;i*i<a;i++)
            if(a%i==0 || a%(i+2)==0)
                continue;
        return(true);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        for(int i=a;i<b;i++)
            System.out.println(i+" --> "+prime(i));
    }
     */

    /*
    public static int primef(int a){
        int f=0;
        if(a<2){
            return(0);
        }
        else if(a%2==0){
                System.out.println(2);
                return (primef(a / 2));
            }
        else if(a%3==0){
                System.out.println(3);
                return(primef(a/3));
            }
        else {
            for (int i = 5; i * i <=a; i+=6) {
                if (a % i == 0){
                        System.out.println(i);
                        //a/=i;
                        return (primef(a / i));
                    }
                if (a % i + 2 == 0){
                        System.out.println(i + 2);
                        //a/=i+2;
                        return (primef(a / i + 2));
                    }
            }
        }
        System.out.println(a);
        return(primef(0));
    }*/

/*
    public static void primef(int a){
        if(a<2)
            System.out.println("input is not valid");
        while(a%2==0){
            System.out.println(2);
            a/=2;
        }
        while(a%3==0){
            System.out.println(3);
            a/=3;
        }
        for(int i=5;i*i<=a;i+=6){
            if(a%i==0){
                System.out.println(i);
                a/=i;
            }
            if(a%i+2==0){
                System.out.println(i);
                a/=i+2;
            }
        }
        if(a>1)
            System.out.println(a);
    }
     */

    /*
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        primef(a);
    }
    */

    /*
    public static void divide(int a){
        int i=2,q=0;
        if(a<2)
            System.out.println(a);
        while(i<=a){
            int x=0,y=0;
            if(a%2==0)
                if(a%i==0){
                    System.out.println(i);
                    x=2;
                    i++;
                }
            if(a%3==0){
//                if(q==0){
//                    i=3;
//                    q++;
//                }
                if(a%i==0){
                    System.out.println(i);
                    y=3;
                }}
            if(x==0 && y==0){
                System.out.println(a);
                break;
            }
            else if(x==0 && y==3)
                i+=2;
            else if(x==2 && y==0)
                i+=1;
            else
                i++;
    }}

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        divide(a);
    }*/

    public static int GCF(int a,int b){
        /*if(a==b)
            return(a);
        else{
            if(a>b)
                return(GCF(a-b,b));
            else
                return(GCF(a,b-a));
        }*/
        if(b==0)
            return(a);
        return(GCF(b,a%b));
    }

    public static int LCM(int a, int b,int i){
        /*for(int i=1;i<a*b;i++) {
            if ((b * i) % a == 0){
                b=b*i;
                break;
            }
        }
    return(b);*/

        if((b*i)%a==0)
            return(b*i);
        return(LCM(a,b,i+1));
    }

    public static int LCM_1(int a,int b){
        if(b==0)
            return(a);
        return(LCM_1(b,a%b));
    }
/*
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        System.out.println(GCF(a,b));
        //System.out.println(LCM(Math.min(a,b),Math.max(a,b),1));
        System.out.println(a*b/LCM_1(a,b));
    }*/

    public static boolean prime(int a){
        if(a<2)
            return(false);
        if(a==2||a==3)
            return(true);
        if(a%2==0 || a%3==0)
            return(false);
        for(int i=5;i*i<a;i+=6)
            if(a%i==0)
                return(false);
        return(true);

    }
/*
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(prime(a));
    }*/


    public static int prime_1 (int a){
        if(a<2)
            return(1);
        if(a%2==0){
            System.out.println(2);
            return(prime_1(a/2));}
        if(a%3==0){
            System.out.println(3);
            return(prime_1(a/3));}
        else{
            for(int i=5;i*i<a;i+=6){
                if(a%i==0){
                    System.out.println(i);
                    return(a/i);}
                else if(a%i+2==0){
                    System.out.println(i);
                    return(a/i+2);}}
            System.out.println(a);
            return(prime_1(a/a));}
    }
/*
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(prime_1(a));
    }*/


    public static int factor(int a){
        if(a%2==0)
            return(2);
        else if(a%3==0)
            return(3);
        else
            for(int i=5;i*i<a;i+=6)
                if(a%i==0)
                    return(i);
                else if(a%i+2==0)
                    return(i+2);
            return(a);
    }
/*
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int n=1;
        while(a>2){
            n=factor(a);
            a=a/n;
            System.out.println(n);
        }
    }*/

    public static void div(int a){
        for(int i=1;i*i<=a;i++) {
            if (a % i == 0)
                System.out.println(i);
        }
        System.out.println(a);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        div(a);
    }
}