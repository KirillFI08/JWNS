import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SimpleButton extends JPanel {
    JButton b = new JButton("Push this button");
    JLabel l = new JLabel("000");

    SimpleButton(){
        add(b);
        add(l);
        
    }

    


}
