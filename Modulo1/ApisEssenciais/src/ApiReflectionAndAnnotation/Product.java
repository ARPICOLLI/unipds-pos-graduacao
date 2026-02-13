package ApiReflectionAndAnnotation;


public class Product {
    @Visible
    private int id;
    @Visible
    private String nome;
    private double preco;

    public Product(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Produto [id=" + this.id + " nome=" + this.nome + ",preço=" + this.preco + "]";
    }
}