package Test;

import Java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void deveRetornarPrecoProduto() {
        Produto produto = new Hamburger(500);

        assertEquals(500, produto.getPreco());
    }
    @Test
    void deveRetornarPrecoProdutoCarne() {
        Produto produto = new Carne(new Hamburger(500));

        assertEquals(510, produto.getPreco());
    }
    @Test
    void deveRetornarPrecoProdutoOvo() {
        Produto produto = new Ovo(new Hamburger(500));

        assertEquals(550, produto.getPreco());
    }
    @Test
    void deveRetornarPrecoProdutoMato() {
        Produto produto = new Mato(new Hamburger(500));

        assertEquals(501, produto.getPreco());
    }
    @Test
    void deveRetornarPrecoProdutoCarneComOvo() {
        Produto produto = new Ovo(new Carne(new Hamburger(500)));

        assertEquals(560, produto.getPreco());
    }
    @Test
    void deveRetornarPrecoProdutoCarneComMato() {
        Produto produto = new Mato(new Carne(new Hamburger(500)));

        assertEquals(511, produto.getPreco());
    }
    @Test
    void deveRetornarPrecoProdutoCarneOvoMato() {
        Produto produto = new Mato(new Ovo(new Carne(new Hamburger(500))));

        assertEquals(561, produto.getPreco());
    }


}