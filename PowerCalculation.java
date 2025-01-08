import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base ");
        double Base = sc.nextDouble();

        System.out.println("Enter the Exponent ");
        double Exponent = sc.nextDouble();

        double Power = Math.pow(Base,Exponent);
        System.out.println("Power of Calculation is " + Power);

    }
}
