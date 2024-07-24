import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.TocadorMusica;

public class IPhone implements AparelhoTelefonico, TocadorMusica, NavegadorInternet {

    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();

        iphone.adicionarNovaAba();
        iphone.exibirPagina("Google");
        iphone.atualizarPagina();

        iphone.selecionarMusica("Minha música favorita");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("96 98111-0001");
        iphone.atender();
        iphone.iniciarCorreioVoz();

    }

    public IPhone() {};

    public void exibirPagina(String url) {
        System.out.println("Exibindo Página: \"" + url + "\"");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public void tocar() {
        System.out.println("Tocando...");
    }

    public void pausar() {
        System.out.println("Pausando...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: \"" + musica + "\"");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: \"" + numero + "\"");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
