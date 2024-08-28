package LibraraymanagamentSystem;

import javax.swing.*;

public class ReturnBook extends Library{
    ReturnBook(){
        JFrame f=new JFrame("Return Book");

        JLabel bookId = new JLabel("Book Id");
        bookId.setBounds(100, 50, 80, 20);

        JTextField bookIdTF = new JTextField();
        bookIdTF.setBounds(220, 50, 80, 20);

        JLabel date = new JLabel(" Return Date");
        date.setBounds(95, 80, 80, 20);

        JTextField dateTf = new JTextField();
        dateTf.setBounds(220, 80, 80, 20);

        JButton back =new JButton("Back");
        back.setBounds(120,120,70,20);

        JButton returnBook=new JButton("Return");
        returnBook.setBounds(200,120,80,20);

        back.addActionListener(e -> {
            new Library();
        });

        returnBook.addActionListener(e -> {
            String bookid=bookIdTF.getText();
            String bdate=dateTf.getText();
            if (bookid.isEmpty() || bdate.isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields");
            }
            else
            JOptionPane.showMessageDialog(this,"Book is returned");
            new Library();
        });

        f.add(bookId);
        f.add(bookIdTF);
        f.add(date);
        f.add(dateTf);
        f.add(returnBook);
        f.add(back);

        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ReturnBook();
    }
}
