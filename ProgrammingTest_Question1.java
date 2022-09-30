import java.util.*;

public class ProgrammingTest_Question1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
        "The program prints the volume, surface area and circumference of a capsule\n having radius r ranging from 6 to N in increments of 6 and side length a");
    System.out.print("Enter the value for N: ");
    int valueN = sc.nextInt();
    System.out.print("Enter the length of side a: ");
    double valueA = sc.nextDouble();
    System.out.printf("%-12s\t%-10s\t%-12s\t%-12s\n", "Radius", "Volume", "Surface Area", "Circumference");
    System.out.println("-------------------------------------------------------------");

    for (int i = 6; i < valueN; i += 6) {
      double Volume = Math.PI * Math.pow(i, 2) * ((4.0 / 3.0) * i + valueA);
      double SurfaceArea = (2 * Math.PI * i) * ((2 * i) + valueA);
      double Circumference = 2 * Math.PI * i;
      System.out.printf("%-12d\t%-10.3f\t%-12.4f\t%-12.4f\n", i, Volume, SurfaceArea, Circumference);
    }

  }

}
