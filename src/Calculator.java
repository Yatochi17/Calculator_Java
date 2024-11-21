import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons  = new JButton[10];
    JButton[] fxButtons = new JButton[8];
    JButton add_btn, sub_btn, mul_btn, div_btn, dec_btn, equ_btn, del_btn, clr_btn;
    JPanel panel;

    Font myFont = new Font("Montserrat", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 500);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        add_btn = new JButton("+");
        sub_btn = new JButton("-");
        mul_btn = new JButton("*");
        div_btn = new JButton("/");
        dec_btn = new JButton(".");
        equ_btn = new JButton("=");
        del_btn = new JButton("Delete");
        clr_btn = new JButton("Clear");

        fxButtons[0] = add_btn;
        fxButtons[1] = sub_btn;
        fxButtons[2] = mul_btn;
        fxButtons[3] = div_btn;
        fxButtons[4] = dec_btn;
        fxButtons[5] = equ_btn;
        fxButtons[6] = del_btn;
        fxButtons[7] = clr_btn;

        for(int i = 0; i < 8 ; i++){
            fxButtons[i].addActionListener(this);
            fxButtons[i].setFont(myFont);
            fxButtons[i].setFocusable(false);
        }


        for(int i = 0; i < 10 ; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        del_btn.setBounds(50, 430, 145, 50 );
        clr_btn.setBounds(205, 430, 145, 50);

        panel= new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));


        frame.add(panel);
        frame.add(del_btn);
        frame.add(clr_btn);
        frame.add(textField);
        frame.setVisible(true);

        frame.add(textField);
        frame.setVisible(true);

    }

    public static void main(String[] args){

        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
