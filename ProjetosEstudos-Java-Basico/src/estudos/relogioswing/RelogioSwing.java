package estudos.relogioswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class RelogioSwing {
    private JPanel panelOne;
    private JButton bntClick;
    private JLabel lblOne;
    private JLabel lblTitle;
    private JLabel lblMsg;

    public RelogioSwing() {
        bntClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime agora = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
                lblMsg.setText(agora.format(formato));
            }
        });
    }

        public static void main(String[] args) {

        //Objeto frame.
            JFrame frame = new JFrame("Calendar");
            frame.setContentPane(new RelogioSwing().panelOne);
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
