package com.unl.sistema.base.models;
import java.util.Date;

public class Valoracion {
    private Integer id;
    private int puntuacion;
    private String comentario;
    private Date fecha;

    public Valoracion(Integer id, int puntuacion, String comentario, Date fecha) {
        this.id = id;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
