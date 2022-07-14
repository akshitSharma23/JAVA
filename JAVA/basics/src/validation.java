import java.util.*;
import java.lang.*;

public class validation {
    public static void main(String[] args){
        String name, address,city;
        int postcode;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name");
        name=in.nextLine();
        System.out.println("enter the address");
        while(true){
            address=in.nextLine();
            if(address.isBlank())
                System.out.println("please enter the address\naddress is compulsory");
            else
                break;}
        System.out.println("enter the city name");
        city=in.nextLine();
        System.out.println("enter he post code");
        postcode=in.nextInt();
        System.out.println(name);
        System.out.println(address);
        System.out.println(city);
        System.out.println(postcode);

    }
}
