public class pointTriangleTester {
  public static void main(String[] args) {
    Point p1 = new Point (1.0,1.0);
    Point p2 = new Point (10.0,10.0);
    Point p3 = new Point (p1);

    System.out.println("distanceTo Tests:");
    System.out.println("Expected: 12.72792206...");
    System.out.print("Result: ");
    System.out.println(p1.distanceTo(p2));
    System.out.println("Expected: 0.0");
    System.out.print("Result: ");
    System.out.println(p3.distanceTo(p1));
  }
}
