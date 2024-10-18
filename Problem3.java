import java.util.Scanner;
 
public class Problem3
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Integer sides;
    Double length;
    
    System.out.println("Enter number of sides:");
    sides = scan.nextInt();
    System.out.println("Enter side length:");
    length = scan.nextDouble();
    
    RegularPolygon p1 = RegularPolygon(sides, length);
    RegularPolygon p2 = RegularPolygon(sides + 1, length * 2;
    
    System.out.println("The area of a polygon with " + p1.getNumSides() + "side and side length " + p1.getSideLength() + " is : " + p1.getArea());
    System.out.println("The area of a polygon with " + p2.getNumSides() + "sides and side length " + p2.getSideLegnth() + "is: " + p2.getArea());
  }
}
