package bai4;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(1,3);
        shapes[2] = new Square(3);
        for (Shape shape : shapes) {
            System.out.println(shape);
            shape.howToColor();
        }
    }
}
