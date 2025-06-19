package br.com.alura.projetofinal.modelos;

public class Favoritos {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " está nas mais tocadas da plataforma!");
        } else {
            System.out.println(audio.getTitulo() + " é uma excelente opção.");
        }
    }
}
