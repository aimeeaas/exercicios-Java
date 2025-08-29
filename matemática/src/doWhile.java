import javax.swing.JOptionPane;

public class doWhile {
    public static void main(String[] args) {
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>", "Boas Vindas!",
                    JOptionPane.INFORMATION_MESSAGE));
            s += n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr>" + "<br>Somatório = " + s + "</html>");
    }
}
