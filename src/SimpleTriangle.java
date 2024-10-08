public class SimpleTriangle extends GeometricObject {
    private Vertex v1; // Erste Ecke (linke Ecke)
    private Vertex v2; // Zweite Ecke (rechte Ecke)
    private Vertex v3; // Dritte Ecke (Scheitelpunkt)

    public SimpleTriangle(Vertex pos, double width) {
        v1 = pos; // Linke Ecke
        v2 = new Vertex(pos.x + width, pos.y); // Rechte Ecke
        double height = (Math.sqrt(3) / 2) * width; // Höhe eines gleichseitigen Dreiecks
        v3 = new Vertex(pos.x + width / 2, pos.y + height); // Scheitelpunkt
    }

    public SimpleTriangle(double x, double y, double width) {
        this(new Vertex(x, y), width);
    }

    public String toString() {
        return "SimpleTriangle: (" + v1 + ", " + v2 + ", " + v3 + ")";
    }
}
