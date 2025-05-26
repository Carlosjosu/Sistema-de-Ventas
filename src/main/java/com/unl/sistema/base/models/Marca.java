package com.unl.sistema.base.models;

public class Marca {

    private Integer id;
    private String url;
    private String descripcion;

    public Marca(Integer id, String url, String descripcion) {
        this.id = id;
        this.url = url;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
