package Rectangle;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        rectangle rectangle = new rectangle();

        System.out.println("ENter rectangle widht and height: ");
        rectangle.widht = scan.nextDouble();
        rectangle.height = scan.nextDouble();

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.diagonal());
    }
}
