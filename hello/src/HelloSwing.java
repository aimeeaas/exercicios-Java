
/* importanto pacotes e classes necessárias */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* implements ActionListener -> A classe implementa a interface ActionListener, o que significa que ela precisa implementar o método 'actionPerformed'. */
public class HelloSwing extends JFrame implements ActionListener {
    private JButton botao;

    public HelloSwing() {
        /* configuração da janela */
        setTitle("Minha Primeira Janela");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         * configuração do botão
         * botao.addActionListener(this); -> Essa linha adiciona um ouvinte ao botão.
         * O 'this' se refere à própria classe, que agora é um ouvinte.
         */
        botao = new JButton("Clique aqui");
        botao.addActionListener(this);
        add(botao);

        setVisible(true);
    }

    @Override
    /*
     * actionPerformed(ActionEvent e) -> Esse método é chamado quando o botão é
     * clicado.
     * O parâmetro 'e' contém informações sobre o evento, como a fonte do evento (o
     * botão, nesse caso).
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao) {
            /* JOptionPane.showMessageDialog -> Essa linha exibe uma caixa de diálogo. */
            JOptionPane.showMessageDialog(null, "Hello, World!");
        }
    }

    public static void main(String[] args) {
        new HelloSwing();
    }
}