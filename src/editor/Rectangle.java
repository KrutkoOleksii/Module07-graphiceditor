package editor;

public class Rectangle extends Shape{

    public Rectangle(Point[] points) {
        super("rectangle", points);
    }

    @Override
    public String printName() {
        return "rectangle";
    }
}
