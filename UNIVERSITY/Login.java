
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    JButton login,cancel;
    JTextField jtextf,pas;
    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel jbl= new JLabel("USERNAME");
        jbl.setBounds(40,20,100,20);
        add(jbl);

         jtextf=new JTextField();
        jtextf.setBounds(150,20,150,20);
        add(jtextf);

        JLabel pass= new JLabel("PASSWORD");
        pass.setBounds(40,70,100,20);
        add(pass);

         pas=new JPasswordField();
        pas.setBounds(150,70,150,20);
        add(pas);

        login=new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("serif",Font.ITALIC,16));
        add(login);

        cancel=new JButton("Cancel");
        cancel.setBounds(180,140,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        add(cancel);

        ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("img/second.jpg"));
        Image i3=i2.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i4=new ImageIcon(i3);
        JLabel img=new JLabel(i4);
        img.setBounds(350,0,200,200);
        add(img);


         setSize(600,300);
         setLocation(500,250);
         setVisible(true);
    }

    public void actionPerformed(ActionEvent ar){
          if(ar.getSource() == login){
             String username=jtextf.getText();
             String password=pas.getText();

             String query= "select * from login where username='"+username+"'and password='"+password+"'";
             try{
                Connections c=new Connections();
                ResultSet rs=c.s.executeQuery(query);
//                c.s.executeQuery(query);
                 if(rs.next()){
                     setVisible(false);
                     new Project();
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                     setVisible(false);
                 }
             }catch(Exception e){
                 e.printStackTrace();
             }
          }
          else if(ar.getSource() == cancel){
               setVisible(false);
          }
    }
    public static void main(String[] args) {
        new Login();
    }
}
