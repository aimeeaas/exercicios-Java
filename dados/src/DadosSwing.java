
/* importanto pacotes e classes necessárias */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DadosSwing extends JFrame implements ActionListener {
    JTextField num1Field, num2Field, soma;
    JButton somaButton;
    JLabel resultadoLabel;

    public DadosSwing() {

        // Criar os componentes
        num1Field = new JTextField("");
        soma = new JTextField("+");
        soma.setEditable(false); // Torna o campo de soma não editável
        num2Field = new JTextField("");
        somaButton = new JButton("=");
        resultadoLabel = new JLabel("");

        // Criar um painel com layout GridLayout
        JPanel painel = new JPanel(new GridLayout(1, 5));
        painel.add(num1Field);
        painel.add(soma);
        painel.add(num2Field);
        painel.add(somaButton);
        painel.add(resultadoLabel);

        // Adicionar o painel à janela
        add(painel);

        // Configurar a janela
        setTitle("Minha Janela");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerra a aplicação.
        setVisible(true);

        // Associar o método ao evento de clique do botão.
        somaButton.addActionListener(this);

    }

    // Método com o cálculo
    private void calcular() {
        int num1 = Integer.parseInt(num1Field.getText());
        int num2 = Integer.parseInt(num2Field.getText());
        int resultado = num1 + num2;
        resultadoLabel.setText(Integer.toString(resultado));
    }

    // Chamar o Método quando o usuário clicar no botão
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == somaButton) {
            calcular();
        }
    }

    // Classe principal
    public static void main(String[] args) {
        DadosSwing calculadora = new DadosSwing();
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.pack();
        calculadora.setLocationRelativeTo(null);
        calculadora.setVisible(true);
    }

}