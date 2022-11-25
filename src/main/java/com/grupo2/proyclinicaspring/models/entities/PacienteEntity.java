package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PACIENTE")
public class PacienteEntity {

    @Id
    @Column(name = "COD_PER", nullable = false, length = 8)
    private String codPer;
    @Basic
    @Column(name = "ESTADO_CIVIL", nullable = false, length = 30)
    private String estadoCivil;
    @Basic
    @Column(name = "LUGAR_NAC", nullable = true, length = 50)
    private String lugarNac;
    @Basic
    @Column(name = "NIVEL_EDUCATIVO", nullable = true, length = 30)
    private String nivelEducativo;

    @Basic
    @Column(name = "CONTRASENIA", nullable = false, length = 20)
    private String contrasenia;

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCodPer() {
        return codPer;
    }

    public void setCodPer(String codPer) {
        this.codPer = codPer;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getLugarNac() {
        return lugarNac;
    }

    public void setLugarNac(String lugarNac) {
        this.lugarNac = lugarNac;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacienteEntity that = (PacienteEntity) o;
        return Objects.equals(codPer, that.codPer) && Objects.equals(estadoCivil, that.estadoCivil) && Objects.equals(lugarNac, that.lugarNac) && Objects.equals(nivelEducativo, that.nivelEducativo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPer, estadoCivil, lugarNac, nivelEducativo);
    }
}
