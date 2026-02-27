package estudos.testesswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    private JLabel lblTitle;
    private JTextField numberOne;
    private JTextField numberTwo;
    private JButton bntClick;
    private JLabel lblResult;
    private JLabel lblPlus;
    private JPanel calcPanel;

    public Calc() {
        bntClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               float n1 = Float.parseFloat(numberOne.getText());
               float n2 = Float.parseFloat(numberTwo.getText());
               float soma = n1 + n2;
               lblResult.setText(Float.toString(soma));


            }
        });
    }

    static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calc().calcPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
