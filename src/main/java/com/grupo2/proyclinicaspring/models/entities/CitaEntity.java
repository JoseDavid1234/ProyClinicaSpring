package com.grupo2.proyclinicaspring.models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CITA")
public class CitaEntity {

    @PrePersist
    public void setEstado(){
        this.setEstadoCita("Pendiente");
    }

    @PreUpdate
    public void setEstadoMod(){
        this.setEstadoCita("Modificado");
    }

    @Id
    @Column(name = "ID_CITA", nullable = false, length = 5)
    private String idCita;

    @Column(name = "FEC_CITA", nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecCita;

    @Column(name = "HORA_CITA", nullable = false)
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    private Date horaCita;

    @Basic
    @Column(name = "PACIENTE_COD_PER", nullable = false, length = 8)
    private String pacienteCodPer;
    @Basic
    @Column(name = "DOCTOR_COD_PER", nullable = false, length = 8)
    private String doctorCodPer;
    @Basic
    @Column(name = "ESTADO_CITA", nullable = false, length = 10)
    private String estadoCita;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitaEntity that = (CitaEntity) o;
        return Objects.equals(idCita, that.idCita) && Objects.equals(fecCita, that.fecCita) && Objects.equals(horaCita, that.horaCita) && Objects.equals(pacienteCodPer, that.pacienteCodPer) && Objects.equals(doctorCodPer, that.doctorCodPer) && Objects.equals(estadoCita, that.estadoCita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCita, fecCita, horaCita, pacienteCodPer, doctorCodPer, estadoCita);
    }

    public CitaEntity(String idCita, Date fecCita, Date horaCita, String pacienteCodPer, String doctorCodPer, String estadoCita) {
        this.idCita = idCita;
        this.fecCita = fecCita;
        this.horaCita = horaCita;
        this.pacienteCodPer = pacienteCodPer;
        this.doctorCodPer = doctorCodPer;
        this.estadoCita = estadoCita;
    }

    public CitaEntity() {
    }
}
