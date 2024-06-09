import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            //primitive type example
            System.out.println("primitive type example");
            byte age = 10;
            byte age2 = age;
            age = 20;
            System.out.println("age1 is "+age);
            System.out.println("age2 is "+age2);
        }

        {
            //Non primitive example
            System.out.println("Non primitive example");
            Point point1 = new Point(1,3);
            Point point2 = point1;
            point1.x = 10;
            point2.y = 30;
            System.out.println("Point1 is "+point1);
            System.out.println("Point2 is "+point2);
        }
    }
}