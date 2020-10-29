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

  public double getArea() {
    double semiper = this.getPerimeter() / 2.0;
    return (Math.sqrt(semiper * (semiper - v1.distanceTo(v2))
                              * (semiper - v2.distanceTo(v3))
                              * (semiper - v3.distanceTo(v1))));
    }

  private double roundtenthousandth(double value) {
    return (Math.round(10000.0 * value)) / 10000.0;
  }

  public String classify() {
      double s1 = roundtenthousandth(v1.distanceTo(v2));
      double s2 = roundtenthousandth(v2.distanceTo(v3));
      double s3 = roundtenthousandth(v3.distanceTo(v1));
  if ((s1 == s2) && (s2 == s3)) {
    return "equilateral";
  }
  if ((s1 == s2) || (s2 == s3) || (s1 == s3)) {
    return "isosceles";
  }
  return "scalene";
  }

  public String toString()  {
    return ("v1(" + v1.getX() + ", " + v1.getY() + ") " +
            "v2(" + v2.getX() + ", " + v2.getY() + ") " +
            "v3(" + v3.getX() + ", " + v3.getY() + ")");
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      this.v1 = newP;
    }
    if (index == 1) {
      this.v2 = newP;
    }
    if (index == 2) {
      this.v3 = newP;
    }
  }
}
