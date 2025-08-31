
// Bibliotecas para Tela
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Bibliotecas para escrever usuarios.txt
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Bibliotecas para ler usuarios.txt
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Desafio24 {
    public static void main(String[] args) {
        // Tela - Frame e Panel
        JFrame frame = new JFrame("Cadastro de Usuários");
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // BoxLayout para alinhamento vertical (eixo Y)

        // Tela - Label e TextField
        JLabel label1 = new JLabel("Nome:");
        panel.add(label1);
        JTextField text1 = new JTextField(30);
        panel.add(text1);

        panel.add(Box.createVerticalStrut(10)); // Espaçamento entre os campos

        JLabel label2 = new JLabel("Idade:");
        panel.add(label2);
        JTextField text2 = new JTextField(3);
        panel.add(text2);

        panel.add(Box.createVerticalStrut(10)); // Espaçamento entre os campos

        JLabel label3 = new JLabel("E-mail:");
        panel.add(label3);
        JTextField text3 = new JTextField(20);
        panel.add(text3);

        panel.add(Box.createVerticalStrut(10)); // Espaçamento entre os campos

        // Tela - Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout()); // FlowLayout para deixar buttons lado a lado

        JButton button1 = new JButton("Cadastrar");
        buttonPanel.add(button1);

        JButton button2 = new JButton("Listar Usuários");
        buttonPanel.add(button2);

        // Ação do button1 - Cadastrar
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = text1.getText();
                int idade = Integer.parseInt(text2.getText());
                String email = text3.getText();
                try {
                    FileWriter arquivo = new FileWriter("usuarios.txt", true);
                    PrintWriter escreve = new PrintWriter(arquivo);
                    escreve.println(nome + "; " + idade + "; " + email);
                    escreve.close();
                    JOptionPane.showMessageDialog(frame, "Usuário cadastrado com sucesso!");
                    // Limpar os campos
                    text1.setText("");
                    text2.setText("");
                    text3.setText("");
                } catch (IOException ex) {
                    System.out.println("Erro ao escrever arquivo!");
                    ex.printStackTrace();
                }

            }
        });

        // Ação do button2 - Lista Usuários
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileReader arquivo = new FileReader("usuarios.txt");
                    Scanner sc = new Scanner(arquivo);
                    StringBuilder linhas = new StringBuilder(); // Armazena todas as linhas

                    while (sc.hasNextLine()) {
                        linhas.append(sc.nextLine()).append("\n"); // Adicionando cada linha ao conjunto de linhas
                    }

                    JOptionPane.showMessageDialog(frame, "Lista de usuários cadastrados:\n" + linhas);
                    sc.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("Arquivo não encontrado!");
                    ex.printStackTrace();
                }
            }
        });

        // Tela - Parte Final
        panel.add(buttonPanel);
        frame.add(panel);
        frame.setVisible(true);
    }
}
