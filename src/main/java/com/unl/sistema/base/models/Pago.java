package com.unl.sistema.base.models;

import java.util.Date;

public class Pago {

    private Integer id;
    private Date fecha;
    private Float monto;
    private String referencia;
    private Integer idAuto;

    public Pago(Integer id, Date fecha, Float monto, String referencia, Integer idAuto) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.referencia = referencia;
        this.idAuto = idAuto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(Integer idAuto) {
        this.idAuto = idAuto;
    }
}
