package org.gustavotbett.arqueiro;

import org.gustavotbett.InterfaceRpg;

public class Arqueiro extends InterfaceRpg {

    public Arqueiro(String nome, Long destreza) {
        this.nome = nome;
        this.destreza = destreza;
    }

    @Override
    public void atacar() {
        System.out.println("Ataca com arco, eficácia: " + destreza);
    }

    @Override
    public void defender() {
        System.out.println("Defende com esquiva, eficácia: " + destreza);
    }
}
