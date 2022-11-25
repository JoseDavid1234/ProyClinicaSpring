package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TELEFONO")
public class TelefonoEntity {

    @Id
    @Column(name = "COD_TEL", nullable = false, length = 8)
    private String codTel;
    @Basic
    @Column(name = "NUM_TEL", nullable = false, length = 20)
    private String numTel;
    @Basic
    @Column(name = "PERSONA_COD_PER", nullable = false, length = 8)
    private String personaCodPer;

    public String getCodTel() {
        return codTel;
    }

    public void setCodTel(String codTel) {
        this.codTel = codTel;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
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
        TelefonoEntity that = (TelefonoEntity) o;
        return Objects.equals(codTel, that.codTel) && Objects.equals(numTel, that.numTel) && Objects.equals(personaCodPer, that.personaCodPer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codTel, numTel, personaCodPer);
    }
}
