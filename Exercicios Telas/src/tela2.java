import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.function.BiFunction;

public class tela2 {
    public static void main(String[] args) {
        // Janela JFrame
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(500, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Rótulo JLabel
        JLabel label = new JLabel("Insira dois números:");
        frame.add(label);

        // JTextField 2
        JTextField textField = new JTextField(5);
        frame.add(textField);
        JTextField textField1 = new JTextField(5);
        frame.add(textField1);

        // JLabel e JButtons
        JPanel operationsPanel = new JPanel();
        operationsPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Centralizado
        JLabel label1 = new JLabel("Escolha a operação:");
        operationsPanel.add(label1);

        JButton button = new JButton("+");
        operationsPanel.add(button);

        JButton button1 = new JButton("-");
        operationsPanel.add(button1);

        JButton button2 = new JButton("*");
        operationsPanel.add(button2);

        JButton button3 = new JButton("/");
        operationsPanel.add(button3);

        frame.add(operationsPanel); // Adiciona o painel ao JFrame

        // Criando a instância da classe para chamar o método
        tela2 calculadora = new tela2();

        // Adicionando ActionListeners aos botões
        button.addActionListener(calculadora.createOperationListener(frame, textField, textField1, (a, b) -> a + b));
        button1.addActionListener(calculadora.createOperationListener(frame, textField, textField1, (a, b) -> a - b));
        button2.addActionListener(calculadora.createOperationListener(frame, textField, textField1, (a, b) -> a * b));
        button3.addActionListener(calculadora.createOperationListener(frame, textField, textField1, (a, b) -> {
            if (b == 0)
                throw new ArithmeticException("Divisão por zero");
            return a / b;
        }));

        // Exibindo a janela
        frame.setVisible(true);
    }

    // Método para criar ActionListener
    ActionListener createOperationListener(JFrame frame, JTextField textField, JTextField textField1,
            BiFunction<Integer, Integer, Integer> operation) {
        return e -> {
            try {
                int n = Integer.parseInt(textField.getText());
                int n1 = Integer.parseInt(textField1.getText());
                int result = operation.apply(n, n1);
                JOptionPane.showMessageDialog(frame, "Resultado: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(frame, "Erro na operação: " + ex.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        };
    }
}
