public class Biografia extends  Livro{

    private String pessoa;

    public Biografia(String titulo, String pessoa) {
        super(titulo);
        this.pessoa = pessoa;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Pessoa: " + pessoa);
        System.out.println("Gênero: Biografia");
    }
}
