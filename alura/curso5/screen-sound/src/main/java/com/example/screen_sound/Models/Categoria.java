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

    public static Categoria fromString(String text){
        for(Categoria categoria : Categoria.values()){
            if (categoria.tipo.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Não existe essa opção: " + text);
    }


    public String getTipo(){
        return tipo;
    }

}
