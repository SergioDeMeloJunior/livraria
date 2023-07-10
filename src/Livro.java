public  class Livro {

    protected String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
    }
}
