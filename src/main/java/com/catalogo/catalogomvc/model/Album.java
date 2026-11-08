
package com.catalogo.catalogomvc.model;

public class Album {

    private int id;
    private String titulo;
    private int anoLancamento;
    private int cantorId;

    public Album(int id, String titulo, int anoLancamento, int cantorId) {
        this.id = id;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.cantorId = cantorId;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getCantorId() {
        return cantorId;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
