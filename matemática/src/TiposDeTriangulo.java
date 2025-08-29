import javax.swing.*;
import java.awt.*;

public class TiposDeTriangulo extends JFrame {

    private JSlider sliderA;
    private JSlider sliderB;
    private JSlider sliderC;
    private JLabel resultadoLabel;
    private JLabel tipoLabel;

    public TiposDeTriangulo() {
        setTitle("Tipos de Triângulo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal com BorderLayout
        setLayout(new BorderLayout());

        // Painel para os sliders e suas labels
        JPanel slidersPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        slidersPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Configurando sliders com labels
        slidersPanel.add(criarSliderPanel("Segmento A", sliderA = new JSlider(1, 10, 5)));
        slidersPanel.add(criarSliderPanel("Segmento B", sliderB = new JSlider(1, 10, 5)));
        slidersPanel.add(criarSliderPanel("Segmento C", sliderC = new JSlider(1, 10, 5)));

        // Labels para exibir o resultado
        resultadoLabel = new JLabel("", SwingConstants.CENTER);
        resultadoLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        resultadoLabel.setForeground(Color.BLUE);

        tipoLabel = new JLabel("", SwingConstants.CENTER);
        tipoLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        tipoLabel.setForeground(Color.RED);

        // Painel para os resultados
        JPanel resultPanel = new JPanel(new GridLayout(2, 1));
        resultPanel.add(resultadoLabel);
        resultPanel.add(tipoLabel);

        // Botão verificar
        JButton verificarButton = new JButton("Verificar");
        verificarButton.setPreferredSize(new Dimension(100, 40));
        verificarButton.addActionListener(e -> {
            // Aqui você pode implementar a verificação dos triângulos
            int a = sliderA.getValue();
            int b = sliderB.getValue();
            int c = sliderC.getValue();

            if (a < b + c && b < a + c && c < a + b) {
                resultadoLabel.setText("Formam um Triângulo");
                if (a == b && b == c) {
                    tipoLabel.setText("Equilátero");
                } else if (a != b && b != c && a != c) {
                    tipoLabel.setText("Escaleno");
                } else {
                    tipoLabel.setText("Isósceles");
                }
            } else {
                resultadoLabel.setText("Não formam um triângulo");
                tipoLabel.setText("-------");
            }

            resultPanel.setVisible(true);
        });

        // Painel para o botão
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(verificarButton);

        // Adicionando os componentes ao frame
        add(slidersPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.SOUTH);
    }

    private JPanel criarSliderPanel(String labelText, JSlider slider) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel(labelText);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        panel.add(label, BorderLayout.WEST);
        panel.add(slider, BorderLayout.CENTER);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TiposDeTriangulo frame = new TiposDeTriangulo();
            frame.setVisible(true);
        });
    }
}
