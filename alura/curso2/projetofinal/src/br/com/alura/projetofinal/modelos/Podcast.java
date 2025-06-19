package br.com.alura.projetofinal.modelos;

public class Podcast extends Audio {
    private String criador;
    private String descricao;

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 500){
            return 10;
        } else {
            return 5;
        }
    }
}
