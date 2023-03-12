public class Circle extends Shape{
    int radius = 1;
    public Circle(){

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
