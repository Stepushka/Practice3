public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() { }
    abstract double getArea();
    abstract double getPerimeter();
    public String toString() {
        return color+filled;
    }
}
