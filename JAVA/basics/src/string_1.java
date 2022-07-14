import java.util.*;

public class string_1 {
    public static void main(String[] args){
                            // strings are im-mutable
        // String name=new String("akshit");
        String name="akshit";
        int age=21;
        float marks=63.57F;
        System.out.print("the name is ");           // does not provide next line
        System.out.println(name);                   // provide line space after printing statement
        System.out.printf("the name is %s age is %d marks is %f\n",name,age,marks);
        System.out.format("the name is %s age is %d marks is %f",name,age,marks);
                        /*
                            %d for int
                            %f for float            %8.2f(8 is space 2 represent digit after decimal)
                            %c for char
                            %s for string
                        */
        Scanner in=new Scanner(System.in);
        String about=in.next();
        System.out.println(about);


        String user=in.nextLine();
        //System.out.println(user);
    }
}
