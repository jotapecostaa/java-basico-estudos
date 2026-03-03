package estudos.testesswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class CalcIdade {
    private JPanel jPanelOne;
    private JSpinner spinnerAge;
    private JButton bntCalc;
    private JLabel lblBirth;
    private JLabel lblIdentify;
    private JLabel lblAge;
    private JLabel lblAtual;
    private JLabel anoAtuall;

    public CalcIdade() {
        bntCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int an = (int) spinnerAge.getValue();
                int idade = 2026 - an;
                lblAge.setText(Integer.toString(idade));
            }
        });

        LocalDate data = LocalDate.now();
        anoAtuall.setText(String.valueOf(data.getYear()));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Age Calc");
        frame.setContentPane(new CalcIdade().jPanelOne);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}




