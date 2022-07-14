class student{
    String name;
    int age;
    public void info(String name){
        System.out.println("the name is "+this.name);
        System.out.println("the name is "+name);
    }
    public void info(int age){
        System.out.println("the name is "+this.age);
        System.out.println("the name is "+age);
    }
    public void info(String name, int age){
        System.out.println("the name is "+name+" and age is "+age);
        System.out.println("the name is "+this.name+" and age is "+this.age);
    }
}

public class polymorphism{
    public static void main(String args[]) {
        student s1=new student();
        s1.age=22;
        s1.name="akshit";
        s1.info(20);
        System.out.println("\t");
        s1.info("el");
        System.out.println("\t");
        s1.info("akshit",22);
        System.out.println("\t");
    }
}

