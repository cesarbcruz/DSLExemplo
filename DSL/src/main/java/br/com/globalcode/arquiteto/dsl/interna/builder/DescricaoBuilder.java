/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globalcode.arquiteto.dsl.interna.builder;

/**
 *
 * @author cesar
 */
public class DescricaoBuilder {

    private String descricao;

    public DescricaoBuilder(final String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
