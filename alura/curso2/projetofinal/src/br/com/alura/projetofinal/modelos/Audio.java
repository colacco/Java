package br.com.alura.projetofinal.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int classificacao;
    private int totalReproducoes;
    private int curtidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }


    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }
}
