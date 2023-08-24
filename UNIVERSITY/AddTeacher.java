
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class AddTeacher extends JFrame implements ActionListener {
    JTextField tfname,tffname,tfaddress,tfphone,tfmail,tfxiimarks,tfxmarks,tfadhar;
    JLabel labrollno;
    JComboBox cbcourse,cbbranch;
    JDateChooser dcdob;
    JButton submit,cancel;

    Random ran=new Random();
    long first4=Math.abs((ran.nextLong() % 9000L) + 1000L);


    AddTeacher(){
        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        JLabel heading =new JLabel("New Teacher Details");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("Serif", Font.BOLD,30));
        add(heading);

        JLabel lblname =new JLabel("Name");
        lblname.setBounds(50,150,100,30);
        lblname.setFont(new Font("Serif", Font.BOLD,20));
        add(lblname);

        tfname=new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);

        JLabel fathername =new JLabel("Fathers Name");
        fathername.setBounds(400,150,200,30);
        fathername.setFont(new Font("Serif", Font.BOLD,20));
        add(fathername);

        tffname=new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);

        JLabel Lrollno =new JLabel("Staff Id");
        Lrollno.setBounds(50,200,200,30);
        Lrollno.setFont(new Font("Serif", Font.BOLD,20));
        add(Lrollno);

        labrollno =new JLabel("2020TECH"+first4);
        labrollno.setBounds(200,200,200,30);
        labrollno.setFont(new Font("Serif", Font.BOLD,20));
        add(labrollno);


        JLabel lbldob =new JLabel("Date of Birth");
        lbldob.setBounds(400,200,200,30);
        lbldob.setFont(new Font("Serif", Font.BOLD,20));
        add(lbldob);

        dcdob = new JDateChooser();
        dcdob.setBounds(600,200,150,30);
        add(dcdob);

        JLabel lbladdress =new JLabel("Address");
        lbladdress.setBounds(50,250,200,30);
        lbladdress.setFont(new Font("Serif", Font.BOLD,20));
        add(lbladdress);

        tfaddress=new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);

        JLabel lblphone =new JLabel("Phone no.");
        lblphone.setBounds(400,250,200,30);
        lblphone.setFont(new Font("Serif", Font.BOLD,20));
        add(lblphone);

        tfphone=new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);


        JLabel lblemail =new JLabel("Email Id");
        lblemail.setBounds(50,300,200,30);
        lblemail.setFont(new Font("Serif", Font.BOLD,20));
        add(lblemail);

        tfmail=new JTextField();
        tfmail.setBounds(200,300,150,30);
        add(tfmail);

        JLabel lblXmarks =new JLabel("Class X marks");
        lblXmarks.setBounds(400,300,200,30);
        lblXmarks.setFont(new Font("Serif", Font.BOLD,20));
        add(lblXmarks);

        tfxmarks=new JTextField();
        tfxmarks.setBounds(600,300,150,30);
        add(tfxmarks);

        JLabel lblXIImarks =new JLabel("Class XII marks");
        lblXIImarks.setBounds(50,350,200,30);
        lblXIImarks.setFont(new Font("Serif", Font.BOLD,20));
        add(lblXIImarks);

        tfxiimarks=new JTextField();
        tfxiimarks.setBounds(200,350,150,30);
        add(tfxiimarks);

        JLabel lbladhar =new JLabel("Adhaar number");
        lbladhar.setBounds(400,350,200,30);
        lbladhar.setFont(new Font("Serif", Font.BOLD,20));
        add(lbladhar);

        tfadhar=new JTextField();
        tfadhar.setBounds(600,350,150,30);
        add(tfadhar);

        JLabel lblcourse =new JLabel("Qualification");
        lblcourse.setBounds(50,400,200,30);
        lblcourse.setFont(new Font("Serif", Font.BOLD,20));
        add(lblcourse);

        String course[]={"B.Tech","BBA","BCA","BSC","BA","BCom","ITI"};
        cbcourse=new JComboBox(course);
        cbcourse.setBounds(200,400,150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);

        JLabel lblbranch =new JLabel("Branch");
        lblbranch.setBounds( 400,400,200,30);
        lblbranch.setFont(new Font("Serif", Font.BOLD,20));
        add(lblbranch);

        String branch[]={"Computer Science","Information Technology","Electronics","Electrical","Mechanical","Civil"};
        cbbranch=new JComboBox(branch);
        cbbranch.setBounds(600,400,150,30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);

        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name=tffname.getText();
            String fname = tffname.getText();
            String rollno = labrollno.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfmail.getText();
            String x = tfxmarks.getText();
            String xii = tfxiimarks.getText();
            String aadhar = tfadhar.getText();
            String course = (String) cbcourse.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();
            try {
                String query = "insert into teacher values('"+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+course+"', '"+branch+"')";

                Connections con = new Connections();
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new AddTeacher();
    }
}
