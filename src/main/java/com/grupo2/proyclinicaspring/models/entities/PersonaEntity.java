package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "PERSONA")
public class PersonaEntity {

    @Id
    @Column(name = "COD_PER", nullable = false, length = 8)
    private String codPer;
    @Basic
    @Column(name = "PRIMER_NOMBRE", nullable = false, length = 20)
    private String primerNombre;
    @Basic
    @Column(name = "APE_PAT", nullable = false, length = 25)
    private String apePat;
    @Basic
    @Column(name = "APE_MAT", nullable = false, length = 25)
    private String apeMat;
    @Basic
    @Column(name = "FEC_NAC", nullable = false)
    private Date fecNac;
    @Basic
    @Column(name = "SEXO", nullable = false, length = 1)
    private String sexo;
    @Basic
    @Column(name = "SEGUNDO_NOMBRE", nullable = true, length = 20)
    private String segundoNombre;
    @Basic
    @Column(name = "NACIONALIDAD", nullable = false, length = 20)
    private String nacionalidad;

    public String getCodPer() {
        return codPer;
    }

    public void setCodPer(String codPer) {
        this.codPer = codPer;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaEntity that = (PersonaEntity) o;
        return Objects.equals(codPer, that.codPer) && Objects.equals(primerNombre, that.primerNombre) && Objects.equals(apePat, that.apePat) && Objects.equals(apeMat, that.apeMat) && Objects.equals(fecNac, that.fecNac) && Objects.equals(sexo, that.sexo) && Objects.equals(segundoNombre, that.segundoNombre) && Objects.equals(nacionalidad, that.nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPer, primerNombre, apePat, apeMat, fecNac, sexo, segundoNombre, nacionalidad);
    }
}
