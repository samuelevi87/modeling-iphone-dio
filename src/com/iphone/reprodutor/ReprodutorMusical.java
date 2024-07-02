package com.iphone.reprodutor;

/**
 * Interface ReprodutorMusical.
 * Define os métodos para funcionalidades de reprodução musical.
 */
public interface ReprodutorMusical {
    /**
     * Método para tocar música.
     */
    void tocar();

    /**
     * Método para pausar a música.
     */
    void pausar();

    /**
     * Método para selecionar uma música.
     * @param musica Nome da música a ser selecionada.
     */
    void selecionarMusica(String musica);
}
