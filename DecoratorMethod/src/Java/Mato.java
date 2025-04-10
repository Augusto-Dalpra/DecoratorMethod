package Java;

public class Mato extends ProdutoDecorator {


    public Mato(Produto produto) {
        super(produto);
    }

    public float getPrecoAdicional() {
        return 1.0f;
    }

    public String getNomeAdicionais() {
        return "Mato";
    }
}
