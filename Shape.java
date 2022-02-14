public abstract class Shape {
    public double area;
    public double hekef;


    public Shape() {
    }

    public Shape(double area, double hekef) {
        this.area = area;
        this.hekef = hekef;
    }
    public abstract  void calcHekef();
    public abstract  void calcArea();

    @Override
    public String toString() {
        return ""+getClass().getName()+"{" +
                "area=" + area +
                ", hekef=" + hekef +
                '}';
    }
}
