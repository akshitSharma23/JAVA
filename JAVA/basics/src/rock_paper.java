import java.util.*;

public class rock_paper {
    public static void main(String[] args){
        int i=0,comp=0,player=0;
        Scanner in=new Scanner(System.in);
        System.out.println("user input \n1 --> stone\n2 --> paper\n3 --> scissors\n Wrong input lead 1+ to computer");
        while(i<5) {
            Random a = new Random();
            int x = a.nextInt(1, 3);
            System.out.println("enter your choice");
            int user=in.nextInt();
            switch (user) {
                case 1:
                    System.out.println("user --> stone");
                    break;
                case 2:
                    System.out.println("user --> paper");
                    break;
                case 3:
                    System.out.println("user --> scissors");
                    break;
                default:{
                    comp++;
                    System.out.println("+1 to computer");}
            }
            switch (x) {
                case 1:
                    System.out.println("computer --> stone");
                    break;
                case 2:
                    System.out.println("computer --> paper");
                    break;
                case 3:
                    System.out.println("computer --> scissors");
                    break;
            }
            if(user==1&&x==3||user==1&&x==2||user==3&&x==1){
                comp++;
                System.out.println("player\tcomputer\n"+player+"\t\t"+comp);}
            else if(user==2&&x==1||user==3&&x==2||user==1&&x==3){
                player++;
                System.out.println("player\tcomputer\n"+player+"\t\t"+comp);}
            else if(user==x)
                System.out.println("player\tcomputer\n"+player+"\t\t"+comp);
            else
                System.out.println("player\tcomputer\n"+player+"\t\t"+comp);
            i++;
        }
        if(comp>player)
            System.out.println("computer win the game");
        else if(comp<player)
            System.out.println("player win the game");
        else
            System.out.println("it's draw");
    }
}
