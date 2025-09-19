// A interface Robot é uma especialização de Vigilante: é um vigilante robotizado que sabe avisar e destruir intrusos.
public interface Robot extends Vigilante {
    void avisarIntrusos(); // deve ser emitido um aviso (possivelmente, porque depois se segue a invocação
                           // do método destruirIntrusos() -- mas não há qualquer garantia...)

    void destruirIntrusos(); // a ação a executar corresponde à destruição dos intrusos
}