public class SimpleOval extends GeometricObject {

    public SimpleOval(Vertex pos, double width, double height) {
        super(pos, width, height);

    }
    
    public SimpleOval(double x, double y, double width, double height){
        this(new Vertex(x,y), width, height);
    }

    public String toString() {
        return "SimpleOval: " + super.toString();

    }

}
