package org.gustavotbett;

public abstract class InterfaceRpg {
    protected String nome;
    protected Long forca;
    protected Long destreza;
    protected Long inteligencia;

    public abstract void atacar();

    public abstract void defender();
}
