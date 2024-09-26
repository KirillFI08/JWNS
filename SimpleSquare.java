public class SimpleSquare extends GeometricObject{

    public SimpleSquare(Vertex pos, double size){
        super(pos, size, size);
    }

    public SimpleSquare(double x, double y, double size){
        this(new Vertex(x,y), size);
    }
    
    public String toString() {
        return "SimpleSquare: " + super.toString();

    }
}
