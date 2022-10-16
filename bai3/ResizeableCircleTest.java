package bai3;


public class ResizeableCircleTest {
    private static double percent;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("orange",true,2);
        shapes[1] = new Rectangle("orange",false,3,5);
        shapes[2] = new Square("orange",false, 7);
        System.out.println("Pre-resize");
        for (Shape shape : shapes) {
            System.out.println(shape);
            shape.resize(200);
        }
        System.out.println("After-resize");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
