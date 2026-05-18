import java.util.Scanner;

public class SurfaceAreaCube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        double area = 6 * side * side;

        System.out.println("Surface Area = " + area);
    }
}