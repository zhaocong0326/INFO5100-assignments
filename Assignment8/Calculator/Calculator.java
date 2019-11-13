import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    static JFrame frame;

    static JTextField feild;

    String s0, s1, s2;

    Calculator()
    {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[])
    {
        frame = new JFrame("Calculator");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Calculator calculator = new Calculator();

        feild = new JTextField(20);

        feild.setEditable(false);

        JButton number0, number1, number2, number3, number4, number5, number6, number7, number8, number9;
        JButton add, minus, multiply, divide, be, clear, euqals;

        number0 = new JButton("0");
        number1 = new JButton("1");
        number2 = new JButton("2");
        number3 = new JButton("3");
        number4 = new JButton("4");
        number5 = new JButton("5");
        number6 = new JButton("6");
        number7 = new JButton("7");
        number8 = new JButton("8");
        number9 = new JButton("9");

        euqals = new JButton("=");

        //operator buttons
        add = new JButton("+");
        minus = new JButton("-");
        divide = new JButton("/");
        multiply = new JButton("*");
        clear = new JButton("C");

        // create . button
        be = new JButton(".");

        // create a panel
        JPanel p = new JPanel();

        // add action listeners
        add.addActionListener(calculator);
        minus.addActionListener(calculator);
        multiply.addActionListener(calculator);
        divide.addActionListener(calculator);
        number9.addActionListener(calculator);
        number8.addActionListener(calculator);
        number7.addActionListener(calculator);
        number6.addActionListener(calculator);
        number5.addActionListener(calculator);
        number4.addActionListener(calculator);
        number3.addActionListener(calculator);
        number2.addActionListener(calculator);
        number1.addActionListener(calculator);
        number0.addActionListener(calculator);
        be.addActionListener(calculator);
        clear.addActionListener(calculator);
        euqals.addActionListener(calculator);

        // add elements to panel
        p.add(feild);
        p.add(clear);
        p.add(number1);
        p.add(number2);
        p.add(number3);
        p.add(add);
        p.add(number4);
        p.add(number5);
        p.add(number6);
        p.add(minus);
        p.add(number7);
        p.add(number8);
        p.add(number9);
        p.add(multiply);
        p.add(be);
        p.add(number0);
        p.add(divide);
        p.add(euqals);

        // set Background of panel
        p.setBackground(Color.PINK);

        // add panel to frame
        frame.add(p);

        frame.setSize(200, 220);
        frame.show();
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String s = actionEvent.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {

            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;

            feild.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {

            s0 = s1 = s2 = "";

            feild.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {

            double t;

            if (s1.equals("+"))
                t = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                t = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                t = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                t = (Double.parseDouble(s0) * Double.parseDouble(s2));

            feild.setText(s0 + s1 + s2 + "=" + t);

            s0 = Double.toString(t);

            s1 = s2 = "";
        }
        else {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else {
                double te;

                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(te);
                s1 = s;
                s2 = "";
            }
            feild.setText(s0 + s1 + s2);
        }
    }
}
