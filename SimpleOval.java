public class SimpleOval extends GeometricObject {
    
    public SimpleOval(Vertex pos, double width, double height){
        super(pos, width, height);
    }

    public void a(){
        this(new Vertex(x,y), width, height);
    }

    public String toString(){
        return "SimpleOval" + super.toString();
    }
}
