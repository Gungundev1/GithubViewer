package LibraraymanagamentSystem;

import javax.swing.*;

public class BorrowBook extends Library{
    BorrowBook() {

        JFrame f = new JFrame("Borrow Book");

        JLabel bookId = new JLabel("Book Id");
        bookId.setBounds(100, 50, 80, 20);

        JTextField bookIdTF = new JTextField();
        bookIdTF.setBounds(220, 50, 80, 20);

        JLabel title = new JLabel("Book Name");
        title.setBounds(100, 80, 80, 20);

        JTextField titleTF = new JTextField();
        titleTF.setBounds(220, 80, 80, 20);

        JLabel periodInDays= new JLabel("Period In Days");
        periodInDays.setBounds(100, 110, 100, 20);

        JTextField periodInDaysTF = new JTextField();
        periodInDaysTF.setBounds(220, 110, 80, 20);

        JLabel date = new JLabel(" Return Date");
        date.setBounds(100, 140, 100, 20);

        JTextField dateTf = new JTextField();
        dateTf.setBounds(220, 140, 80, 20);

        JButton back =new JButton("Back");
        back.setBounds(120,180,70,20);

        JButton borrow = new JButton("Borrow");
        borrow.setBounds(200, 180, 100, 20);

        borrow.addActionListener(e -> {
       String bookIdName=bookIdTF.getText();
       String titleName=titleTF.getText();
       String days=periodInDaysTF.getText();
       String rdate=dateTf.getText();

            if (bookIdName.isEmpty() || titleName.isEmpty() || days.isEmpty() || rdate.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields");
                return;
            }
            else
            JOptionPane.showMessageDialog(this,"Issued book sucessfully");
            new Library();
        });

        back.addActionListener(e -> {
            new Library();
        });

        f.add(bookId);
        f.add(bookIdTF);
        f.add(title);
        f.add(titleTF);
        f.add(periodInDays);
        f.add(periodInDaysTF);
        f.add(date);
        f.add(dateTf);
        f.add(borrow);
        f.add(back);

        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BorrowBook();
    }
}
