package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TIPO_DIAG")
public class TipoDiagEntity {

    @Id
    @Column(name = "COD_TIPO_DIAG", nullable = false, length = 8)
    private String codTipoDiag;
    @Basic
    @Column(name = "NOMBRE_TIPO", nullable = false, length = 40)
    private String nombreTipo;

    public String getCodTipoDiag() {
        return codTipoDiag;
    }

    public void setCodTipoDiag(String codTipoDiag) {
        this.codTipoDiag = codTipoDiag;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDiagEntity that = (TipoDiagEntity) o;
        return Objects.equals(codTipoDiag, that.codTipoDiag) && Objects.equals(nombreTipo, that.nombreTipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codTipoDiag, nombreTipo);
    }
}
