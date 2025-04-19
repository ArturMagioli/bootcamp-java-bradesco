package interfaces.estabelecimento;

import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        //EquipamentoMultifuncional consegue 'ser polimórfico' para mais de uma estrutura abstrata:
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        copiadora.copiar();
        digitalizadora.digitalizar();
        impressora.imprimir();
    }
}
