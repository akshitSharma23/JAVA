import java.util.*;

public class array_list {

    public static void main(String[] args){
        ArrayList lst=new ArrayList();
        lst.add(11);            // add method insert the element in ArrayList
        lst.add(12);
        lst.add(13);
        lst.add(14);
        lst.add(15);

        System.out.println(lst.get(0));         //get method is use to print particular element in array
        System.out.println(lst.get(1));
        System.out.println(lst.get(2));
        System.out.println(lst.get(3));
        System.out.println(lst.get(4));
    }
    /*
    public static void main(String[] args){
        ArrayList<Integer> lst=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size");
        int n=in.nextInt();
        System.out.println("enter the element of an list");
        for(int i=0;i<n;i++){
            lst.add(in.nextInt());
        }
        for(int i=0;i<lst.size();i++){
            System.out.println(lst.get(i));
        }
        System.out.println("enter the size");
        int h=in.nextInt();
        for(int i=0;i<h;i++){
            lst.add(in.nextInt());
        }
        for(int i=0;i<n+h;i++){
            System.out.println(lst.get(i));
        }
    }*/

    /*
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=in.nextInt();
        ArrayList lst=new ArrayList();
        for(int i=0;i<n;i++)
            lst.add(i, in.next());
        for(int i=0;i<n;i++)
            System.out.println(lst.get(i));
        System.out.println("enter the size of another array");
        int h=n;
        n=in.nextInt();
        for(int i=0;i<n;i++)
            lst.add(in.nextInt());
        for(int i=0;i<n+h;i++)
            System.out.println(lst.get(i));
    }*/
}
