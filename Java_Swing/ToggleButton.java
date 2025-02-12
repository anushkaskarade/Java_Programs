import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class ToggleButton extends JFrame implements ItemListener {

    private JToggleButton button;

    public static void main(String[] args) {
        new ToggleButton();
    }

    ToggleButton() {
        setTitle("JToggleButton with ItemListener");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setJToggleButton() {
        button = new JToggleButton("ON", false); 
        add(button);
    }

    private void setAction() {
        button.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent eve) {
        if (eve.getStateChange() == ItemEvent.SELECTED) {
            button.setText("OFF");
        } else if (eve.getStateChange() == ItemEvent.DESELECTED) {
            button.setText("ON");
        }
    }
}
