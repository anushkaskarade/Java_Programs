import javax.swing.*;

public class Table {
    
    Table()
    {
        JFrame f=new JFrame("Table in java");
        String data[][]={ {"101","Amit","670000"},{"102","Jai","780000"},{"101","Sachine","700000"}};
        String column[]={"ID","NAME","SALARY"};
        JTable j1=new JTable(data,column);
        j1.setBounds(30,40,200,400);
        //JScrollBar sp=new JScrollBar(j1);
        //f.add(sp);
        f.add(j1);
        f.setSize(400,400);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new Table();
    }
}
