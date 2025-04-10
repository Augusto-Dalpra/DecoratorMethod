package Java;

public abstract class ProdutoDecorator implements Produto {

    private Produto produto;
    public String adicionais;

    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public abstract float getPrecoAdicional();

    public float getPreco() {
        return this.produto.getPreco() + this.getPrecoAdicional();
    }

    public abstract String getNomeAdicionais();

    public String getAdicionais() {
        return this.produto.getAdicionais() + "/" + this.getNomeAdicionais();
    }

    public void setAdicionais(String adicionais) {
        this.adicionais = adicionais;
    }
}


