package editor;

public class Quad extends Shape{

    public Quad(Point[] points) {
        super("quad", points);
    }

    @Override
    public String printName() {
        return "quad";
    }
}
