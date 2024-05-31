package simpleCalculator;
import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame{
        public Calculator() {
            JButton bksp      = new JButton("Bksp");
            JButton ce        = new JButton("CE");
            JButton clr       = new JButton("Clr");
            JButton plusminus = new JButton("+-");
            JButton div       = new JButton("/");
            JButton mult      = new JButton("*");
            JButton minus     = new JButton("-");
            JButton plus      = new JButton("+");
            JButton equals    = new JButton("=");
            JButton dot       = new JButton(".");
            JButton[] digits = new JButton[10];
            JTextField fresult = new JTextField();
            fresult.setBounds(170,100,150,30);
            for (int i = 0; i < digits.length; i++) {
                digits[i] = new JButton(String.valueOf(i));
            }
            digits.addAction
            /* do the layout */
            setLayout(new GridLayout(5, 4, 5, 5));
            add(bksp);
            add(ce);
            add(clr);
            add(plusminus);
            add(digits[7]);
            add(digits[8]);
            add(digits[9]);
            add(div);
            add(digits[4]);
            add(digits[5]);
            add(digits[6]);
            add(mult);
            add(digits[1]);
            add(digits[2]);
            add(digits[3]);
            add(minus);
            add(digits[0]);
            add(dot);
            add(equals);
            add(plus);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }


        public static void main(String[] args) {
            Calculator calc = new Calculator();

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(calc);

            frame.setSize(300, 300);
            frame.setVisible(true);
        }
    }