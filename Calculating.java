// NAME: Ambrose Yancey    DATE: 05/01/2024

// COURSE: COMP 167      Section: 004

// DESCRIPTION
// Created a scientific calculator to do math operations such as addition and subtraction

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculating implements ActionListener {
    //Initializing variables
    Font font = new Font("Serif", Font.BOLD, 40);
    String operator;
    double result = 0;
    double num1;
    double num2;
    JFrame frame;
    JPanel panel;
    JTextField input, output;
    JButton one, two, three, four, five, six, seven, eight, nine, zero;
    JButton add, sub, mult, div, equal, dec;
    JButton percent, powerx2, powerx3, mod, reciprocal, squareRoot, negative, log, ln, tenpower, abs;
    JButton sin, cos, tan, asin, acos, atan, sinh, cosh, tanh;
    JButton clear, exit;

    //Main method that creates an instance named calc of my Calculator
    public static void main(String[] args) {
        Calculating calc = new Calculating();
    }

    //Constructor for the calculator
    public Calculating() {
        //Creates frame and input output text fields

        frame = new JFrame("CI - Calculator");
        frame.setSize(470, 535);
        frame.getContentPane().setBackground(new Color(128, 128, 128));
        frame.setResizable(true);
        panel = new JPanel();
        panel.setBackground(new Color(128, 128, 128));
        panel.setLayout(null);

        input = new JTextField();
        input.setSize(450, 30);
        input.setBackground(new Color(0, 200, 0));
        panel.add(input);

        output = new JTextField();
        output.setSize(450, 50);
        output.setLocation(0, 30);
        output.setBackground(new Color(0, 200, 0));
        panel.add(output);

        //Creates the buttons that the user can interact with
        //Buttons are added to panel
        zero = new JButton("0");
        zero.setSize(58, 35);
        zero.setLocation(24, 250);
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "0");
            }
        });
        panel.add(zero);

        one = new JButton("1");
        one.setSize(58, 35);
        one.setLocation(24, 210);
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "1");
            }
        });
        panel.add(one);

        two = new JButton("2");
        two.setSize(58, 35);
        two.setLocation(92, 210);
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "2");
            }
        });
        panel.add(two);

        three = new JButton("3");
        three.setSize(58, 35);
        three.setLocation(160, 210);
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "3");
            }
        });
        panel.add(three);

        four = new JButton("4");
        four.setSize(58, 35);
        four.setLocation(24, 170);
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "4");
            }
        });
        panel.add(four);

        five = new JButton("5");
        five.setSize(58, 35);
        five.setLocation(92, 170);
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "5");
            }
        });
        panel.add(five);

        six = new JButton("6");
        six.setSize(58, 35);
        six.setLocation(160, 170);
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "6");
            }
        });
        panel.add(six);

        seven = new JButton("7");
        seven.setSize(58, 35);
        seven.setLocation(24, 130);
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "7");
            }
        });
        panel.add(seven);

        eight = new JButton("8");
        eight.setSize(58, 35);
        eight.setLocation(92, 130);
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "8");
            }
        });
        panel.add(eight);

        nine = new JButton("9");
        nine.setSize(58, 35);
        nine.setLocation(160, 130);
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "9");
            }
        });
        panel.add(nine);

        //operator buttons
        add = new JButton("+");
        add.setSize(58, 35);
        add.setLocation(228, 170);
        add.addActionListener(this);
        panel.add(add);

        sub = new JButton("-");
        sub.setSize(58, 35);
        sub.setLocation(294, 170);
        sub.addActionListener(this);
        panel.add(sub);

        mult = new JButton("x");
        mult.setSize(58, 35);
        mult.setLocation(228, 130);
        mult.addActionListener(this);
        panel.add(mult);

        div = new JButton("/");
        div.setSize(58, 35);
        div.setLocation(294, 130);
        div.addActionListener(this);
        panel.add(div);

        percent = new JButton("%");
        percent.setSize(58, 35);
        percent.setLocation(294, 250);
        percent.addActionListener(this);
        panel.add(percent);

        equal = new JButton("=");
        equal.setSize(126, 35);
        equal.setLocation(228, 210);
        equal.addActionListener(this);
        panel.add(equal);

        powerx2 = new JButton("x^2");
        powerx2.setSize(60, 35);
        powerx2.setLocation(362, 130);
        powerx2.addActionListener(this);
        panel.add(powerx2);

        powerx3 = new JButton("x^3");
        powerx3.setSize(60, 35);
        powerx3.setLocation(362, 170);
        powerx3.addActionListener(this);
        panel.add(powerx3);

        mod = new JButton("Mod");
        mod.setSize(60, 35);
        mod.setLocation(362, 210);
        mod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "%");
            }
        });
        panel.add(mod);

        //other functions and symbol buttons
        reciprocal = new JButton("1/n");
        reciprocal.setSize(58, 35);
        reciprocal.setLocation(228, 250);
        reciprocal.addActionListener(this);
        panel.add(reciprocal);

        squareRoot = new JButton("sqrt");
        squareRoot.setSize(60, 35);
        squareRoot.setLocation(362, 250);
        squareRoot.addActionListener(this);
        panel.add(squareRoot);

        log = new JButton("log");
        log.setSize(70, 35);
        log.setLocation(270, 320);
        log.addActionListener(this);
        panel.add(log);

        ln = new JButton("ln");
        ln.setSize(72, 35);
        ln.setLocation(350, 320);
        ln.addActionListener(this);
        panel.add(ln);

        sin = new JButton("sin");
        sin.setSize(70, 35);
        sin.setLocation(24, 320);
        sin.addActionListener(this);
        panel.add(sin);

        cos = new JButton("cos");
        cos.setSize(70, 35);
        cos.setLocation(108, 320);
        cos.addActionListener(this);
        panel.add(cos);

        tan = new JButton("tan");
        tan.setSize(70, 35);
        tan.setLocation(190, 320);
        tan.addActionListener(this);
        panel.add(tan);

        asin = new JButton("asin");
        asin.setSize(70, 35);
        asin.setLocation(24, 360);
        asin.addActionListener(this);
        panel.add(asin);

        acos = new JButton("acos");
        acos.setSize(70, 35);
        acos.setLocation(108, 360);
        acos.addActionListener(this);
        panel.add(acos);

        atan = new JButton("atan");
        atan.setSize(70, 35);
        atan.setLocation(190, 360);
        atan.addActionListener(this);
        panel.add(atan);

        cosh = new JButton("cosh");
        cosh.setSize(70, 35);
        cosh.setLocation(108, 400);
        cosh.addActionListener(this);
        panel.add(cosh);

        sinh = new JButton("sinh");
        sinh.setSize(70, 35);
        sinh.setLocation(24, 400);
        sinh.addActionListener(this);
        panel.add(sinh);

        tanh = new JButton("tanh");
        tanh.setSize(70, 35);
        tanh.setLocation(190, 400);
        tanh.addActionListener(this);
        panel.add(tanh);

        clear = new JButton("C");
        clear.setSize(60, 35);
        clear.setLocation(362, 90);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText("");
                output.setText("");
                result = 0;
            }
        });
        panel.add(clear);

        exit = new JButton("EXIT");
        exit.setSize(152, 35);
        exit.setLocation(270, 400);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(exit);

        abs = new JButton("abs");
        abs.setSize(72, 35);
        abs.setLocation(350, 360);
        abs.addActionListener(this);
        panel.add(abs);

        negative = new JButton("±");
        negative.setSize(58, 35);
        negative.setLocation(160, 250);
        negative.addActionListener(this);
        panel.add(negative);

        tenpower = new JButton("10^n");
        tenpower.setSize(70, 35);
        tenpower.setLocation(270, 360);
        tenpower.addActionListener(this);
        panel.add(tenpower);

        dec = new JButton(".");
        dec.setSize(58, 35);
        dec.setLocation(92, 250);
        dec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + ".");
            }
        });
        panel.add(dec);

        //Adds panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }

    //Whenever a button is clicked, it goes through here
    public void actionPerformed(ActionEvent event) {

        try{
            //Saves first number and replaces text with operator symbol
            if (event.getSource() == add){
                num1 = Double.parseDouble(input.getText());
                input.setText("+");
                result = num1;
            }
            if (event.getSource() == mult){
                num1 = Double.parseDouble(input.getText());
                input.setText("x");
                result = num1;
            }
            if (event.getSource() == div){
                num1 = Double.parseDouble(input.getText());
                input.setText("/");
                result = num1;
            }
            if (event.getSource() == sub){
                num1 = Double.parseDouble(input.getText());
                input.setText("(-)");
                result = num1;
            }

            if (event.getSource() == equal) {
                operator = input.getText();

                int addIndex = operator.indexOf("+");
                int subIndex = operator.indexOf(")");
                int multIndex = operator.indexOf("x");
                int divIndex = operator.indexOf("/");
                int modIndex = operator.indexOf("%");

                //if first character matches operator, it will do the operation
                if (input.getText().charAt(0) == '+') {
                    num2 = Double.parseDouble(input.getText().substring(addIndex + 1));

                    result = num1 + num2;
                }
                else if (input.getText().charAt(0) == 'x') {
                    num2 = Double.parseDouble(input.getText().substring(multIndex + 1));

                    result = num1 * num2;
                }
                else if (input.getText().charAt(0) == '/') {
                    num2 = Double.parseDouble(input.getText().substring(divIndex + 1));

                    result = num1 / num2;

                    if (num2 == 0) {
                        throw new ArithmeticException();
                    }
                }
                else if (input.getText().charAt(0) == '(') {
                    num2 = Double.parseDouble(input.getText().substring(subIndex + 1));

                    result = num1 - num2;
                }
                else if (modIndex > 0) {
                    num1 = Double.parseDouble(input.getText().substring(0, modIndex));
                    num2 = Double.parseDouble(input.getText().substring(modIndex + 1));

                    result = num1 % num2;

                    if (num2 == 0) {
                        throw new ArithmeticException();
                    }
                }
                else {
                    num1 = Double.parseDouble(input.getText());

                    result = num1;
                }
            }

            //Will do function or symbol when clicked
            if (event.getSource() == sin) {
                num1 = Double.parseDouble(input.getText());

                result = Math.sin(num1);
                input.setText("sin(" + input.getText() + ")");
            }
            else if (event.getSource() == cos) {
                num1 = Double.parseDouble(input.getText());

                result = Math.cos(num1);
                input.setText("cos(" + input.getText() + ")");
            }
            else if (event.getSource() == tan) {
                num1 = Double.parseDouble(input.getText());

                result = Math.tan(num1);
                input.setText("tan(" + input.getText() + ")");
            }
            else if (event.getSource() == asin) {
                num1 = Double.parseDouble(input.getText());

                result = Math.asin(num1);
                input.setText("asin(" + input.getText() + ")");
            }
            else if (event.getSource() == acos) {
                num1 = Double.parseDouble(input.getText());

                result = Math.acos(num1);
                input.setText("acos(" + input.getText() + ")");
            }
            else if (event.getSource() == atan) {
                num1 = Double.parseDouble(input.getText());

                result = Math.atan(num1);
                input.setText("atan(" + input.getText() + ")");
            }
            else if (event.getSource() == sinh) {
                num1 = Double.parseDouble(input.getText());

                result = Math.sinh(num1);
                input.setText("sinh(" + input.getText() + ")");
            }
            else if (event.getSource() == cosh) {
                num1 = Double.parseDouble(input.getText());

                result = Math.cosh(num1);
                input.setText("cosh(" + input.getText() + ")");
            }
            else if (event.getSource() == tanh) {
                num1 = Double.parseDouble(input.getText());

                result = Math.tanh(num1);
                input.setText("tanh(" + input.getText() + ")");
            }
            else if (event.getSource() == log) {
                num1 = Double.parseDouble(input.getText());

                result = Math.log10(num1);
                input.setText("log(" + input.getText() + ")");

                if (num1 == 0) {
                    throw new ArithmeticException();
                }
            }
            else if (event.getSource() == ln) {
                num1 = Double.parseDouble(input.getText());

                result = Math.log(num1);
                input.setText("ln(" + input.getText() + ")");

                if (num1 == 0) {
                    throw new ArithmeticException();
                }
            }
            else if (event.getSource() == abs) {
                num1 = Double.parseDouble(input.getText());

                result = Math.abs(num1);
                input.setText("abs|" + input.getText() + "|");
            }
            else if (event.getSource() == reciprocal) {
                num1 = Double.parseDouble(input.getText());

                result = (1 / num1);
                input.setText("1/" + input.getText());

                if (num1 == 0) {
                    throw new ArithmeticException();
                }
            }
            else if (event.getSource() == squareRoot) {
                num1 = Double.parseDouble(input.getText());

                result = Math.sqrt(num1);
                input.setText("sqrt(" + input.getText() + ")");

                if (num1 < 0) {
                    throw new ArithmeticException();
                }
            }
            else if (event.getSource() == tenpower) {
                num1 = Double.parseDouble(input.getText());

                result = Math.pow(10, num1);
                input.setText("10^" + input.getText());
            }
            else if (event.getSource() == powerx3) {
                num1 = Double.parseDouble(input.getText());

                result = Math.pow(num1, 3);
                input.setText(input.getText() + "^" + "3");
            }
            else if (event.getSource() == powerx2) {
                num1 = Double.parseDouble(input.getText());

                result = Math.pow(num1, 2);
                input.setText(input.getText() + "^" + "2");
            }
            else if (event.getSource() == percent) {
                num1 = Double.parseDouble(input.getText());

                result = (num1 / 100);
                input.setText(input.getText() + "%");
            }
            else if (event.getSource() == negative) {
                //toggles negative button for number if clicked twice
                //If an operator is in front of a number,it will ignore operator and make the number negative
                if (input.getText().charAt(0) == '-'){
                    input.setText(input.getText().substring(1));
                    result = Double.parseDouble(input.getText());
                }
                else if (input.getText().charAt(0) == '+'){
                    if (input.getText().charAt(1) == '-'){
                        input.setText("+" + input.getText().substring(2));
                    }
                    else {
                        input.setText("+-" + input.getText().substring(1));
                    }
                }
                else if (input.getText().charAt(0) == '('){
                    if (input.getText().charAt(3) == '-'){
                        input.setText("(-)" + input.getText().substring(4));
                    }
                    else {
                        input.setText("(-)-" + input.getText().substring(3));
                    }
                }
                else if (input.getText().charAt(0) == 'x'){
                    if (input.getText().charAt(1) == '-'){
                        input.setText("x" + input.getText().substring(2));
                    }
                    else {
                        input.setText("x-" + input.getText().substring(1));
                    }
                }
                else if (input.getText().charAt(0) == '/'){
                    if (input.getText().charAt(1) == '-'){
                        input.setText("/" + input.getText().substring(2));
                    }
                    else {
                        input.setText("/-" + input.getText().substring(1));
                    }
                }
                else if (input.getText().charAt(0) != '-'){
                    input.setText("-" + input.getText());
                    result = Double.parseDouble(input.getText());
                }
            }

            output.setText("                                                                " + result);
        } //end of try statement

        //catch statements catch errors such as 1/0, and sqrt(-1)
        catch (ArithmeticException e){
            output.setText("                                                           ERROR");
        }

        catch (Exception e){
            output.setText("                                                           ERROR");
        }

        output.setFont(font);
    } //end of actionPreformed
}
