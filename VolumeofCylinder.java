import java.util.*;
public class VolumeofCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height");
        float Height = sc.nextFloat();
        System.out.println("Enter the radius");
        float Radius = sc.nextFloat();
        double Cylinder = Math.PI* (Radius * Radius) * Height;
        System.out.println("Volume of a Cylinder = " + Cylinder);
    }
}
