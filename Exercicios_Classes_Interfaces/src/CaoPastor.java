// Esta classe implementa parte da interface de um cão de guarda e deixa para as
// suas subclasses a especificidade associada ao método ladrar(). Embora
// abstracta, esta classe é uma implementação (ainda que parcial) da interface.
public abstract class CaoPastor implements CaoDeGuarda {
    public final static int N_PATAS = 4;

    // métodos privados
    private void fecharBoca() {
    };

    private boolean háPredadores() {
        return true;
    }

    // interface CãoDeGuarda
    public void morder() {
        fecharBoca();
    }

    // inteface Cão
    public int nPatas() {
        return N_PATAS;
    }

    public abstract void ladrar();

    // interface Vigilante
    public void soarAlarme() {
        ladrar();
    }

    public boolean háIntrusos() {
        return háPredadores();
    }

    public static int getnPatas() {
        return N_PATAS;
    }
}
