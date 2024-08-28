package LibraraymanagamentSystem;

import javax.swing.*;
import java.awt.print.Book;
import java.util.ArrayList;

public class AddBook extends Library{
    public AddBook  () {

     JFrame f = new JFrame("Add Book");

        JLabel bookId = new JLabel("Book Id");
        bookId.setBounds(100, 50, 80, 20);

     JTextField bookIdTF = new JTextField();
     bookIdTF.setBounds(200, 50, 80, 20);

     JLabel title = new JLabel("Book Name");
     title.setBounds(100, 80, 80, 20);

     JTextField titleTF = new JTextField();
     titleTF.setBounds(200, 80, 80, 20);

     JLabel author = new JLabel("Author Name");
     author.setBounds(100, 110, 80, 20);

     JTextField authorTF = new JTextField();
     authorTF.setBounds(200, 110, 80, 20);

     JLabel publication = new JLabel("Publication");
     publication.setBounds(100, 140, 100, 20);

     JTextField publicationTF = new JTextField();
     publicationTF.setBounds(200, 140, 80, 20);

     JButton back = new JButton("Back");
     back.setBounds(120, 180, 70, 20);

     JButton add = new JButton("Add");
     add.setBounds(200, 180, 60, 20);

add.addActionListener(e -> {
     id = bookIdTF.getText();
     bookName =titleTF.getText();
     authorName = authorTF.getText();
     publisher = publicationTF.getText();
    if (id.isEmpty() || bookName.isEmpty() || authorName.isEmpty() || publisher.isEmpty()) {
        JOptionPane.showMessageDialog(AddBook.this, "Please fill all the fields");
        return;
    }else
    JOptionPane.showMessageDialog(this, "Book added successfully");
    System.out.println("Bookid: " +id +"\n"+
            " Book title"+bookName +"\n"+" Author Name"+authorName +"\n"+" Publisher"+publisher);
//    clearFields();
             dispose();

     });




     back.addActionListener(e -> {
         new Library();
     });

     f.add(bookId);
     f.add(bookIdTF);
     f.add(title);
     f.add(titleTF);
     f.add(author);
     f.add(authorTF);
     f.add(publication);
     f.add(publicationTF);
     f.add(add);
     f.add(back);


     f.setSize(500, 500);
     f.setLayout(null);
     f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     f.setVisible(true);


 }
    public void clearFields () {
        bookIdTF.setText("");
        titleTF.setText("");
        publicationTF.setText("");
        authorTF.setText("");

    }

    public static void main(String[] args) {
        new AddBook();
    }
}
