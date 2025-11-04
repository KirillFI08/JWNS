class Vertex {
  public double x;
  public double y;

  public Vertex(double x, double y) {
    this.x = x;
    this.y = y;

  }

  public static void main(String[] args) {
    iVertex v1 = new iVertex(42, 17);
    iVertex v2 = new iVertex(0.3, 24.6);
    iVertex v3 = v1.skalarMult(2);

    System.out.println(v1);
    System.out.println(v3);
    System.out.println(v1.length());
    System.out.println(v2.length());
    System.out.println(v1.equals(v3));
    System.out.println(v1.equals(v1));

  }

  public double length() {
    return Math.sqrt(x * x + y * y);
  }

  public iVertex skalarMult(double s) {
    return new iVertex(x * s, y * s);
  }

  public void skalarMultMod(double s) {
    x = x * s;
    y = y * s;
  }

  public iVertex add(iVertex that) {
    return new iVertex(x + that.x, y + that.y);
  }

  public iVertex sub(iVertex that){
    return new iVertex(x - that.x, y - that.y);
  }

  public double distance(iVertex that){
    double x_diff = that.x-this.x;
    double y_diff = that.y-this.y;
    return Math.sqrt(x_diff * x_diff + y_diff * y_diff);
  }

  public void addMod(iVertex that) {
    x += that.x;
    y += that.y;

    // x=x+v2.x; Langform
    // y=y+v2.y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public String toString() {

    return "(" + x + "," + y + ")";
  }

  public boolean equals(Object thatObject) {
    if (thatObject instanceof iVertex) {
      iVertex that = (iVertex) thatObject;

      return this.x == that.x && this.y == that.y;
    }
    return false;

  }

  public void normalize() {
    double factor = this.length();
    x = x / factor;
    y = y / factor;

  }

}