public class Romance extends Livro {

    private String autor;

    public Romance(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: Romance");
    }
}
