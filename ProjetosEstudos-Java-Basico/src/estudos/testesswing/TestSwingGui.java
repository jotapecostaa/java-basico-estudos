package estudos.testesswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSwingGui {
    private JPanel firstPanel;
    private JButton bntAction;
    private JLabel msgNome;

    public TestSwingGui() {
        bntAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                msgNome.setText("The button are done!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TestSwingGui");
        frame.setContentPane(new TestSwingGui().firstPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
