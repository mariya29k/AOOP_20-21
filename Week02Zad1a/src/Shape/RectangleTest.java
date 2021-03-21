package Shape;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.printf("Rectangle {width: %.2f, height: %.2f, color: %s}\nArea: %.2f\nPerimeter: %.2f",
                rectangle.getWidth(), rectangle.getHeight(), rectangle.getColor(),
                rectangle.getArea(), rectangle.getPerimeter());
    }
}
