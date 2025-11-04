public class Test {
  public static void main(String[] args) {
    iVertex v1 = new iVertex(42, 17);
    iVertex v2 = new iVertex(0.3, 24.6);
    iVertex v3 = v1.skalarMult(0.8);
    iVertex v4 = v1.add(v2);
    GeometricObject o1 = new GeometricObject();

    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
    System.out.println(v4);
    System.out.println(v1.length());
    System.out.println(v2.length());
    System.out.println(v1.equals(v3));
    System.out.println(v1.equals(v1));

    System.out.println(o1);

  }
}