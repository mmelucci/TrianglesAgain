public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    this.v1 = a;
    this.v2 = b;
    this.v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    this.v1 = new Point (x1,y1);
    this.v2 = new Point (x2,y2);
    this.v3 = new Point (x3,y3);
  }

  public double getPerimeter() {
    return (v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1));
  }
}
