package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ENFERMEDAD")
public class EnfermedadEntity {

    @Id
    @Column(name = "COD_ENFER", nullable = false, length = 8)
    private String codEnfer;
    @Basic
    @Column(name = "NOM_ENFER", nullable = false, length = 40)
    private String nomEnfer;
    @Basic
    @Column(name = "DESC_ENFER", nullable = true, length = 400)
    private String descEnfer;

    public String getCodEnfer() {
        return codEnfer;
    }

    public void setCodEnfer(String codEnfer) {
        this.codEnfer = codEnfer;
    }

    public String getNomEnfer() {
        return nomEnfer;
    }

    public void setNomEnfer(String nomEnfer) {
        this.nomEnfer = nomEnfer;
    }

    public String getDescEnfer() {
        return descEnfer;
    }

    public void setDescEnfer(String descEnfer) {
        this.descEnfer = descEnfer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnfermedadEntity that = (EnfermedadEntity) o;
        return Objects.equals(codEnfer, that.codEnfer) && Objects.equals(nomEnfer, that.nomEnfer) && Objects.equals(descEnfer, that.descEnfer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEnfer, nomEnfer, descEnfer);
    }
}
