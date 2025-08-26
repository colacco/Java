package com.example.screen_sound.Models;


public enum Categoria {
    SOLO("Solo"),
    DUPLA("Dupla"),
    GRUPO("Grupo"),
    BANDA("Banda");

    private final String tipo;

    Categoria(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

}
