package estudos.relacionais.logicos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperadoresEmSwing {
    private JTextField txtAno;
    private JButton btnClick;
    private JLabel lblIdade;
    private JLabel lblSit;
    private JPanel JpanelOne;

    public OperadoresEmSwing() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ano = Integer.parseInt(txtAno.getText());
                int idade = 2026 - ano;
                lblIdade.setText(String.valueOf(idade));

                String sit = (idade >= 16 && idade < 18) || (idade > 70) ? "Voto Opcional" : "Voto Obrigatório";
                lblSit.setText(sit);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Operadores");
        frame.setContentPane(new OperadoresEmSwing().JpanelOne);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

/*
    Sistema simbólico para verificação de idade e de obrigatoriedade de voto.
 */
