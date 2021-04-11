package editor;

public abstract class Shape {
    private String name;
    private Point[] points;

    public Shape(String name, Point[] points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public abstract String printName();

}