package org.gustavotbett;

public abstract class Mestre {
    InterfaceRpg geraPersonagem(String nome, Long valor) {
        return this.criaPersonagem(nome, valor);
    }

    protected abstract InterfaceRpg criaPersonagem(String nome, Long valor);
}
