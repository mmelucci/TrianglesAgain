public class pointTriangleTester {
  public static void main(String[] args) {
    Point p1 = new Point (1.0,1.0);
    Point p2 = new Point (10.0,10.0);
    Point p3 = new Point (p1);
    Triangle t1 = new Triangle (0.5248, -0.8002, -2.437885, 1.94, 0.0, 0.0);
    Triangle t2 = new Triangle (0.0, 0.0, 0.0, 0.0, 426.9, 823.0);
    Triangle t3 = new Triangle (5.0, 5.0, 5.0, 5.0, 5.0, 5.0);
    Triangle t4 = new Triangle (0.0, 0.0, 0.0, 4.0, 2.0, 0.0);

    System.out.println("distanceTo Tests:");
    System.out.println("Expected: 12.72792206...");
    System.out.print("Result: ");
    System.out.println(p1.distanceTo(p2));
    System.out.println("Expected: 0.0");
    System.out.print("Result: ");
    System.out.println(p3.distanceTo(p1));

    System.out.println();
    System.out.println("equals Tests:");
    System.out.println("Expected: Same");
    System.out.print("Result: ");
    if (p1.equals(p3) == true) {
      System.out.println("Same");
    }
    System.out.println("Expected: Different");
    System.out.print("Result: ");
    if (p1.equals(p2) == false) {
      System.out.println("Different");
    }

    System.out.println();
    System.out.println("getPerimeter Tests:");
    System.out.println("Expected Value: 8.108143867816992");
    System.out.print("Result: ");
    System.out.println(t1.getPerimeter());
    System.out.println("Expected Value: 1854.2627753368722");
    System.out.print("Result: ");
    System.out.println(t2.getPerimeter());
    System.out.println("Expected Value: 0.0");
    System.out.print("Result: ");
    System.out.println(t3.getPerimeter());

    System.out.println();
    System.out.println("getArea Tests:");
    System.out.println("Expected Value: 0.46634178850000285");
    System.out.print("Result: ");
    System.out.println(t1.getArea());
    System.out.println("Expected Value: 0.0");
    System.out.print("Result: ");
    System.out.println(t2.getArea());
    System.out.println("Expected Value: 0.0");
    System.out.print("Result: ");
    System.out.println(t3.getArea());
    System.out.println("Expected Value: 4.0");
    System.out.print("Result: ");
    System.out.println(t4.getArea());
  }
}
