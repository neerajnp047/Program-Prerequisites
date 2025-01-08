import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the Width");
        int Width = sc.nextInt();
        int Rectangle = 2 * (length+Width);
        System.out.println("The perimeter of the rectangle is " + Rectangle);
    }
}
