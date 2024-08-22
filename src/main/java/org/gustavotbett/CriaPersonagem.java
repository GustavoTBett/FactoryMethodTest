package org.gustavotbett;

import org.gustavotbett.arqueiro.Arqueiro;
import org.gustavotbett.guerreiro.Guerreiro;
import org.gustavotbett.mago.Mago;

public class CriaPersonagem extends Mestre {
    @Override
    protected InterfaceRpg criaPersonagem(String nome, Long valor) {
        InterfaceRpg interfaceRpg;

        switch (nome) {
            case "Arqueiro":
                interfaceRpg = new Arqueiro("arqueiro", valor);
                break;
            case "Guerreiro":
                interfaceRpg = new Guerreiro("guerreiro", valor);
                break;
            case "Mago":
                interfaceRpg = new Mago("mago", valor);
                break;
            default:
                interfaceRpg = null;
                break;

        }

        interfaceRpg.atacar();
        interfaceRpg.defender();
        return interfaceRpg;
    }
}
