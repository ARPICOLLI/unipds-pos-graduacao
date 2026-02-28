package core;

public class Produto {

// removendo os setters eu torno minha classe imutavel

    private int codigo;
    private float preco;
    private String descricao;
    private int estoque;

    public Produto(int codigo, float preco, String descricao, int estoque) {

        super();
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo <=0){
            // rotina de notificação de erro.
        }
        this.codigo = codigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
