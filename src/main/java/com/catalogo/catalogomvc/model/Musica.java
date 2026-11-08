package com.catalogo.catalogomvc.model;

public class Musica {

    private int id;
    private String nome;
    private String link;
    private int albumId;

    public Musica(int id, String nome, String link, int albumId) {
        this.id = id;
        this.nome = nome;
        this.link = link;
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
}