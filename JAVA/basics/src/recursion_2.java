public class recursion_2 {
    static int matrix_path(int n,int m){
        if(n==1 || m==1)
            return(1);
        return(matrix_path(n-1,m)+matrix_path(n,m-1));
    }

    public static void main(String [] args){
        System.out.println(matrix_path(2,2));
    }
}
