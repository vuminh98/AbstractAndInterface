package bai2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(3.6);
        circles[2] = new ComparableCircle("orange", true, 3.6);
        circles[3] = new ComparableCircle("orange", true, 27);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        for (int i = 0; i < circles.length; i++) {
            if (circles[i].getRadius() < circles[i + 1].getRadius()) {
                System.out.println(1);
            } else if (circles[i].getRadius() > circles[i + 1].getRadius()){
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        }
    }
}
