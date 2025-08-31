import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex18 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela");
        frame.setSize(300, 150);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Clique Aqui");
        button.setBackground(new Color(221, 160, 221)); // Cor de fundo
        frame.add(button, BorderLayout.CENTER); // Centraliza o botão no JFrame

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(button, "Botão Clicado!");
            }
        });

        frame.setVisible(true);
    }
}
