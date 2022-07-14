import java.util.*;

public class string {
    public static void main(String[] args){
        /*System.out.println("hello world");
        String name="akshit";
        String name1="sharma";
        int age=21;
        Double marks=82.5;
        long number=9990218886L;
        System.out.println(name+" "+name1);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(number);
        String name="akshit";
        String name1="sharma";
        String full_name=name+" "+name1;
        System.out.println(name+" "+name1);
        System.out.println(full_name.charAt(4));
        System.out.println(full_name.length());
        String fullname;
        fullname=full_name.replace(" ","-");
        System.out.println(fullname);
        System.out.println(full_name.replace("a","A"));*/

                            //string are im-mutable

        String namme="AKSHIT";
        System.out.println(namme.toLowerCase());
        String name="akshit sharma";
        System.out.println(name.replace(" ","-"));
        String letter="dear name thanks a lot";
        System.out.println(letter.replace("name",name));
        String mystr="this string contain double  and triple spaces";
        System.out.println(mystr.indexOf("  "));
        System.out.println(mystr.indexOf("   "));
        System.out.println("dear akshit sharma\n\tthanks this java cource is nice\n\tthanks");


    }
}