/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globalcode.arquiteto.dsl.interna.builder;

import java.util.Collection;

/**
 *
 * @author cesar
 */
public class ProdutoBuilder {

    private NomeBuilder nome;
    private DescricaoBuilder descricao;
    private FabricanteBuilder fabricante;
    private ValorBuilder valor;
    private TagsBuilder tags;

    public ProdutoBuilder(final NomeBuilder nome, final DescricaoBuilder descricao, final FabricanteBuilder fabricante, final ValorBuilder valor, final TagsBuilder tags) {
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.valor = valor;
        this.tags = tags;
    }

    public String getNome() {
        return nome.toString();
    }

    public String getDescricao() {
        return descricao.toString();
    }

    public String getFabricante() {
        return fabricante.toString();
    }

    public float getValor() {
        return valor.getFloat();
    }

    public Collection<String> getTags() {
        return tags.getCollection();
    }

}
