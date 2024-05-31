package Calculator;
import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.awt.event.*;

public class CalculatorBox extends JFrame{
        JLabel labelnum1,labelnum2,add,sub,multi,div;
        JTextField fieldnum1,fieldnum2,fieldadd,fieldsub,fieldmulti,fielddiv;
        JButton btnclose,btndisplay;
public CalculatorBox(){
    //name
    labelnum1 = new JLabel("Num1");
    labelnum1.setBounds(50,50,100,30);
    fieldnum1 = new JTextField();
    fieldnum1.setBounds(170,50,150,30);


    labelnum2 = new JLabel("Num2");
    labelnum2.setBounds(50,100,100,30);
    fieldnum2 = new JTextField();
    fieldnum2.setBounds(170,100,150,30);

    add = new JLabel("Addition");
    add.setBounds(50,150,100,30);
    fieldadd= new JTextField();
    fieldadd.setBounds(170,150,150,30);

    sub = new JLabel("Subtraction");
    sub.setBounds(50,200,100,30);
    fieldsub = new JTextField();
    fieldsub.setBounds(170,200,150,30);

    multi = new JLabel("Multiplication");
    multi.setBounds(50,250,100,30);
    fieldmulti = new JTextField();
    fieldmulti.setBounds(170,250,150,30);

    div = new JLabel("Division");
    div.setBounds(50,300,100,30);
    fielddiv = new JTextField();
    fielddiv.setBounds(170,300,150,30);


    btndisplay = new JButton("Calculate");
    btndisplay.setBounds(170,350,100,30);
    btnclose = new JButton("Cancel");
    btnclose.setBounds(290,350,100,30);
    //btnclose
    btnclose.addActionListener(e->{
        fieldnum1.setText("");
        fieldnum2.setText("");
        fieldadd.setText("");
        fieldsub.setText("");
        fieldmulti.setText("");
        fielddiv.setText("");
    });
    //btnddsiplay
    btndisplay.addActionListener(e->{
        double num1 = Double.parseDouble(fieldnum1.getText());
        double num2 = Double.parseDouble(fieldnum2.getText());

        double add = num1+num2;
        double sub = num1-num2;
        double multi = num1*num2;
        double div = num1/num2;

        fieldadd.setText(String.valueOf(add));
        fieldsub.setText(String.valueOf(sub));
        fieldmulti.setText(String.valueOf(multi));
        fielddiv.setText(String.valueOf(div));





    });

    //adding into frame
    add(labelnum1);
    add(fieldnum1);
    add(labelnum2);
    add(fieldnum2);
    add(add);
    add(fieldadd);
    add(sub);
    add(fieldsub);
    add(multi);
    add(div);
    add(fieldmulti);
    add(fielddiv);
    add(btndisplay);
    add(btnclose);
    setSize(500,500);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}

    public static void main(String[] args){
        new CalculatorBox();
    }
}

