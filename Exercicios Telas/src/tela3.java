
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tela3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulário de Cadastro");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(13, 9, 3, 3)); // 10px de espaçamento horizontal e vertical

        JLabel label = new JLabel("Nome Completo:");
        frame.add(label);

        JTextField textField = new JTextField(30);
        frame.add(textField);

        JLabel label1 = new JLabel("Email:");
        frame.add(label1);

        JTextField textField1 = new JTextField(30);
        frame.add(textField1);

        // Criando um ComboBox com algumas opções
        String[] options = { "Masculino", "Feminino", "Outro" };
        JComboBox<String> comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        // Criando os checkboxes
        JCheckBox option1 = new JCheckBox("Esporte");
        JCheckBox option2 = new JCheckBox("Música");
        JCheckBox option3 = new JCheckBox("Tecnologia");
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);

        // JButtons
        JButton button = new JButton("Enviar");
        frame.add(button);

        // Adicionando ação ao botão
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = textField.getText();
                String email = textField1.getText();
                String genero = (String) comboBox.getSelectedItem();
                String preferencias = "";
                if (option1.isSelected())
                    preferencias += "Esporte\n";
                if (option2.isSelected())
                    preferencias += "Música\n";
                if (option3.isSelected())
                    preferencias += "Tecnologia\n";
                if (preferencias.isEmpty())
                    preferencias = "Nenhuma preferência selecionada.";

                String resumo = "Resumo Cadastro:\n";
                resumo += "Nome Completo: " + nome + "\n";
                resumo += "Email: " + email + "\n";
                resumo += "Gênero: " + genero + "\n";
                resumo += "Preferências:\n" + preferencias;

                JTextArea textArea = new JTextArea(resumo);
                // Define se o texto na JTextArea pode ser editado pelo usuário.
                textArea.setEditable(false);
                // Habilita a quebra de linha automática quando o texto ultrapassa a largura
                // visível do componente.
                textArea.setLineWrap(true);
                // Faz a quebra de linha respeitar palavras inteiras. Ou seja, evita que
                // palavras sejam cortadas no meio durante a quebra de linha.
                textArea.setWrapStyleWord(true);
                // Insere o JTextArea dentro de um contêiner com barras de rolagem, para que o
                // texto possa ser lido mesmo se for maior do que o espaço disponível.
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 200));

                /*
                 * frame: O componente pai que serve como referência para posicionar a janela.
                 * scrollPane: O conteúdo da janela de diálogo, que aqui inclui a JTextArea com
                 * o resumo.
                 * "Resumo do Cadastro": O título da janela.
                 * JOptionPane.INFORMATION_MESSAGE: O tipo de ícone exibido na janela (neste
                 * caso, um ícone de informação).
                 */
                JOptionPane.showMessageDialog(frame, scrollPane, "Resumo do Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Exibir janela
        frame.setVisible(true);

    }
}
