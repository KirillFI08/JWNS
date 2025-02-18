package a;

import java.awt.*;
import javax.swing.*;

public class Anwendung extends JFrame
{
    Stadt s1, s2, s3, s4;
    
    public Anwendung()
    {
        initStaedte();      // muss am Anfang erfolgen!   
        setSize(500,500);
        setTitle("TSP: Nearest Neighbour-Methode");
        setResizable(false);
        setVisible(true);
    }

    public void initStaedte()
    {
       s1 = new Stadt(200,200);
       s2 = new Stadt(400,340);
       s3 = new Stadt(300,400);
       s4 = new Stadt(150,100);
    }
    
    public void paint(Graphics g)
    {
       s1.paint(g);
       s2.paint(g);
       s3.paint(g);
       s4.paint(g);
    }

    public static void main(String[] args) 
    {
        new Anwendung();
    }
}
