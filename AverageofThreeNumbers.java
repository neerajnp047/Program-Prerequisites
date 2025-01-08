import java.util.*;
public class AverageofThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int A = sc.nextInt();

        System.out.println("Enter the second number ");
        int B = sc.nextInt();

        System.out.println("Enter the Third number ");
        int C = sc.nextInt();

        int d = (A + B + C)/3;

        System.out.println("The average of three number is " + d);
    } 
}
