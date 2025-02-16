package com.exemplo.estoque.service;

import com.exemplo.estoque.model.Produto;
import com.exemplo.estoque.repository.ProdutoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ProdutoServiceTest {

    @Mock
    private ProdutoRepository produtoRepository;

    @InjectMocks
    private ProdutoService produtoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listarTodos() {
        when(produtoRepository.findAll()).thenReturn(Collections.emptyList());

        assertEquals(0, produtoService.listarTodos().size());
        verify(produtoRepository, times(1)).findAll();
    }

    @Test
    void salvar() {
        Produto produto = new Produto();
        produto.setNome("Produto Teste");
        produto.setQuantidade(10);
        produto.setPreco(99.99);

        when(produtoRepository.save(produto)).thenReturn(produto);

        Produto salvo = produtoService.salvar(produto);
        assertEquals("Produto Teste", salvo.getNome());
        verify(produtoRepository, times(1)).save(produto);
    }

    @Test
    void buscarPorId() {
        Produto produto = new Produto();
        produto.setId(1L);
        produto.setNome("Produto Teste");

        when(produtoRepository.findById(1L)).thenReturn(Optional.of(produto));

        Produto encontrado = produtoService.buscarPorId(1L);
        assertEquals("Produto Teste", encontrado.getNome());
        verify(produtoRepository, times(1)).findById(1L);
    }

    @Test
    void deletar() {
        doNothing().when(produtoRepository).deleteById(1L);

        produtoService.deletar(1L);
        verify(produtoRepository, times(1)).deleteById(1L);
    }
}