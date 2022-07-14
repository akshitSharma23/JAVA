import java.util.*;

public class multi_arr {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] m1=new int[2][2],m2=new int[2][2],m3=new int[2][2];
        System.out.println("enter next 4 elements");
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                m1[i][j]=in.nextInt();
        System.out.println("enter next 4 elements");
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                m2[i][j]=in.nextInt();

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int c=0;
                for(int k=0;k<2;k++)
                    c=c+m1[i][k]*m2[k][j];
                m3[i][j]=c;
            }
        }
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                System.out.println(m3[i][j]);
    }
}
