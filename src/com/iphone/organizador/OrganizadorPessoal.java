package com.iphone.organizador;

/**
 * Interface OrganizadorPessoal.
 * Define os métodos para funcionalidades de organizador pessoal.
 */
public interface OrganizadorPessoal {
    /**
     * Método para adicionar um contato na agenda.
     * @param nome Nome do contato.
     * @param numero Número de telefone do contato.
     */
    void adicionarContato(String nome, String numero);

    /**
     * Método para visualizar um contato na agenda.
     * @param nome Nome do contato a ser visualizado.
     */
    void verContato(String nome);

    /**
     * Método para adicionar um evento no calendário.
     * @param evento Descrição do evento.
     * @param data Data do evento.
     */
    void adicionarEvento(String evento, String data);
}
