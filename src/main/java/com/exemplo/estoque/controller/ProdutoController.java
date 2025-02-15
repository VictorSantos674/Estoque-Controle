package com.exemplo.estoque.controller;

import com.exemplo.estoque.model.Produto;
import com.exemplo.estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoService.listarTodos());
        return "produto/listar";
    }

    @GetMapping("/cadastrar")
    public String cadastrarProdutoForm(Model model) {
        model.addAttribute("produto", new Produto());
        return "produto/cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrarProduto(@ModelAttribute Produto produto) {
        produtoService.salvar(produto);
        return "redirect:/produtos";
    }

    @GetMapping("/editar/{id}")
    public String editarProdutoForm(@PathVariable Long id, Model model) {
        model.addAttribute("produto", produtoService.buscarPorId(id));
        return "produto/editar";
    }

    @PostMapping("/editar/{id}")
    public String editarProduto(@PathVariable Long id, @ModelAttribute Produto produto) {
        produto.setId(id);
        produtoService.salvar(produto);
        return "redirect:/produtos";
    }

    @GetMapping("/deletar/{id}")
    public String deletarProduto(@PathVariable Long id) {
        produtoService.deletar(id);
        return "redirect:/produtos";
    }
}