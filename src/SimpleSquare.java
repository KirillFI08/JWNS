public class SimpleSquare extends GeometricObject {

    public SimpleSquare(Vertex pos, double width) {
        super(pos, width);
    }

    @Override
    public String toString() {
        return "SimpleSquare: " + super.toString();
    }
}