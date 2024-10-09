import java.awt.Color;

public class SimpleSquare extends GeometricObject{

    public SimpleSquare(Vertex pos, double size, Color color){
        super(pos, size, size, color);
    }

    public SimpleSquare(double x, double y, double size, Color color){
        this(new Vertex(x,y), size, new Color(0,0,0));
    }
    
    public String toString() {
        return "SimpleSquare: " + super.toString();

    }
}
