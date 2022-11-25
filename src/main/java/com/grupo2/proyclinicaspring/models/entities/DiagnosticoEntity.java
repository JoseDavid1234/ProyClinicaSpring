package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "DIAGNOSTICO")
public class DiagnosticoEntity {

    @Id
    @Column(name = "COD_DIAG", nullable = false, length = 8)
    private String codDiag;
    @Basic
    @Column(name = "TRATAMIENTO", nullable = false, length = 200)
    private String tratamiento;
    @Basic
    @Column(name = "PRONOSTICO", nullable = false, length = 300)
    private String pronostico;
    @Basic
    @Column(name = "FECHA_DIAG", nullable = false)
    private Date fechaDiag;
    @Basic
    @Column(name = "DETALLES_ADICIONALES", nullable = true, length = 500)
    private String detallesAdicionales;
    @Basic
    @Column(name = "MOTIVO_CONSULTA", nullable = true, length = 400)
    private String motivoConsulta;
    @Basic
    @Column(name = "ENFERMEDAD_COD_ENFER", nullable = false, length = 8)
    private String enfermedadCodEnfer;
    @Basic
    @Column(name = "TIPO_DIAG_COD_TIPO_DIAG", nullable = false, length = 8)
    private String tipoDiagCodTipoDiag;
    @Basic
    @Column(name = "CITA_ID_CITA", nullable = false, length = 5)
    private String citaIdCita;
    @Basic
    @Column(name = "CITA_COD_PER", nullable = false, length = 8)
    private String citaCodPer;

    public String getCodDiag() {
        return codDiag;
    }

    public void setCodDiag(String codDiag) {
        this.codDiag = codDiag;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public Date getFechaDiag() {
        return fechaDiag;
    }

    public void setFechaDiag(Date fechaDiag) {
        this.fechaDiag = fechaDiag;
    }

    public String getDetallesAdicionales() {
        return detallesAdicionales;
    }

    public void setDetallesAdicionales(String detallesAdicionales) {
        this.detallesAdicionales = detallesAdicionales;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getEnfermedadCodEnfer() {
        return enfermedadCodEnfer;
    }

    public void setEnfermedadCodEnfer(String enfermedadCodEnfer) {
        this.enfermedadCodEnfer = enfermedadCodEnfer;
    }

    public String getTipoDiagCodTipoDiag() {
        return tipoDiagCodTipoDiag;
    }

    public void setTipoDiagCodTipoDiag(String tipoDiagCodTipoDiag) {
        this.tipoDiagCodTipoDiag = tipoDiagCodTipoDiag;
    }

    public String getCitaIdCita() {
        return citaIdCita;
    }

    public void setCitaIdCita(String citaIdCita) {
        this.citaIdCita = citaIdCita;
    }

    public String getCitaCodPer() {
        return citaCodPer;
    }

    public void setCitaCodPer(String citaCodPer) {
        this.citaCodPer = citaCodPer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiagnosticoEntity that = (DiagnosticoEntity) o;
        return Objects.equals(codDiag, that.codDiag) && Objects.equals(tratamiento, that.tratamiento) && Objects.equals(pronostico, that.pronostico) && Objects.equals(fechaDiag, that.fechaDiag) && Objects.equals(detallesAdicionales, that.detallesAdicionales) && Objects.equals(motivoConsulta, that.motivoConsulta) && Objects.equals(enfermedadCodEnfer, that.enfermedadCodEnfer) && Objects.equals(tipoDiagCodTipoDiag, that.tipoDiagCodTipoDiag) && Objects.equals(citaIdCita, that.citaIdCita) && Objects.equals(citaCodPer, that.citaCodPer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codDiag, tratamiento, pronostico, fechaDiag, detallesAdicionales, motivoConsulta, enfermedadCodEnfer, tipoDiagCodTipoDiag, citaIdCita, citaCodPer);
    }
}
