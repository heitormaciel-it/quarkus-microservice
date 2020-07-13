package br.com.shopi.product.populate;

public interface Populator <I, O> {
    O populate(I input);
}