public class Ciencia extends Livro{

    private String area;

    public Ciencia(String titulo, String area) {
        super(titulo);
        this.area = area;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Área: " + area);
        System.out.println("Gênero: Ciência");
    }
}
