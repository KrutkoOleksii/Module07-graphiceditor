package editor;

public class Pentagon extends Shape{

    public Pentagon(Point[] points) {
        super("pentagon", points);
    }

    @Override
    public String printName() {
        return "pentagon";
    }
}


