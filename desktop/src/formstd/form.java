package formstd;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class form extends JFrame {
    JLabel labelid, labelname,labelemail,labelgender,labelfaculty;
    JTextField fieldid,fieldname,fieldemail,fieldfaculty;
    JButton btnclose,btndisplay,btninsert,btndelete,btnreset,btnupdate;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JComboBox jc;
    public form()
    {
        //name//
        labelname= new JLabel("Name");
        labelname.setBounds(50,50,100,30);
        fieldname= new JTextField();
        fieldname.setBounds(170,50,150,30);

        labelname= new JLabel("Name");
        labelname.setBounds(50,100,100,30);
        fieldname= new JTextField();
        fieldname.setBounds(170,100,150,30);

        //email//
        labelemail= new JLabel("Email");
        labelemail.setBounds(50,150,100,30);
        fieldemail= new JTextField();
        fieldemail.setBounds(170,150,150,30);

        //gender//
        labelgender= new JLabel("Gender");
        labelgender.setBounds(50,250,100,30);
        r1= new JRadioButton("Male");
        r2= new JRadioButton("Female");
        r1.setBounds(170,250,100,30);
        r2.setBounds(270,250,100,30);
        bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        //faculty//
        labelfaculty= new JLabel("Faculty");
        labelfaculty.setBounds(50,200,100,30);
        String facultydetails[] ={"BCA","BBM","BIT","BSC.CSIT"};
        jc =new JComboBox(facultydetails);
        jc.setBounds(170,300,150,30);


        btninsert= new JButton("Insert");
        btninsert.setBounds(170,300,100,30);
        btnreset= new JButton("Reset");
        btnreset.setBounds(270,300,100,30);
        btndelete= new JButton("Delete");
        btndelete.setBounds(170,350,100,30);
        btnupdate= new JButton("Update");
        btnupdate.setBounds(270,350,100,30);
        btndisplay= new JButton("Display");
        btnupdate.setBounds(170,400,100,30);


        //btnclose//
        btnclose.addActionListener(e ->{
            System.exit(0);
        });
        //btndisplay//
        btndisplay.addActionListener(e -> {
            String id =fieldid.getText();
            String name =fieldname.getText();
            String email =fieldemail.getText();
            String gender =r1.isSelected() ? "Male" : "Female";
            String faculty = (String)jc.getSelectedItem();
            System.out.println("Student Details");
            System.out.println("ID ="+id);
            System.out.println("Name ="+name);
            System.out.println("Email ="+email);
            System.out.println("Gender ="+gender);
            System.out.println("Faculty ="+faculty);
            JOptionPane.showMessageDialog(btndisplay,"Display Successfully");
        });
        btninsert.addActionListener(e ->{


        });
        //adding into frame//
        add(labelname);
        add(labelid);
        add(fieldid);
        add(fieldname);
        add(labelemail);
        add(fieldemail);
        add(labelgender);
        add(r1);
        add(r2);
        add(labelfaculty);
        add(jc);
        add(btndisplay);
        add(btninsert);
        add(btndelete);
        add(btnupdate);
        add(btnreset);

        add(btnclose);
        setSize(500,500);
        setLayout(null);
        //setResizeable(false);//
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new form();
    }
}
