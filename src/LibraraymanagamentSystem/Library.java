package LibraraymanagamentSystem;

import javax.swing.*;
import java.util.ArrayList;
public class Library extends LoginPage {
    public JTextField bookIdTF;
    public JTextField titleTF;
    public JTextField authorTF;
    public JTextField publicationTF;
    public JTextArea displayArea;

    String id;
    String bookName;
    String authorName;
    String publisher;

ArrayList<String> books=new ArrayList<>();
      Library  () {
        JFrame f = new JFrame("Library ");

        JButton addBook = new JButton("Add Book");
        addBook.setBounds(150, 50, 120, 20);

        JButton borrowBook = new JButton("Borrow Book");
        borrowBook.setBounds(150, 80, 120, 20);

        JButton displayBook = new JButton("Display Book");
        displayBook.setBounds(150, 110, 120, 20);

        JButton returnBook = new JButton("Return Book");
        returnBook.setBounds(150, 140, 120, 20);

        JButton exit = new JButton("Exit ");
        exit.setBounds(150, 170
                , 120, 20);


        addBook.addActionListener(e -> {
            new AddBook();

        });

        borrowBook.addActionListener(e -> {
            new BorrowBook();
        });

        returnBook.addActionListener(e -> {
            new ReturnBook();
        });

        displayBook.addActionListener(e -> {

//            JOptionPane.showMessageDialog (this,"Book Id: " + id + ", "+"Book Name" + bookName + ", " +"Author name"+ authorName + ", "+"Publisher" + publisher);

            new DisplayBook();

        });

        exit.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "You exited");
          new LoginPage();
        });

        f.add(addBook);
        f.add(borrowBook);
        f.add(displayBook);
        f.add(returnBook);
        f.add(exit);


        f.setSize(500, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);



    }


    public static void main(String[] args) {
        new Library();
    }
}

