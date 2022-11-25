package com.grupo2.proyclinicaspring.models.objetos;

import java.util.Date;

public class DataCita {

    private String idCita;

    private Date fecCita;

    private Date horaCita;

    private String pacienteCodPer;

    private String doctorCodPer;

    private String estadoCita;

    private String nomApeCompletoDoc;

    private String nomArea;

    private String codArea;

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public Date getFecCita() {
        return fecCita;
    }

    public void setFecCita(Date fecCita) {
        this.fecCita = fecCita;
    }

    public Date getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Date horaCita) {
        this.horaCita = horaCita;
    }

    public String getPacienteCodPer() {
        return pacienteCodPer;
    }

    public void setPacienteCodPer(String pacienteCodPer) {
        this.pacienteCodPer = pacienteCodPer;
    }

    public String getDoctorCodPer() {
        return doctorCodPer;
    }

    public void setDoctorCodPer(String doctorCodPer) {
        this.doctorCodPer = doctorCodPer;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public String getNomApeCompletoDoc() {
        return nomApeCompletoDoc;
    }

    public void setNomApeCompletoDoc(String nomApeCompletoDoc) {
        this.nomApeCompletoDoc = nomApeCompletoDoc;
    }

    public String getNomArea() {
        return nomArea;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public DataCita(String idCita, Date fecCita, Date horaCita, String pacienteCodPer, String doctorCodPer, String estadoCita, String nomApeCompletoDoc, String nomArea, String codArea) {
        this.idCita = idCita;
        this.fecCita = fecCita;
        this.horaCita = horaCita;
        this.pacienteCodPer = pacienteCodPer;
        this.doctorCodPer = doctorCodPer;
        this.estadoCita = estadoCita;
        this.nomApeCompletoDoc = nomApeCompletoDoc;
        this.nomArea = nomArea;
        this.codArea = codArea;
    }

    public DataCita() {
    }
}
