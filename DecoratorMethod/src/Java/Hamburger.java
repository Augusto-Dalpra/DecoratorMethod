package Java;


public class Hamburger implements Produto {

    public float Precounitario;

    public Hamburger() {
    }

    public Hamburger(float PrecoUnitario) {
        this.Precounitario = PrecoUnitario;
    }

    public float getPreco() {
        return Precounitario;
    }

    public String getAdicionais() {
        return "Adicionais";
    }

}
