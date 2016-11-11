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
public class TagsBuilder {

    private Collection<String> tags;

    public TagsBuilder(final Collection<String> tags) {
        this.tags = tags;
    }

    public Collection<String> getCollection() {
        return tags;
    }

}
