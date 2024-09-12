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
  Vertex v3 = v1.skalarMult(2);

  System.out.println(v1.length());
  System.out.println(v2.length());
  System.out.println(v3);
 }

 public double length(){
   return Math.sqrt(x*x + y*y);

 }

 public Vertex skalarMult(double s){
   return new Vertex(x*s, y*s);

 }


public void skalarMultMod(double s){
  x=x*s;
  y=y*s;
}

 public String toString(){
    return "("+x+","+y+")";

 }
}
