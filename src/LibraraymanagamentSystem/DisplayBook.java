package LibraraymanagamentSystem;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Vector;

public class DisplayBook extends Library {

    DisplayBook() {
        JFrame f = new JFrame("Display Book");


        String[] columnNames = { "BookId", "Title", "Author Name","Publication Name" };

        JTable table=new JTable( );
        table.setBounds(20,40,200,300);
//        JOptionPane.showMessageDialog (this,"Book Id: " + id + ", "+"Book Name" + bookName + ", " +"Author name"+ authorName + ", "+"Publisher" + publisher);


         Object[][] data = {
                 { "BookId", "Title", "Author Name","Publication Name"},
                {id, bookIdTF, authorName, publisher},
        };
        table = new JTable(data, columnNames);
        table.setBounds(30,40,400,400);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30, 100, 300, 400);
        f.add(table);
        f.add(scrollPane);


        f.setSize(500, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
        public static void main (String[]args){
            new DisplayBook();
        }
    }
