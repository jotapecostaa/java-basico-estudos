package estudos.testesswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperCalc {

    private JLabel lblDiv;
    private JLabel lblCubo;
    private JLabel lblRaiz;
    private JLabel lblRaizDois;
    private JLabel lblAbs;
    private JButton btnClick;
    private JPanel panelUm;
    private JPanel telaCalc;
    private JSpinner spiNum;


    public SuperCalc() {
        panelUm.setVisible(false);
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //pegar o valor int e transformar em string
                int numero = Integer.parseInt(spiNum.getValue().toString());

                //resto da divisão por 2
                int resto = numero % 2;
                lblDiv.setText(String.valueOf(resto));

                // elevado ao cubo
                double cubo = Math.pow(numero, 3);
                lblCubo.setText(String.format("%.2f", cubo));

                // raiz quadrada
                double raizq = Math.sqrt(numero);
                lblRaiz.setText(String.format("%.2f", raizq));

                // raiz cubica
                double raizc = Math.cbrt(numero);
                lblRaizDois.setText(String.format("%.2f", raizc));

                // valor absoluto
                int abs = Math.abs(numero);
                lblAbs.setText(String.valueOf(abs));

                // painel aparecera após os calculos.
                panelUm.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Super calc");
        frame.setContentPane(new SuperCalc().telaCalc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

/*
Um pouco de testes e estudos sobre classe math e operadores aritméticos, aprendi também a utilizar e fazer
comandos em um painel secundario dentro da interface primaria.

Tentei sempre deixar mais clean possivel utilizando String.format e separando meu código.
 */

