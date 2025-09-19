public class Exercicio1 {
    public static void main(String[] args) {
        Cao c = new Chihuahua();
        Vigilante v = new Chihuahua();
        CaoPastor p = new Chihuahua();
        Robot r = new XP2018();
        XP x = new XP();
        XP y = new XP2018();

        c.ladrar();
        v.soarAlarme();
        ((Chihuahua) v).ladrar();
        p.soarAlarme();
        r.avisarIntrusos();
        r.soarAlarme();
        x.reboot();
        y.crash();
        ((XP2018) y).soarAlarme();
    }
}

/*
 * =============================
 * EXTENDS vs IMPLEMENTS
 * =============================
 * 
 * EXTENDS
 * - Usado para herança de CLASSE → "é um tipo de"
 * - Classe pode extends só UMA classe (Java não permite herança múltipla)
 * - Interface pode extends várias interfaces
 * - Reutiliza atributos e métodos já implementados
 * 
 * Exemplo:
 * class Cachorro extends Animal { ... }
 * 
 * IMPLEMENTS
 * - Usado quando uma CLASSE implementa uma INTERFACE
 * - Classe pode implements várias interfaces
 * - Obrigatório sobrescrever (implementar) todos os métodos da interface
 * - Representa um "contrato" que a classe deve cumprir
 * 
 * Exemplo:
 * class CaoDeGuarda implements Vigilante { ... }
 * 
 * =============================
 * Resumo:
 * - extends → herda comportamento pronto
 * - implements → cumpre um contrato (obriga implementar métodos)
 * =============================
 */

/*
 * =============================
 * CLASSE ABSTRATA
 * =============================
 * 
 * - Definida com "abstract"
 * - Não pode ser instanciada diretamente
 * - Pode ter métodos:
 * ✔ concretos (com corpo)
 * ✔ abstratos (sem corpo → obrigam subclasses a implementar)
 * - Usada como modelo/base para outras classes
 * - Herança feita com "extends"
 *
 * =============================
 * 
 * Diferença para Interface
 * Interface → só contratos (métodos sem corpo, até Java 7; desde Java 8 pode
 * ter default e static).
 * Classe Abstrata → pode misturar contratos e implementações parciais.
 * 
 * Regra de ouro:
 * Use interface quando quer apenas "contratos".
 * Use classe abstrata quando quer contratos + comportamento comum para várias
 * classes.
 */
