// Esta é uma implementação de Robot que reutiliza XP.
public class XP2018 extends XP implements Robot {
    // interface Robot
    public void avisarIntrusos() {
        System.out.println("Isto é o último aviso!");
    }

    public void destruirIntrusos() {
        System.out.println("Eu avisei...");
    }

    // interface Vigilante
    public void soarAlarme() {
        System.out.println("AAAARGH");
    }

    @Override
    public boolean háIntrsusos() {

        throw new UnsupportedOperationException("Unimplemented method 'háIntrsusos'");
    }
}
