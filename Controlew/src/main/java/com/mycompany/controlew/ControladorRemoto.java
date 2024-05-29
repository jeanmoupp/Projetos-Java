package com.mycompany.controlew;
public class ControladorRemoto implements Controlador {
//atributos
    private int volume;
    private boolean ligado;
    private boolean passandoPrograma;
    
    
//metodos especiais (construtor)
    public ControladorRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.passandoPrograma =  false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getPassandoPrograma() {
        return passandoPrograma;
    }

    public void setPassandoPrograma(boolean passandoPrograma) {
        this.passandoPrograma = passandoPrograma;
    }

    
    //metodos abstratos
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
    }

    @Override
    public void menosVolume() {
    }

    @Override
    public void desligarMudo() {
    }

    @Override
    public void play() {
    }
   
    
    }

