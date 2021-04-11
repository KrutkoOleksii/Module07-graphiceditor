package editor;

public class Circle extends Shape {

    public Circle(Point[] points) {
        super("circle", points);
    }

    @Override
    public String printName() {
        return "circle";
    }

}
