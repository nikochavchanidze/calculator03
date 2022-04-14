import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class calculator03 extends JFrame {
    private JPanel panel1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button4;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button8;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button12;
    private JButton button13;
    private JButton a0Button;
    private JButton button15;
    private JButton xButton;
    private JTextArea LIL;
    private JButton deleteButton;
    double tell;
    String operator="";
    String operand1="";
    String operand2="";

    public calculator03() {


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.append("1");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + "1";
                }else {
                    operand2 = operand2 + "1";
                }
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.append("2");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + "2";
                }else {
                    operand2 = operand2 + "2";
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                LIL.append("3");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + "3";
                }else {
                    operand2 = operand2 + "3";
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Objects.equals(operator, "")){
                    LIL.append("-");
                    operator = ("-");
                }else{
                    String currentText = LIL.getText();
                    String li = currentText.substring(0,currentText.length()-1);
                    currentText = li + "-";
                    LIL.setText(currentText);
                    operator = ("-");
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.append("4");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + "4";
                }else {
                    operand2 = operand2 + "4";
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.append("5");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + "5";
                }else {
                    operand2 = operand2 + "5";
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.append("6");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + "6";
                }else {
                    operand2 = operand2 + "6";
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Objects.equals(operator, "")) {
                    LIL.append("+");
                    operator = ("+");
                }else{
                    String currentText = LIL.getText();
                    String li = currentText.substring(0,currentText.length()-1);
                    currentText = li + "+";
                    LIL.setText(currentText);
                    operator = ("+");
                }

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.append("7");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + "7";
                }else {
                    operand2 = operand2 + "7";
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.append("8");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + "8";
                }else {
                    operand2 = operand2 + "8";
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.append("9");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + "9";
                }else {
                    operand2 = operand2 + "9";
                }
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Objects.equals(operator, "")) {
                    LIL.append("x");
                    operator = ("x");
                }else{
                    String currentText = LIL.getText();
                    String li = currentText.substring(0,currentText.length()-1);
                    currentText = li + "x";
                    LIL.setText(currentText);
                    operator = ("x");
                }
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.append("0");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + "0";
                }else {
                    operand2 = operand2 + "0";
                }

            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.append(".");
                if(!Objects.equals(operator, "+") & !Objects.equals(operator, "-") & !Objects.equals(operator, "x") & !Objects.equals(operator, "÷")){
                    operand1 = operand1 + ".";
                }else {
                    operand2 = operand2 + ".";
                }
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Objects.equals(operator, "")) {
                    LIL.append("÷");
                    operator = ("÷");
                }else{
                    String currentText = LIL.getText();
                    String li = currentText.substring(0,currentText.length()-1);
                    currentText = li + "÷";
                    LIL.setText(currentText);
                    operator = ("÷");
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LIL.setText("");
                operand1 = "";
                operand2 = "";
                operator = "";
            }
        });



        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(operand1);
                System.out.println(operand2);
                switch (operator) {
                    case "+":
                        tell = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
                        break;
                    case "-":
                        tell = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
                        break;
                    case "÷":
                        tell = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
                        break;
                    case "x":
                        tell = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
                        break;
                }
                LIL.setText(String.valueOf(Math.round(tell*100.0)/100.0));
                operand1 = "";
                operand2 = "";
                operator = "";


            }
        });
    }




    public static void main(String[] args) {
        calculator03 c = new calculator03();
        c.setVisible(true);
        c.setTitle("calculator");
        c.setContentPane(c.panel1);
        c.setSize(300,400);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
