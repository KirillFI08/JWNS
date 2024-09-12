class Vertex{
    public double x;
    public double y;

public Vertex(double x, double y){
    this.x=x;
    this.y=y;
}

 public static void main(String[] args) {

  Vertex v1 = new Vertex(10, 17);
  Vertex v2 = new Vertex(10, 16); 

  System.out.println(v1.length());
  System.out.println(v2.length());
 }

 public double length(){
   return Math.sqrt(x*x + y*y);

 }

 public String toString(){
    return "("+x+","+y+")";

 }
}
