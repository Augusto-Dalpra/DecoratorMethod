package Java;
public class Carne extends ProdutoDecorator {


    public Carne(Produto produto) {
        super(produto);
    }

    public float getPrecoAdicional() { return 10.0f;}


    public String getNomeAdicionais() {
        return "Carne";
    }
}
