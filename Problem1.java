import java.util.Scanner;

public class Problem1
{
  public static void main(String[] args)
  {
    int a = Integer.MAX_VALUE;
    a += 1;
    System.out.println("Value after incrementing max int: " + a);
    int b = Integer.MIN_VALUE;
    b -= 1;
    System.out.println("Value after decrementing min int: " + b);
  }
}
