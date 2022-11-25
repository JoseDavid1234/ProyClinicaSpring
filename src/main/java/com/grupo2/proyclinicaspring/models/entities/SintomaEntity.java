package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SINTOMA")
public class SintomaEntity {

    @Id
    @Column(name = "COD_SINTOMA", nullable = false, length = 8)
    private String codSintoma;
    @Basic
    @Column(name = "DESC_SINTO", nullable = false, length = 500)
    private String descSinto;

    public String getCodSintoma() {
        return codSintoma;
    }

    public void setCodSintoma(String codSintoma) {
        this.codSintoma = codSintoma;
    }

    public String getDescSinto() {
        return descSinto;
    }

    public void setDescSinto(String descSinto) {
        this.descSinto = descSinto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SintomaEntity that = (SintomaEntity) o;
        return Objects.equals(codSintoma, that.codSintoma) && Objects.equals(descSinto, that.descSinto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codSintoma, descSinto);
    }
}
