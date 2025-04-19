package interfaces.equipamentos.copiadora;

//Para que EquipamentoMultifuncional consiga chamar mais de uma classe, eu necessito que essas classes sejam interfaces: class -> interface
public interface Copiadora {
    public void copiar(); //A função torna-se somente um molde de assinatura: interfaces não possuem NADA aplicável e tudo deve ser implementado
}
