/*public class constructor{
                            // to make student class inside main class we need to make student class static
    static class student{
        int id;
        String name;

        student(){}

        public void info(){
            System.out.println("the student name is "+name+" and roll number is "+id);
        }

    }

    public static void main(String[] args){
        student s=new student();
        s.id=202101004;
        s.name="akshit";
        s.info();
    }
}*/

/*
class student{
    String name;
    int roll_no;
                            // constructor with no parameter
    student(){
        System.out.println("constructor runs\n");
    }

    public void info(){
        System.out.println("the name is "+name);
        System.out.println("roll no is "+roll_no);
    }
}

public class constructor{

    public static void main(String[] args){
        student s=new student();
        s.name="akshit";
        s.roll_no=4;

        student s1=new student();
        s1.name="user_1";
        s1.roll_no=9;

        s.info();
        s1.info();
    }
}*/

/*
class pen{
    String name;
    int price;
                            // constructor with parameter passed in it
pen(String name, int price){
    this.name=name;
    this.price=price;
}
public void buy(int a){
    if(price<a)
        System.out.println("buy the pen ");
    else
        System.out.println("don't buy it");
    }
}

public class constructor {

    public static void main(String[] args){
        pen p= new pen("tri",50);
        p.buy(60);
    }
}*/

