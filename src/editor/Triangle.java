package editor;

public class Triangle extends Shape{

    public Triangle(Point[] points) {
        super("triangle", points);
    }

    @Override
    public String printName() {
        return "triangle";
    }
}
