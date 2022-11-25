package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "EMP_TIPDOC")
@IdClass(EmpTipdocEntityPK.class)
public class EmpTipDocEntity {

    @Id
    @Column(name = "TIPO_DOCIDEN_COD_TIPO_IDE", nullable = false, length = 8)
    private String tipoDocidenCodTipoIde;

    @Id
    @Column(name = "PERSONA_COD_PER", nullable = false, length = 8)
    private String personaCodPer;
    @Basic
    @Column(name = "NUM_DOCIDE", nullable = false, length = 10)
    private String numDocide;

    public String getTipoDocidenCodTipoIde() {
        return tipoDocidenCodTipoIde;
    }

    public void setTipoDocidenCodTipoIde(String tipoDocidenCodTipoIde) {
        this.tipoDocidenCodTipoIde = tipoDocidenCodTipoIde;
    }

    public String getPersonaCodPer() {
        return personaCodPer;
    }

    public void setPersonaCodPer(String personaCodPer) {
        this.personaCodPer = personaCodPer;
    }

    public String getNumDocide() {
        return numDocide;
    }

    public void setNumDocide(String numDocide) {
        this.numDocide = numDocide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpTipDocEntity that = (EmpTipDocEntity) o;
        return Objects.equals(tipoDocidenCodTipoIde, that.tipoDocidenCodTipoIde) && Objects.equals(personaCodPer, that.personaCodPer) && Objects.equals(numDocide, that.numDocide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDocidenCodTipoIde, personaCodPer, numDocide);
    }
}
