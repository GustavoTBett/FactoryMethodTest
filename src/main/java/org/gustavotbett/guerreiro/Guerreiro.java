package org.gustavotbett.guerreiro;

import org.gustavotbett.InterfaceRpg;

public class Guerreiro extends InterfaceRpg {

    public Guerreiro(String nome, Long forca) {
        this.nome = "guerreiro";
        this.forca = forca;
    }

    @Override
    public void atacar() {
        System.out.println("Ataca com espada, força: " + forca);
    }

    @Override
    public void defender() {
        System.out.println("Defende com escudo, eficácia: " + forca);
    }
}
