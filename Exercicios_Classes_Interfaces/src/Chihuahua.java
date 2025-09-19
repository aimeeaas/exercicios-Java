// m exemplo de uma classe (não abstracta, i.e., implementa ladrar()) derivada
// de CãoDeGuarda é a que se segue. Esta classe apenas necessita de implementar
// o método ladrar() para ficar completa.
public class Chihuahua extends CaoPastor {
    public void ladrar() {
        System.out.println("guau, guau");
    }

    @Override
    public boolean háIntrsusos() {

        throw new UnsupportedOperationException("Unimplemented method 'háIntrsusos'");
    }

}