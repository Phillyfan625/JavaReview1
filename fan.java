import java.util.Scanner;
public class fan{
    // define your data
    
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    //three constants 
    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
   

    public fan(){
        //initialize your data
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
        

    }
    public fan(int inf_Speed, boolean inf_On, double inf_Radius, String inf_Color){
        // pass in data to initialize the variables
        // set the variables equal to each other

        inf_Speed = speed;
        inf_On = on;
        inf_Radius = radius;
        inf_Color = color;
       
    }
    
    
    //getters and setters to get this info to other classes

    /**
     * @return int return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return boolean return the on
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on the on to set
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * @return double return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    // Additional methods -- such as for calculation, display

    public String toString(){
        // return data as a String
        // if the fan is on
        if (on == true){
            return "Fan Speed : " + speed + "\nFan Color: " + color + "\nFan Radius: " + radius;
        }
        // if the fan isn't on
        else {
            return "\nFan Color: " + color + " " + "\nFan Radius: " + radius + " " + " \nThe fan is off";
        }
        
    }


    

}

