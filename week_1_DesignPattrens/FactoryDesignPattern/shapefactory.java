package factoryDesignPattern;

public class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType == null) return null;

        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("❌ Invalid shape type: " + shapeType);
        }
    }
}
