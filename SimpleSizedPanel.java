public class SimpleSizedPanel extends SizedPanel {
    public void paintComponent(java.awt.Graphics g){
        g.fillRect(50,50,200,150);
    }

    public static void main(String[] args){
        ShowInFrame.show(new SimpleSizedPanel());

    }
}
