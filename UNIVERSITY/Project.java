import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    Project(){
setSize(1540,850);

    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("img/third.jpg"));
    Image i2=i1.getImage().getScaledInstance(1500,750, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image= new JLabel(i3);
    image.setBounds(350,0,200,200);
    add(image);

    JMenuBar mb=new JMenuBar();

    JMenu newInformation=new JMenu("New Information");
    newInformation.setForeground(Color.blue);
    mb.add(newInformation);

    JMenuItem facultyInfo= new JMenuItem("New Faculty Information");
    facultyInfo.setBackground(Color.WHITE);
    newInformation.add(facultyInfo);

    JMenuItem studentInfo= new JMenuItem("New Student Information");
    studentInfo.setBackground(Color.WHITE);
    newInformation.add(studentInfo);

    JMenu details= new JMenu("View Details");
    details.setForeground(Color.BLUE);
    mb.add(details);

    JMenuItem facultyDetails= new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
    details.add(facultyDetails);

    JMenuItem studentDetails= new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.WHITE);
    details.add(studentDetails);

        JMenu leave= new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(details);

        JMenuItem facultyleave= new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        leave.add(facultyleave);

        JMenuItem studentleave= new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        leave.add(studentleave);

        JMenu exam= new JMenu("Examinations");
        exam.setForeground(Color.BLUE);
        mb.add(exam);

        JMenuItem examinationDetails= new JMenuItem("Examination Results");
        examinationDetails.setBackground(Color.WHITE);
        exam.add(examinationDetails);

        JMenuItem entermarks= new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        exam.add(entermarks);

        JMenu updateinfo= new JMenu("Update Details");
        updateinfo.setForeground(Color.BLUE);
        mb.add(updateinfo);

        JMenuItem updatefaculty= new JMenuItem("Update Faculty Detail");
        updatefaculty.setBackground(Color.WHITE);
        updateinfo.add(updatefaculty);

        JMenuItem updateresults= new JMenuItem("Update Student Details");
        updateresults.setBackground(Color.WHITE);
        updateinfo.add(updateresults);

        JMenu fee= new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);

        JMenuItem feestructure= new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        fee.add(feestructure);

        JMenuItem feeform= new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        fee.add(feeform);

        JMenu Utility= new JMenu("Utility");
        Utility.setForeground(Color.BLUE);
        mb.add(Utility);

        JMenuItem notepad= new JMenuItem("NotePad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        Utility.add(notepad);

        JMenuItem calculator= new JMenuItem("Calculator");
        calculator.setBackground(Color.WHITE);
        calculator.addActionListener(this);
        Utility.add(calculator);


        JMenu Exit= new JMenu("Exit");
        Exit.setForeground(Color.BLUE);
        mb.add(Exit);

        JMenuItem ex= new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        Exit.add(ex);


    setJMenuBar(mb);
    setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
         String msg=ae.getActionCommand();
         if(msg.equals("Exit")){
             setVisible(false);
         } else if(msg.equals("Calculator")){
             try{
                 Runtime.getRuntime().exec("calc.exe");
             }catch (Exception e){

             }
         } else if(msg.equalsIgnoreCase("NotePad")){
             try{
                 Runtime.getRuntime().exec("notepad.exe");
             }catch (Exception e){

             }
         }
    }
    public static void main(String[] args) {
        new Project();
    }
}
