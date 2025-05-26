import Interfaces.IAparelhoTelefonico;
import Interfaces.INavegadorInternet;
import Interfaces.IReprodutorMusical;

import java.util.Scanner;

public class IPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
    @Override
    public void ligar(long numeroTelefone) {
        System.out.println("Ligando para: " + numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String urlPagina) {
        System.out.println("Exibindo: " + urlPagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Música " + nomeMusica + " selecionada");
    }
}