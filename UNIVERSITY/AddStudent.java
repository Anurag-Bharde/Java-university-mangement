import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class AddStudent extends JFrame{
    JTextField tfname,tffname,tfaddress,tfphone,tfmail,tfxiimarks,tfxmarks,tfadhar;
    JLabel rollno;
    JDateChooser dcdob;

    Random ran=new Random();
    long first4=Math.abs((ran.nextLong() % 9000L) + 1000L);


    AddStudent(){
        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        JLabel heading =new JLabel("New Student Details");
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

        JLabel Lrollno =new JLabel("Roll Number");
        Lrollno.setBounds(50,200,200,30);
        Lrollno.setFont(new Font("Serif", Font.BOLD,20));
        add(Lrollno);

        rollno =new JLabel("2020BTE"+first4);
        rollno.setBounds(200,200,200,30);
        rollno.setFont(new Font("Serif", Font.BOLD,20));
        add(rollno);


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

        JLabel lblcourse =new JLabel("Course");
        lblcourse.setBounds(50,400,200,30);
        lblcourse.setFont(new Font("Serif", Font.BOLD,20));
        add(lblcourse);

        tfxiimarks=new JTextField();
        tfxiimarks.setBounds(200,350,150,30);
        add(tfxiimarks);


        setVisible(true);
    }
    public static void main(String[] args) {
        new AddStudent();
    }
}
