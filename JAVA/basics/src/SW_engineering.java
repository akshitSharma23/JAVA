import java.util.*;

public class SW_engineering {

    public static void arrange(int n,String[] name,int[] exp){
        int k=0;
        String nam="";
        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if(exp[i]<exp[j]){
                    k=exp[j];
                    exp[j]=exp[i];
                    exp[i]=k;
                    nam=name[i];
                    name[i]=name[j];
                    name[j]=nam;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the total number of traveller in your group ");
        int n=in.nextInt();
        String[] name=new String[n];
        int[] exp=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("the name of "+i+" member");
            name[i]=in.next();}
        for(int i=0;i<n;i++){
            System.out.println("enter the expense done by "+name[i]);
            exp[i]=in.nextInt();
        }
        arrange(n,name,exp);

        for(int i=0;i<n;i++){
            int e=exp[i]/n;
            for(int j=i+1;j<n;j++){
                System.out.println(name[j]+" outstanding to "+name[i]+" --> "+(e-exp[j]/n));
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(name[i]+" ---> "+exp[i]);
        }
    }
}
