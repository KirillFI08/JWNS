import java.awt.Color;

public class paintableOval extends SimpleOval implements Paintable{


    public paintableOval(iVertex pos, double width, double height, Color color){
        super(pos, width, height, color);
    }

    public paintableOval(double x, double y, double width, double height, Color color){
        this(new iVertex(x,y), width, height, color);
    }

    public paintableOval(double x, double y, double width, double height){
        this(new iVertex(x,y), width, height, new Color(0,0,0));
    }


    public void paintTo(java.awt.Graphics g){
        g.setColor(color);
        g.fillOval((int)pos.x,(int)pos.y,(int)width, (int)height);
    }
}