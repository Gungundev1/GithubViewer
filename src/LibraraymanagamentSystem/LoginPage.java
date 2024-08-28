package LibraraymanagamentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    LoginPage(){
        JFrame f=new JFrame("Library management system");

        JLabel heading=new JLabel("Login page");
        heading.setBounds(200,100,100,30);

        JLabel username =new JLabel("Username");
        username.setBounds(150,130,100,30);

        JTextField usernameTF=new JTextField();
        usernameTF.setBounds(250,135,120,20);

        JLabel password= new JLabel("Password");
        password.setBounds(150,160,100,30);

        JTextField passwordTF= new JTextField();
        passwordTF.setBounds(250,165,120,20);

        JButton login=new JButton("LogIn");
        login.setBounds(200,220,100,20);

        login.addActionListener(e -> {
            String user= usernameTF.getText();
            String pass = passwordTF.getText();
            if (user.isEmpty()&& pass.isEmpty()){
                JOptionPane.showMessageDialog(this,"Please Enter details!");
            } else if
            (user.equals("Gungun") && pass.equals("Gungun@12")){
                JOptionPane.showMessageDialog(this,"You are logined");
//                System.out.println("You are logined");
            new Library();
            }
            else
                JOptionPane.showMessageDialog(this,"Incorrect information");
//                System.out.println("Incorrect password");
            dispose();
        });


        f.add(heading);
        f.add(username);
        f.add(password);
        f.add(usernameTF);
        f.add(passwordTF);
        f.add(login);

        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
