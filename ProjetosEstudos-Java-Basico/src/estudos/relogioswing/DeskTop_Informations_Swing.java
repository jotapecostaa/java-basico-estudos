package estudos.relogioswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DeskTop_Informations_Swing {
    private JPanel panelOne;
    private JButton bntClick;
    private JLabel lblMsg;
    private JLabel imagePc;
    private JLabel imgGlobo;
    private JButton bntResolucao;
    private JLabel lblRes;
    private JButton mostrarButton;
    private JLabel lblIdioma;

    public DeskTop_Informations_Swing() {
        bntClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime agora = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
                lblMsg.setText(agora.format(formato));
            }
        });
        bntResolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
                lblRes.setText((int) resolucao.getWidth() + " X " + (int) resolucao.getHeight());
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Locale idioma = Locale.getDefault();
                lblIdioma.setText(idioma.getDisplayLanguage());
            }
        });
    }

        public static void main(String[] args) {

        //Objeto frame.
            JFrame frame = new JFrame("DeskTop Informations");
            frame.setContentPane(new DeskTop_Informations_Swing().panelOne);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }

}
/*
Aqui criei o layout no form, dei nome a todos os que achei importante, msm n precisando
ao invés de Date, utilizei 2 bibliotecas diferentes para deixar mais bonito, assim tive q criar 2 objetos
Aprendi que o método main é a mesma forma sempre.

neste swing eu testei colocar imagens pra ver como fica, no começo é dificl fazer o design.
depois que fui fazendo testes e errando bastante, estou pegando o jeito de usar a IDE para isto.
 */
