package com.iphone.telefone;

/**
 * Interface AparelhoTelefonico.
 * Define os métodos para funcionalidades de telefone.
 */
public interface AparelhoTelefonico {
    /**
     * Método para ligar para um número.
     * @param numero Número de telefone a ser chamado.
     */
    void ligar(String numero);

    /**
     * Método para atender uma chamada.
     */
    void atender();

    /**
     * Método para iniciar o correio de voz.
     */
    void iniciarCorreioVoz();
}
