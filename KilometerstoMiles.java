import java.util.*;
public class KilometerstoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometer ");
        float kilometer = sc.nextFloat();
        
        double miles = kilometer * 0.621371;
        System.out.println("The distance in Kilometers " + miles);

    }
}
