package estudos.akinator.game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AkinatorGame extends JFrame {

    private JPanel jPanelGame;
    private JLabel lblFrase;
    private JLabel lblGenio;
    private JSpinner txtNum;
    private JButton btnClick;


    public AkinatorGame() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(txtNum.getValue().toString());
                Random valor = new Random();

                int numeroSecreto = valor.nextInt(5) + 1;
                String frase = numero == numeroSecreto ? "Acertou! É " + numeroSecreto : "Errou! É " + numeroSecreto;
                lblFrase.setText(frase);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Akinator Fake Game");
        frame.setContentPane(new AkinatorGame().jPanelGame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        AkinatorGame game = new AkinatorGame();
        game.lblFrase.setText("<html> Valor de: <br>1 a 5 </html>");
        frame.setContentPane(game.jPanelGame);
    }


}