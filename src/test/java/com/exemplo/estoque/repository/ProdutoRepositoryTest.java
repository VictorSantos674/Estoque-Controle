package com.exemplo.estoque.repository;

import com.exemplo.estoque.model.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    void salvarProduto() {
        Produto produto = new Produto();
        produto.setNome("Produto Teste");
        produto.setQuantidade(10);
        produto.setPreco(99.99);

        Produto salvo = produtoRepository.save(produto);
        assertNotNull(salvo.getId());
        assertEquals("Produto Teste", salvo.getNome());
    }

    @Test
    void buscarProdutoPorId() {
        Produto produto = new Produto();
        produto.setNome("Produto Teste");
        produto.setQuantidade(10);
        produto.setPreco(99.99);

        Produto salvo = produtoRepository.save(produto);
        Optional<Produto> encontrado = produtoRepository.findById(salvo.getId());

        assertTrue(encontrado.isPresent());
        assertEquals("Produto Teste", encontrado.get().getNome());
    }

    @Test
    void deletarProduto() {
        Produto produto = new Produto();
        produto.setNome("Produto Teste");
        produto.setQuantidade(10);
        produto.setPreco(99.99);

        Produto salvo = produtoRepository.save(produto);
        produtoRepository.deleteById(salvo.getId());

        Optional<Produto> deletado = produtoRepository.findById(salvo.getId());
        assertFalse(deletado.isPresent());
    }
}