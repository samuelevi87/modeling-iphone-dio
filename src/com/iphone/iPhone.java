package com.iphone;

import com.iphone.reprodutor.ReprodutorMusical;
import com.iphone.telefone.AparelhoTelefonico;
import com.iphone.navegador.NavegadorInternet;
import com.iphone.mensagens.Mensagens;
import com.iphone.camera.Camera;
import com.iphone.organizador.OrganizadorPessoal;

/**
 * Classe iPhone.
 * Implementa as interfaces ReprodutorMusical, AparelhoTelefonico, NavegadorInternet, Mensagens, Camera e OrganizadorPessoal.
 */
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet, Mensagens, Camera, OrganizadorPessoal {

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Implementação dos métodos de Mensagens
    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida.");
    }

    // Implementação dos métodos de Camera
    @Override
    public void tirarFoto() {
        System.out.println("Foto tirada.");
    }

    @Override
    public void gravarVideo() {
        System.out.println("Vídeo gravado.");
    }

    // Implementação dos métodos de OrganizadorPessoal
    @Override
    public void adicionarContato(String nome, String numero) {
        System.out.println("Contato adicionado: " + nome + " - " + numero);
    }

    @Override
    public void verContato(String nome) {
        System.out.println("Visualizando contato: " + nome);
    }

    @Override
    public void adicionarEvento(String evento, String data) {
        System.out.println("Evento adicionado: " + evento + " na data: " + data);
    }

    /**
     * Método principal para testar as funcionalidades do iPhone.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando ReprodutorMusical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        // Testando AparelhoTelefonico
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();

        // Testando Mensagens
        meuIPhone.enviarMensagem("123456789", "Olá, como vai?");
        meuIPhone.receberMensagem();

        // Testando Camera
        meuIPhone.tirarFoto();
        meuIPhone.gravarVideo();

        // Testando OrganizadorPessoal
        meuIPhone.adicionarContato("João", "987654321");
        meuIPhone.verContato("João");
        meuIPhone.adicionarEvento("Reunião", "10/10/2024");
    }
}
