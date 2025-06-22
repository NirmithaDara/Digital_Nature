package factoryDesignPattern;

public class MainApp {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.createShape("circle");
        s1.render();

        Shape s2 = factory.createShape("square");
        s2.render();

        Shape s3 = factory.createShape("triangle");
        s3.render();
    }
}
