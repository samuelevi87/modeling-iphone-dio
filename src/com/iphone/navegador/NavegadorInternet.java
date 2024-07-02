package com.iphone.navegador;

/**
 * Interface NavegadorInternet.
 * Define os métodos para funcionalidades de navegação na internet.
 */
public interface NavegadorInternet {
    /**
     * Método para exibir uma página da web.
     * @param url URL da página a ser exibida.
     */
    void exibirPagina(String url);

    /**
     * Método para adicionar uma nova aba no navegador.
     */
    void adicionarNovaAba();

    /**
     * Método para atualizar a página atual.
     */
    void atualizarPagina();
}
