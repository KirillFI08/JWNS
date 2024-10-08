import javax.swing.JFrame;
import javax.swing.JPanel;

public class firstPanel extends JPanel {

    public void paintComponent(java.awt.Graphics g){
        g.fillRect(50,50,10,10);
    }

    public static void main(String[] args){
        JFrame f = new JFrame();
        f.add(new firstPanel());
        f.setVisible(true);
    }
    
}