import java.awt.*;

public class Poodle extends Dog {
    // NAME AGE SPEED
    public Color color;

    public Poodle(){

    }
    public Poodle(String name, int age, int speed){
        super(name, age, speed);
    }

    public Poodle(String name, int age, int speed, Color color) {
        super(name, age, speed);
        this.color = color;
    }


    @Override
    public String toString() {
        return "Poodle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                ", color=" + color +
                '}';
    }
}
