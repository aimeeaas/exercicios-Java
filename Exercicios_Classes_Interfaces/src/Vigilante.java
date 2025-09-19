// Por seu turno, a interface Vigilante define as assinaturas dos métodos a que uma entidade "vigilante" deve saber responder.
public interface Vigilante {
    boolean háIntrsusos(); // retorna true se tiverem sido detectados intrusos

    void soarAlarme(); // executa a acção de activar um alarme, e.g. um sinal sonoro
}