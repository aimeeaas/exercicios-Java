import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaodoSistema {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        System.out.println("A resolução do sistema é " + d.width + "X" + d.height);
    }
}
