import javax.swing.JPanel;

public class paintableImage extends JPanel implements Paintable {
    
    MyImage mi;

    public paintableImage(MyImage mi) {
        this.mi = mi;
    }

    public paintableImage(String name) {
        this.mi = new MyImage(name);
    }

    public void paintTo(java.awt.Graphics g) {
        g.drawImage(mi.get(), 0, 0, this);
    }

    public static void main(String[] args) {
        paintableImage pi = new paintableImage("test.jpg");
        ShowInFrame.show(new PaintablePanel(pi));
    }

}