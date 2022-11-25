package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DOCTOR")
public class DoctorEntity {

    @Id
    @Column(name = "COD_PER", nullable = false, length = 8)
    private String codPer;
    @Basic
    @Column(name = "SUELDO", nullable = false, precision = 0)
    private int sueldo;
    @Basic
    @Column(name = "AREA_CLINICA_COD_AREA", nullable = false, length = 8)
    private String areaClinicaCodArea;
    @Basic
    @Column(name = "NUM_COLEGIATURA", nullable = false, length = 20)
    private String numColegiatura;
    @Basic
    @Column(name = "PROFESION", nullable = false, length = 20)
    private String profesion;
    @Basic
    @Column(name = "CARGO", nullable = false, length = 20)
    private String cargo;
    @Basic
    @Column(name = "OBSERVACIONES", nullable = true, length = 40)
    private String observaciones;

    public String getCodPer() {
        return codPer;
    }

    public void setCodPer(String codPer) {
        this.codPer = codPer;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getAreaClinicaCodArea() {
        return areaClinicaCodArea;
    }

    public void setAreaClinicaCodArea(String areaClinicaCodArea) {
        this.areaClinicaCodArea = areaClinicaCodArea;
    }

    public String getNumColegiatura() {
        return numColegiatura;
    }

    public void setNumColegiatura(String numColegiatura) {
        this.numColegiatura = numColegiatura;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorEntity that = (DoctorEntity) o;
        return sueldo == that.sueldo && Objects.equals(codPer, that.codPer) && Objects.equals(areaClinicaCodArea, that.areaClinicaCodArea) && Objects.equals(numColegiatura, that.numColegiatura) && Objects.equals(profesion, that.profesion) && Objects.equals(cargo, that.cargo) && Objects.equals(observaciones, that.observaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPer, sueldo, areaClinicaCodArea, numColegiatura, profesion, cargo, observaciones);
    }
}
