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
public class FabricanteBuilder {

    private String fabricante;

    public FabricanteBuilder(final String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return this.fabricante;
    }
}
