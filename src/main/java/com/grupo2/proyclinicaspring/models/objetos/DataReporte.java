package com.grupo2.proyclinicaspring.models.objetos;

import java.util.List;

public class DataReporte {
    private String codPac;
    private String nomApe;
    private String nacionalidad;
    private Long citasHechas;
    private Long citasPen;
    private Long citasMod;

    private String telefonos;

    private String docsIden;

    public DataReporte() {
    }

    public DataReporte(String codPac, String nomApe, String nacionalidad, Long citasHechas, Long citasPen, Long citasMod, String telefonos, String docsIden) {
        this.codPac = codPac;
        this.nomApe = nomApe;
        this.nacionalidad = nacionalidad;
        this.citasHechas = citasHechas;
        this.citasPen = citasPen;
        this.citasMod = citasMod;
        this.telefonos = telefonos;
        this.docsIden = docsIden;
    }

    public String getCodPac() {
        return codPac;
    }

    public void setCodPac(String codPac) {
        this.codPac = codPac;
    }

    public String getNomApe() {
        return nomApe;
    }

    public void setNomApe(String nomApe) {
        this.nomApe = nomApe;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Long getCitasHechas() {
        return citasHechas;
    }

    public void setCitasHechas(Long citasHechas) {
        this.citasHechas = citasHechas;
    }

    public Long getCitasPen() {
        return citasPen;
    }

    public void setCitasPen(Long citasPen) {
        this.citasPen = citasPen;
    }

    public Long getCitasMod() {
        return citasMod;
    }

    public void setCitasMod(Long citasMod) {
        this.citasMod = citasMod;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getDocsIden() {
        return docsIden;
    }

    public void setDocsIden(String docsIden) {
        this.docsIden = docsIden;
    }
}
