package com.vibe.api.model;

public class PacoteModel {

    private Integer idPacote;

    private String nomePacote;

    private Integer versaoInterna;

    public Integer getVersaoInterna() {
        return versaoInterna;
    }

    public void setVersaoInterna(Integer versaoInterna) {
        this.versaoInterna = versaoInterna;
    }

    public Integer getIdPacote() {
        return idPacote;
    }

    public void setIdPacote(Integer idPacote) {
        this.idPacote = idPacote;
    }

    public String getNomePacote() {
        return nomePacote;
    }

    public void setNomePacote(String nomePacote) {
        this.nomePacote = nomePacote;
    }
}
