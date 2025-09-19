// Supõe-se que a classe XP existe independentemente das outras descritas até aqui (foi, por exemplo, definida para outro fim). Supõe-se, contudo, que contém funcionalidade útil para uma possível implementação de um robot, i.e., para uma classe que implemente a interface Robot.
public class XP {
    public void reboot() {
        System.out.println("See ya!");
    }

    public void shutdown() {
        System.out.println("Bye!");
    }

    public void crash() {
        System.out.println("Nooo! Argh!!!");
    }

    public boolean háIntrusos() {
        return false;
    } // detector de vírus, Note-se a coincidência do método háIntrusos(): existe na
      // classe XP e na interface Vigilante (da qual Robot herda parte da sua
      // especificação). É necessário garantir que a semântica pretendida é a que o
      // método realmente fornece.
}
