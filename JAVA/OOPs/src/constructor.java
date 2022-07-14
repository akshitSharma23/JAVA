/*
class pen{
    int price;
    String name;
    String point;

    public void info(){
        System.out.println("name of pen is "+this.name);
        System.out.println("type of pen is "+this.point);
        System.out.println("price of pen is "+this.price);
    }

    public void discount(int x){
        System.out.println("the discount is "+this.price*x/100);
        int a=this.price-(this.price*x/100);
        System.out.println("actual price is "+a);
    }
}

public class constructor {

    public static void main(String args[]){
        pen p1=new pen();
        p1.name="akshit";
        p1.price=20;
        p1.point="gelpoint";

        p1.info();
        p1.discount(15);
    }
}
*/
//                          -----------------non parameterized constructor-----------------

/*
class student{
    String name;
    int age;
    int rollno;

    public void info(){
        System.out.println("the name is "+this.name);
        System.out.println("age of student is "+this.age);
    }
    student(){
        System.out.println("akshit this side");
    }
}


public class constructor{
    public static void main(String args[]){
        student s1=new student();
        s1.name="akshit";
        s1.age=20;
        s1.rollno=30;

        s1.info();
    }
}*/

//                  ------------------parameterized constructor------------------
/*
class student{
    String name;
    int age;

    public void info(){
        System.out.println("the name is "+this.name);
        System.out.println("age of student is "+this.age);
    }
    student(String name, int age){
        this.name=name;
        this.age=age;
    }
}

public class constructor{
    public static void main(String args[]){
        student s1=new student("akshit",22);
        s1.info();
    }
}*/

//              -----------------------copy constructor-------------------------
/*
class student{
    String name;
    int age;

    public void info(){
        System.out.println("the name is "+this.name);
        System.out.println("age of student is "+this.age);
    }
    student(student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    student(){}
}


public class constructor{
    public static void main(String args[]){
    student s1=new student();
    s1.name="akshit";
    s1.age=22;

    student s2=new student(s1);
    s2.info();
    }
}*/
/*
class student{
    String name;
    int age;

    public void info(){
        System.out.println("the name is "+this.name);
        System.out.println("the age of student is "+this.age);
    }
    student(){}
    student(student k){
        this.name=k.name;
        this.age=k.age;
    }
}

public class constructor{

    public static void main(String args[]){
        student s1=new student();
        s1.name="akshit";
        s1.age=22;
//        student s2=new student(s1);
//        s2.info();
        student s3=new student(s1);
        s3.info();
    }
}
*/