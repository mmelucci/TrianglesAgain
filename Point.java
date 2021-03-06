public class Point {
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other) {
    if (other != null){
      return Math.sqrt((Math.pow((this.x - other.getX()), 2.0) + Math.pow((this.y - other.getY()), 2.0)));
    }
    return -1;
  }

  public boolean equals(Point other) {
    if (other != null && this.x == other.getX() && this.y == other.getY()) {
      return true;
    }
    return false;
  }

}
