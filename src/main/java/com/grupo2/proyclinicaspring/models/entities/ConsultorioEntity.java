package com.grupo2.proyclinicaspring.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CONSULTORIO")
public class ConsultorioEntity {

    @Id
    @Column(name = "ID_CONSULTORIO", nullable = false, length = 5)
    private String idConsultorio;
    @Basic
    @Column(name = "NUM_PISO", nullable = false, length = 2)
    private String numPiso;
    @Basic
    @Column(name = "NUMERO_CONSULTORIO", nullable = false, length = 2)
    private String numeroConsultorio;
    @Basic
    @Column(name = "NUM_PABELLON", nullable = false, length = 2)
    private String numPabellon;
    @Basic
    @Column(name = "DOCTOR_COD_PER", nullable = false, length = 8)
    private String doctorCodPer;

    public String getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(String idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public String getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(String numPiso) {
        this.numPiso = numPiso;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getNumPabellon() {
        return numPabellon;
    }

    public void setNumPabellon(String numPabellon) {
        this.numPabellon = numPabellon;
    }

    public String getDoctorCodPer() {
        return doctorCodPer;
    }

    public void setDoctorCodPer(String doctorCodPer) {
        this.doctorCodPer = doctorCodPer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultorioEntity that = (ConsultorioEntity) o;
        return Objects.equals(idConsultorio, that.idConsultorio) && Objects.equals(numPiso, that.numPiso) && Objects.equals(numeroConsultorio, that.numeroConsultorio) && Objects.equals(numPabellon, that.numPabellon) && Objects.equals(doctorCodPer, that.doctorCodPer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConsultorio, numPiso, numeroConsultorio, numPabellon, doctorCodPer);
    }
}
