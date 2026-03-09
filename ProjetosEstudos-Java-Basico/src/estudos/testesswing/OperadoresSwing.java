package estudos.testesswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperadoresSwing {
    private JTextField txtNum;
    private JLabel lblNumerador;
    private JLabel lblDenominador;
    private JLabel lblDiv;
    private JLabel lblResto;
    private JTextField txtDen;
    private JLabel lblResDiv;
    private JLabel lblResResto;
    private JButton bntClick;
    private JPanel JpanelOne;

    public OperadoresSwing() {
        bntClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(txtNum.getText());

                //sempre que pegar numero e querer mostrar em texto converter para string

                int den = Integer.parseInt(txtDen.getText());

                float div = num / den;
                float rest = num % den;

                //sempre que um texto for virar valor pode usar o method String.valueOf
                lblResDiv.setText(String.valueOf(div));
                lblResResto.setText(String.valueOf(rest));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Divisões");
        frame.setContentPane(new OperadoresSwing().JpanelOne);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}