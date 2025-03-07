import java.util.*;


public class MovablePanel extends SizedPanel {
    List<GameObject> gos = new ArrayList<GameObject>();

    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        for(GameObject go:gos){ go.paintTo(g);}  //lade alle Elemente von gos auf die Variable go
    }

    public void move(){
        for(GameObject go:gos){go.move();}
    }

    public void doOnTick(){
        move();
        repaint();
    }

}


