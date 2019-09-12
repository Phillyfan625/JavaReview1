import java.util.Scanner;


public class App extends fan {

    public static void main(String[] args) {
       
       //creating the object
        fan f1 = new fan();
        f1.setSpeed(FAST);
        f1.setOn(true);
        f1.setRadius(10);
        f1.setColor("Yellow");

        fan f2 = new fan();
        f2.setSpeed(MEDIUM);
        f2.setOn(false);
        f2.setRadius(5);
        f2.setColor("Blue");
         
        System.out.println(f1.toString());
        System.out.println(f2.toString());



       


        
    }
}