package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AREA_CLINICA")
public class AreaClinicaEntity {

    @Id
    @Column(name = "COD_AREA", nullable = false, length = 8)
    private String codArea;
    @Basic
    @Column(name = "NOM_AREA", nullable = false, length = 40)
    private String nomArea;
    @Basic
    @Column(name = "TIPO_AREA", nullable = false, length = 50)
    private String tipoArea;

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public String getNomArea() {
        return nomArea;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

    public String getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AreaClinicaEntity that = (AreaClinicaEntity) o;
        return Objects.equals(codArea, that.codArea) && Objects.equals(nomArea, that.nomArea) && Objects.equals(tipoArea, that.tipoArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codArea, nomArea, tipoArea);
    }
}
