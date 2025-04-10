package Java;

public class Ovo extends ProdutoDecorator {


    public Ovo(Produto produto) {
        super(produto);
    }

    public float getPrecoAdicional() {
        return 50.0f;
    }

    public String getNomeAdicionais() {
        return "Ovo";
    }
}
