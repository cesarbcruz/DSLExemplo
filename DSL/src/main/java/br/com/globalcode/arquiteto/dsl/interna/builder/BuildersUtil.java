/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globalcode.arquiteto.dsl.interna.builder;

import br.com.globalcode.arquiteto.dsl.interna.domain.Categoria;
import br.com.globalcode.arquiteto.dsl.interna.domain.Produto;
import br.com.globalcode.arquiteto.dsl.interna.domain.impl.CategoriaImpl;
import br.com.globalcode.arquiteto.dsl.interna.domain.impl.ProdutoImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author cesar
 */
public class BuildersUtil {

    private BuildersUtil() {
    }

    public static NomeBuilder nome(String nome) {
        return new NomeBuilder(nome);
    }

    public static DescricaoBuilder descricao(String descricao) {
        return new DescricaoBuilder(descricao);
    }

    public static FabricanteBuilder fabricante(String fabricante) {
        return new FabricanteBuilder(fabricante);
    }

    public static ValorBuilder valor(float valor) {
        return new ValorBuilder(valor);
    }

    public static TagsBuilder tags(String... tags) {
        return new TagsBuilder(Arrays.asList(tags));
    }

    public static ProdutoBuilder produto(NomeBuilder nome, DescricaoBuilder descricao, FabricanteBuilder fabricante, ValorBuilder valor, TagsBuilder tags) {
        return new ProdutoBuilder(nome, descricao, fabricante, valor, tags);
    }

    public static Categoria categoria(NomeBuilder nome, DescricaoBuilder descricao, ProdutoBuilder... produtos) {
        Categoria categoria = new CategoriaImpl(nome.toString(), descricao.toString());
        
        for (ProdutoBuilder produto : produtos) {
            categoria.getProdutos().add(produto.getProduto(categoria));
        }
              
        return categoria;
    }

    public static Collection<Categoria> categorias(Categoria... categorias) {
        return Arrays.asList(categorias);
    }
}
