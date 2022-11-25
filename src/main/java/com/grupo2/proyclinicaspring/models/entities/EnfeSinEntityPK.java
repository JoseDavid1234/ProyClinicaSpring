package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class EnfeSinEntityPK implements Serializable {
    @Column(name = "ENFERMEDAD_COD_ENFER", nullable = false, length = 8)
    @Id

    private String enfermedadCodEnfer;
    @Column(name = "SINTOMA_COD_SINTOMA", nullable = false, length = 8)
    @Id

    private String sintomaCodSintoma;

    public String getEnfermedadCodEnfer() {
        return enfermedadCodEnfer;
    }

    public void setEnfermedadCodEnfer(String enfermedadCodEnfer) {
        this.enfermedadCodEnfer = enfermedadCodEnfer;
    }

    public String getSintomaCodSintoma() {
        return sintomaCodSintoma;
    }

    public void setSintomaCodSintoma(String sintomaCodSintoma) {
        this.sintomaCodSintoma = sintomaCodSintoma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnfeSinEntityPK that = (EnfeSinEntityPK) o;
        return Objects.equals(enfermedadCodEnfer, that.enfermedadCodEnfer) && Objects.equals(sintomaCodSintoma, that.sintomaCodSintoma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enfermedadCodEnfer, sintomaCodSintoma);
    }
}
