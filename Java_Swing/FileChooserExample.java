import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FileChooserExample extends JFrame implements ActionListener {

    JMenuBar mb;
    JMenu file;
    JMenuItem open;
    JTextArea ta;

    FileChooserExample() {
        open = new JMenuItem("Open File");
        open.addActionListener(this);

        file = new JMenu("File");
        file.add(open);

        mb = new JMenuBar();
        setJMenuBar(mb);
        mb.add(file);

        ta = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(ta);
        scrollPane.setBounds(0, 0, 800, 550); // Adjust as necessary for layout
        add(scrollPane); // Add only the scroll pane

        setSize(800, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            JFileChooser fc = new JFileChooser();
            int i = fc.showOpenDialog(this);
            if (i == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                String filepath = f.getPath();
                try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
                    String s1, s2 = "";
                    while ((s1 = br.readLine()) != null) {
                        s2 += s1 + "\n";
                    }
                    ta.setText(s2);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new FileChooserExample();
    }
}
