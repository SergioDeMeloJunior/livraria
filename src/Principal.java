public class Principal {

    public static void main(String[] args) {
        Livro romance = new Romance("Orgulho e Preconceito", "Jane Austen");
        Livro biografia = new Biografia("Steve Jobs", "Walter Isaacson");
        Livro ciencia = new Ciencia("Uma Breve História do Tempo", "Cosmologia");

        exibirDetalhesLivro(romance);
        exibirDetalhesLivro(biografia);
        exibirDetalhesLivro(ciencia);
    }

    public static void exibirDetalhesLivro(Livro livro) {
        livro.exibirDetalhes();
        System.out.println();
    }
}
