
    public class Iphone {
    private String numeroTelefone;

    public Iphone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void fazerLigacao(String numeroDestino) {
        System.out.println("Ligando para " + numeroDestino + " a partir do número " + numeroTelefone);
        // Lógica para realizar a ligação
    }

    public void reproduzirMusica(String musica) {
        System.out.println("Reproduzindo a música: " + musica);
        // Lógica para reproduzir a música
    }

    public void navegarInternet(String url) {
        System.out.println("Navegando na internet para: " + url);
        // Lógica para abrir um navegador de internet e carregar a URL
    }

    public static void main(String[] args) {
        Iphone meuTelefone = new Iphone("123-456-7890");

        meuTelefone.fazerLigacao("987-654-3210");
        meuTelefone.reproduzirMusica("Música favorita");
        meuTelefone.navegarInternet("https://www.example.com");
    }
}

