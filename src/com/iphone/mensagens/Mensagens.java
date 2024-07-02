package com.iphone.mensagens;

/**
 * Interface Mensagens.
 * Define os métodos para funcionalidades de envio e recepção de mensagens de texto.
 */
public interface Mensagens {
    /**
     * Método para enviar uma mensagem de texto.
     * @param numero Número de telefone do destinatário.
     * @param mensagem Texto da mensagem a ser enviada.
     */
    void enviarMensagem(String numero, String mensagem);

    /**
     * Método para receber uma mensagem de texto.
     */
    void receberMensagem();
}
