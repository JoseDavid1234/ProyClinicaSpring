package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ENFE_SIN")
@IdClass(EnfeSinEntityPK.class)
public class EnfeSinEntity {

    @Id
    @Column(name = "ENFERMEDAD_COD_ENFER", nullable = false, length = 8)
    private String enfermedadCodEnfer;

    @Id
    @Column(name = "SINTOMA_COD_SINTOMA", nullable = false, length = 8)
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
        EnfeSinEntity that = (EnfeSinEntity) o;
        return Objects.equals(enfermedadCodEnfer, that.enfermedadCodEnfer) && Objects.equals(sintomaCodSintoma, that.sintomaCodSintoma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enfermedadCodEnfer, sintomaCodSintoma);
    }
}
