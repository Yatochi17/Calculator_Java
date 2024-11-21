import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons  = new JButton[10];
    JButton[] fxButtons = new JButton[9];
    JButton add_btn, sub_btn, mul_btn, div_btn, dec_btn, equ_btn, del_btn, clr_btn, neg_btn;
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
        neg_btn = new JButton("(-)");

        fxButtons[0] = add_btn;
        fxButtons[1] = sub_btn;
        fxButtons[2] = mul_btn;
        fxButtons[3] = div_btn;
        fxButtons[4] = dec_btn;
        fxButtons[5] = equ_btn;
        fxButtons[6] = del_btn;
        fxButtons[7] = clr_btn;
        fxButtons[8] = neg_btn;

        for(int i = 0; i < 9 ; i++){
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

        neg_btn.setBounds(50, 430, 100, 50);
        del_btn.setBounds(150, 430, 100, 50 );
        clr_btn.setBounds(250, 430, 100, 50);

        panel= new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(add_btn);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(sub_btn);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mul_btn);
        panel.add(dec_btn);
        panel.add(numberButtons[0]);
        panel.add(equ_btn);
        panel.add(div_btn);

        frame.add(panel);
        frame.add(neg_btn);
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

        for (int i = 0; i < 10; i++){
            if(e.getSource() == numberButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == dec_btn){
            textField.setText(textField.getText().concat(String.valueOf(".")));
        }

        if (e.getSource() == add_btn){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        if (e.getSource() == sub_btn){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (e.getSource() == mul_btn){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (e.getSource() == div_btn){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if (e.getSource() == equ_btn){
            num2 = Double.parseDouble(textField.getText());

            switch (operator){

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;
            }

            textField.setText(String.valueOf(result));
            num1 = result;

        }

        if (e.getSource() == clr_btn){
            textField.setText("");
        }

        if (e.getSource() == del_btn){
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length()-1; i++){
             textField.setText(textField.getText()+string.charAt(i));
            }
        }
    }
}
