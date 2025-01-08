import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal");
        double Principal = sc.nextDouble();
        System.out.println("Enter the Rate");
        double Rate = sc.nextDouble();
        System.out.println("Enter the time");
        double Time = sc.nextDouble();
        double SimpleInterest = (Principal*Rate*Time)/100;
        System.out.println(SimpleInterest);

    }
}
