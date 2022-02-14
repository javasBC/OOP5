public class Circle extends Shape {
    //DATA   area hekef
    public double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
        calcArea();
        calcHekef();
    }

    Circle(double area, double hekef ,double radius){
        super(area,hekef);
        this.radius=radius;
    }

    @Override
    public void calcHekef() {
        super.hekef=Math.PI*2*this.radius;
    }

    @Override
    public void calcArea() {
        super.area=Math.PI*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", hekef=" + hekef +
                '}';
    }
}
