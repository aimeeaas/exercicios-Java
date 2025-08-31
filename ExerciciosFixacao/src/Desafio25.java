
// Bibliotecas para Tela
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Bibliotecas para escrever arquivo txt
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Bibliotecas para ler arquivo txt
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Desafio25 {
    public static void main(String[] args) {
        // Tela - Frame e Panel
        JFrame frame = new JFrame("Controle de Estoque");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Tela - Label e TextField
        JLabel label1 = new JLabel("Produto:");
        panel.add(label1);
        JTextField text1 = new JTextField(20);
        panel.add(text1);

        panel.add(Box.createVerticalStrut(20));

        JLabel label2 = new JLabel("Quantidade:");
        panel.add(label2);
        JTextField text2 = new JTextField(4);
        panel.add(text2);

        panel.add(Box.createVerticalStrut(20));

        // Tela - Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton button1 = new JButton("Cadastrar Produto");
        buttonPanel.add(button1);

        JButton button2 = new JButton("Listar Estoque");
        buttonPanel.add(button2);

        // Ação do button1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (text1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "O campo 'Produto' está vazio.", "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else if (text2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "O campo 'Quantidade' está vazio.", "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        String produto = text1.getText();
                        int qtd = Integer.parseInt(text2.getText());
                        try {
                            FileWriter arquivo = new FileWriter("estoque.txt", true);
                            PrintWriter escreve = new PrintWriter(arquivo);
                            escreve.println(produto + "; " + qtd);
                            escreve.close();

                            JOptionPane.showMessageDialog(frame, "Estoque Atualizado!");
                            text1.setText("");
                            text2.setText("");
                        } catch (IOException ex) {
                            System.out.println("Erro ao escrever arquivo!");
                            ex.printStackTrace();
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "O campo 'Quantidade' deve conter um número inteiro.",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        // Ação do button2
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileReader arquivo = new FileReader("estoque.txt");
                    Scanner sc = new Scanner(arquivo);
                    StringBuilder linhas = new StringBuilder();

                    while (sc.hasNextLine()) {
                        linhas.append(sc.nextLine()).append("\n");
                    }

                    JOptionPane.showMessageDialog(frame, "Controle de Estoque:\n" + linhas);
                    sc.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("Não há produtos cadastrados.");
                    ex.printStackTrace();
                }
            }
        });

        // Tela - Final
        panel.add(buttonPanel);
        frame.add(panel);
        frame.setVisible(true);

    }
}
