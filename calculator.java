package calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calculator implements ActionListener {
    JFrame home = new JFrame("home page");

    JLabel displayLabel = new JLabel();
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton three = new JButton("3");
    JButton two = new JButton("2");
    JButton one = new JButton("1");
    JButton dot = new JButton(".");
    JButton zero = new JButton("0");
    JButton equals = new JButton("=");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton multiply = new JButton("x");
    JButton devide = new JButton("/");
    JButton clear = new JButton("C");

    String resultString = "", operand = "";
    float result = 0;
    float sample;

    JButton previousOperator = new JButton();
    JButton newOperator = new JButton();

    public void add() {

    }

    calculator() {
        home.setLayout(null);
        home.setSize(600, 600);
        home.setVisible(true);

        displayLabel.setBounds(100, 120, 300, 60);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        home.add(displayLabel);

        seven.setBounds(100, 200, 50, 50);
        seven.addActionListener(this);
        home.add(seven);

        eight.setBounds(155, 200, 50, 50);
        eight.addActionListener(this);
        home.add(eight);

        nine.setBounds(210, 200, 50, 50);
        nine.addActionListener(this);
        home.add(nine);

        four.setBounds(100, 260, 50, 50);
        four.addActionListener(this);
        home.add(four);

        five.setBounds(155, 260, 50, 50);
        five.addActionListener(this);
        home.add(five);

        six.setBounds(210, 260, 50, 50);
        six.addActionListener(this);
        home.add(six);

        three.setBounds(100, 320, 50, 50);
        three.addActionListener(this);
        home.add(three);

        two.setBounds(155, 320, 50, 50);
        two.addActionListener(this);
        home.add(two);

        one.setBounds(210, 320, 50, 50);
        one.addActionListener(this);
        home.add(one);

        dot.setBounds(100, 380, 50, 50);
        dot.addActionListener(this);
        home.add(dot);

        zero.setBounds(155, 380, 50, 50);
        zero.addActionListener(this);
        home.add(zero);

        equals.setBounds(210, 380, 50, 50);
        equals.addActionListener(this);
        home.add(equals);

        plus.setBounds(280, 200, 50, 50);
        plus.addActionListener(this);
        home.add(plus);

        minus.setBounds(280, 260, 50, 50);
        minus.addActionListener(this);
        home.add(minus);

        multiply.setBounds(280, 320, 50, 50);
        multiply.addActionListener(this);
        home.add(multiply);

        devide.setBounds(280, 380, 50, 50);
        devide.addActionListener(this);
        home.add(devide);

        clear.setBounds(340, 200, 50, 50);
        clear.addActionListener(this);
        home.add(clear);
    }

    public static void main(String ar[]) {
        new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == seven) {
            operand = operand + "7";
            displayLabel.setText(displayLabel.getText() + "7");
        } else if (e.getSource() == eight) {
            operand = operand + "8";
            displayLabel.setText(displayLabel.getText() + "8");
        } else if (e.getSource() == nine) {
            operand = operand + "9";
            displayLabel.setText(displayLabel.getText() + "9");
        } else if (e.getSource() == four) {
            operand = operand + "4";
            displayLabel.setText(displayLabel.getText() + "4");
        } else if (e.getSource() == five) {
            operand = operand + "5";
            displayLabel.setText(displayLabel.getText() + "5");
        } else if (e.getSource() == six) {
            operand = operand + "6";
            displayLabel.setText(displayLabel.getText() + "6");
        } else if (e.getSource() == three) {
            operand = operand + "3";
            displayLabel.setText(displayLabel.getText() + "3");
        } else if (e.getSource() == two) {
            operand = operand + "2";
            displayLabel.setText(displayLabel.getText() + "2");
        } else if (e.getSource() == one) {
            operand = operand + "1";
            displayLabel.setText(displayLabel.getText() + "1");
        } else if (e.getSource() == dot) {
            operand = operand + ".";
            displayLabel.setText(displayLabel.getText() + ".");
        } else if (e.getSource() == zero) {
            operand = operand + "0";
            displayLabel.setText(displayLabel.getText() + "0");
        } else if (e.getSource() == equals) {
            float oper = Float.parseFloat(operand);
            if (previousOperator == plus) {
                result = result + oper;
            } else if (previousOperator == minus) {
                result = result - oper;
            } else if (previousOperator == multiply) {
                result = result * oper;
            } else if (previousOperator == devide) {
                result = result / oper;
            }

            String res = String.valueOf(result);
            displayLabel.setText(res);
            
            operand="";
            previousOperator=null;

        } else if (e.getSource() == plus) {

            float oper = Float.parseFloat(operand);
            if (previousOperator == plus) {
                result = result + oper;
            } else if (previousOperator == minus) {
                result = result - oper;
            } else if (previousOperator == multiply) {
                result = result * oper;
            } else if (previousOperator == devide) {
                result = result / oper;
            }else {
                previousOperator = plus;
                result = result + oper;
            } 
            operand = "";
            displayLabel.setText(displayLabel.getText() + "+");
            previousOperator = plus;
        } else if (e.getSource() == minus) {
            float oper = Float.parseFloat(operand);
            if (previousOperator == plus) {
                result = result + oper;
            } else if (previousOperator == minus) {
                result = result - oper;
            } else if (previousOperator == multiply) {
                result = result * oper;
            } else if (previousOperator == devide) {
                result = result / oper;
            }else {
                result = result + oper;
                previousOperator = minus;
            } 
            operand = "";
            displayLabel.setText(displayLabel.getText() + "-");
            previousOperator = minus;
        } else if (e.getSource() == multiply) {
            float oper = Float.parseFloat(operand);
            if (previousOperator == plus) {
                result = result + oper;
            } else if (previousOperator == minus) {
                result = result - oper;
            } else if (previousOperator == multiply) {
                result = result * oper;
            } else if (previousOperator == devide) {
                result = result / oper;
            }else {
                result = result + oper;
                previousOperator = multiply;
            } 
            operand = "";
            displayLabel.setText(displayLabel.getText() + "x");
            previousOperator = multiply;
        } else if (e.getSource() == devide) {
            float oper = Float.parseFloat(operand);
            if (previousOperator == plus) {
                result = result + oper;
            } else if (previousOperator == minus) {
                result = result - oper;
            } else if (previousOperator == multiply) {
                result = result * oper;
            } else if (previousOperator == devide) {
                result = result / oper;
            }else {
                result = result + oper;
                previousOperator = devide;
            } 
            operand = "";
            displayLabel.setText(displayLabel.getText() + "/");
            previousOperator = devide;
        } else if (e.getSource() == clear) {
            result=0;
            operand="";
            displayLabel.setText("");
            previousOperator=null;
        }

    }
}
