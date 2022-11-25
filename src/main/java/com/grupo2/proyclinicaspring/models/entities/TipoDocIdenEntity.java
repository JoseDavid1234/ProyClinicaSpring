package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TIPO_DOCIDEN")
public class TipoDocIdenEntity {

    @Id
    @Column(name = "COD_TIPO_IDE", nullable = false, length = 8)
    private String codTipoIde;
    @Basic
    @Column(name = "NOM_DOCIDEN", nullable = false, length = 50)
    private String nomDociden;

    public String getCodTipoIde() {
        return codTipoIde;
    }

    public void setCodTipoIde(String codTipoIde) {
        this.codTipoIde = codTipoIde;
    }

    public String getNomDociden() {
        return nomDociden;
    }

    public void setNomDociden(String nomDociden) {
        this.nomDociden = nomDociden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDocIdenEntity that = (TipoDocIdenEntity) o;
        return Objects.equals(codTipoIde, that.codTipoIde) && Objects.equals(nomDociden, that.nomDociden);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codTipoIde, nomDociden);
    }
}
