package com.grupo2.proyclinicaspring.models.objetos;

public class DoctorNombre {
    private String nombreCompleto;
    private String codigo;

    public DoctorNombre(){}

    public DoctorNombre( String codigo,String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        this.codigo = codigo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
