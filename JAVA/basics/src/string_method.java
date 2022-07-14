import java.util.*;

public class string_method {
    public static void main(String[] args) {
        String name="AKSHIT";
        String name23="AKSHIT";
        System.out.println(name.length());          //return length

        name=name.toLowerCase();                    // return string with lower letter
        System.out.println(name);

        name=name.toUpperCase();                    // return string with upper letter
        System.out.println(name);

        String data="     the      ";
        data=data.trim();                           // remove extra space from start and end of string
        System.out.println(data);

        System.out.println(name.substring(2));      // return sub string from start to the end. requires start and run till end

        String self="the name is akshit";
        System.out.println(self.substring(2,13));    // run from start and run till n-1 ,n is end point

        String story="billy bottom";
        System.out.println(story.replace("b","w"));         // replace old with new
        System.out.println(story.replace("billy","bell"));

        System.out.println(story.startsWith("billy"));           // return true if value start with ""
        System.out.println(story.endsWith("tom"));            // return true if value ends with ""

        System.out.println(name.charAt(4));                     // return char at particular index position
        System.out.println(name.charAt(1));

        System.out.println(name.indexOf("s"));                              //Returns the position of the first found occurrence of specified characters in a string
        System.out.println(self.indexOf("a",6));

        String name_new="akshitshithit";                                //Returns the position of the last found occurrence of specified characters in a string
        System.out.println(name_new.lastIndexOf("shit"));
        System.out.println(name_new.lastIndexOf("hit"));

        System.out.println(name.equals(name23));                    //Compares two strings. Returns true if the strings are equal, and false if not
        if(name.equals(name23))
            System.out.println("true");
        else
        System.out.println("false");
        
        name23="akshit";                                //Compares two strings, ignoring case considerations
        System.out.println(name.equalsIgnoreCase(name23));

        String ch="elephant";                          // count the occurrence of character
        char str='e';          // <--- character put under single quotes
        int c=0;
        for(int i=0;i<ch.length();i++){
            if(ch.charAt(i)==str)
                c++;
        }
        System.out.println(c);

//        String someString = "elephant";
//        char someChar = 'e';
//        int count = 0;
//
//        for (int i = 0; i < someString.length(); i++) {
//            if (someString.charAt(i) == someChar) {
//                count++;
//            }
//        }
    }
}