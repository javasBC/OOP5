public class Triangle extends Shape{
    //DATA area hekef
    public double a;
    public double b;
    public double c;
    public double h;

    public Triangle() {
    }

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.calcArea();
        this.calcHekef();
    }

    public Triangle(double area, double hekef, double a, double b, double c, double h) {
        super(area, hekef);
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void calcHekef() {
        super.hekef=this.a+this.b+this.c;
    }

    @Override
    public void calcArea() {
        super.area=this.a*this.h/2;
    }
}
