package com.grupo2.proyclinicaspring.models.objetos;

public class DataDiagnostico {
    private String codDiag;
    private String tratamiento;
    private String pronostico;
    private String enfermedad;
    private String tipoDiag;

    public DataDiagnostico(String codDiag, String tratamiento, String pronostico, String enfermedad, String tipoDiag) {
        this.codDiag = codDiag;
        this.tratamiento = tratamiento;
        this.pronostico = pronostico;
        this.enfermedad = enfermedad;
        this.tipoDiag = tipoDiag;
    }

    public DataDiagnostico() {
    }

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

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getTipoDiag() {
        return tipoDiag;
    }

    public void setTipoDiag(String tipoDiag) {
        this.tipoDiag = tipoDiag;
    }
}
