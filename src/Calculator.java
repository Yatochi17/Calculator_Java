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

    Calculator(){

    }

    public static void main(String[] args){

        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
