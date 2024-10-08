import javax.swing.JPanel;

public class PaintableImage extends JPanel implements Paintable {
    
    MyImage mi;

    public PaintableImage(MyImage mi) {
        this.mi = mi;
    }

    public PaintableImage(String name) {
        this.mi = new MyImage(name);
    }

    public void paintTo(java.awt.Graphics g) {
        g.drawImage(mi.get(), 0, 0, this);
    }

    public static void main(String[] args) {
        PaintableImage pi = new PaintableImage("test.jpg");
        ShowInFrame.show(new PaintablePanel(pi));
    }

}