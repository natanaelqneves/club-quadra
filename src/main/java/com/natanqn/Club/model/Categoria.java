package com.natanqn.Club.model;

public enum Categoria {
    FUTEBOL("Futebol"),
    BASQUETE("Basquete"),
    VOLEI_DE_QUADRA("Volei de Quadra"),
    VOLEI_DE_PRAIA("Volei de Praia"),
    BEACH_TENIS("Beach Tênis"),
    TENIS("Tênis");

    private String categoria;

    Categoria(String categoria) {
        this.categoria = categoria;
    }
}
