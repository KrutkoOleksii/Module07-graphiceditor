package main;

import editor.*;

public class Main {

    public static void main(String[] args) {

        DisplayName displayName = new DisplayName();

        Shape circle = new Circle();
        displayName.printName(circle);
        Shape pentagon = new Pentagon();
        displayName.printName(pentagon);
        Shape quad = new Quad();
        displayName.printName(quad);
        Shape rectangle = new Rectangle();
        displayName.printName(rectangle);
        Shape triangle = new Triangle();
        displayName.printName(triangle);

    }
}
