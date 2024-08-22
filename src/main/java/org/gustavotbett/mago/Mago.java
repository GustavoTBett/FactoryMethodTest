package org.gustavotbett.mago;

import org.gustavotbett.InterfaceRpg;

public class Mago extends InterfaceRpg {

    public Mago(String nome, Long inte) {
        this.nome = "mago";
        this.inteligencia = inte;
    }

    @Override
    public void atacar() {
        System.out.println("Ataca com magia, eficácia: " + inteligencia);
    }

    @Override
    public void defender() {
        System.out.println("Defende com magia, eficácia: " + inteligencia);
    }
}
