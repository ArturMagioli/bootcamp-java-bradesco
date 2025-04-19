package interfaces.equipamentos.copiadora;

//Agora que Copiadora é uma interface, eu preciso que a classe Xerox implemente a copiadora: extends -> implements
public class Xerox implements Copiadora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO");
    }
}
