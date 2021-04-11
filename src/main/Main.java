package main;

import editor.*;

public class Main {

    public static void main(String[] args) {

        DisplayName displayName = new DisplayName();

        Shape circle = new Circle(new Point[1]);
        displayName.printName(circle);
        Shape pentagon = new Pentagon(new Point[5]);
        displayName.printName(pentagon);
        Shape quad = new Quad(new Point[4]);
        displayName.printName(quad);
        Shape rectangle = new Rectangle(new Point[4]);
        displayName.printName(rectangle);
        Shape triangle = new Triangle(new Point[3]);
        displayName.printName(triangle);

    }
}
