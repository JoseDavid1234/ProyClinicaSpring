package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class EmpTipdocEntityPK implements Serializable {
    @Column(name = "TIPO_DOCIDEN_COD_TIPO_IDE", nullable = false, length = 8)
    @Id
    private String tipoDocidenCodTipoIde;
    @Column(name = "PERSONA_COD_PER", nullable = false, length = 8)
    @Id
    private String personaCodPer;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpTipdocEntityPK that = (EmpTipdocEntityPK) o;
        return Objects.equals(tipoDocidenCodTipoIde, that.tipoDocidenCodTipoIde) && Objects.equals(personaCodPer, that.personaCodPer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDocidenCodTipoIde, personaCodPer);
    }
}
