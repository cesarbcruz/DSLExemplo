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
public class ValorBuilder {

    private float valor;

    public ValorBuilder(final float valor) {
        this.valor = valor;
    }

    public float getFloat() {
        return this.valor;
    }

}
