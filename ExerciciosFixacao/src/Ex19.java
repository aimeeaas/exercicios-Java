import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex19 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mensagens");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button = new JButton("Mensagem1");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(button, "Olá!");
            }
        });

        JButton button1 = new JButton("Mensagem2");
        panel.add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(button1, "Adeus!");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
