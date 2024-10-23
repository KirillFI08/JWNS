import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class CountButtonListener implements ActionListener {
    JLabel l;
    int i = 0;

    CountButtonListener(JLabel l){
        this.l = l;
    }
    
    public void actionPerformance(ActionEvent e){
        i++;
        l.setText(""+i);
        
    }

}
