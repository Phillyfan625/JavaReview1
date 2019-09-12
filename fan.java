import java.util.Scanner;
public class fan{
    // define your data

    private int speed;
    private boolean on;
    private double radius;
    String color;
   

    public fan(){
        //initialize your data
        speed = 0;
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

}

