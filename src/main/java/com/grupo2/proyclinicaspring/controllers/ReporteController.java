package com.grupo2.proyclinicaspring.controllers;

import com.grupo2.proyclinicaspring.models.entities.CitaEntity;
import com.grupo2.proyclinicaspring.models.entities.PacienteEntity;
import com.grupo2.proyclinicaspring.models.entities.PersonaEntity;
import com.grupo2.proyclinicaspring.models.objetos.DataReporte;
import com.grupo2.proyclinicaspring.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ReporteController {

    @Autowired
    PacienteService servicioPaciente;

    @Autowired
    PersonaService servicioPersona;

    @Autowired
    CitaService servicioCita;

    @Autowired
    TelefonoService servicioTel;

    @Autowired
    EmpTipDocService servicioDocsIden;

    @Autowired
    TipoDocIdenService servicioTipoDoc;

    @GetMapping("/reporte")
    public String getReporte(Model model){

        List<PersonaEntity> personasPac = servicioPersona.findAll().stream().filter(e->filtrarPacientes(e)).collect(Collectors.toList());

        List<DataReporte> reportePac =new ArrayList<>();

        for (PersonaEntity pac:
             personasPac) {
            Long cH=0L,cP=0L,cM=0L;
            for(CitaEntity cita:servicioCita.findAllByPacienteCodPer(pac.getCodPer())){
                if(cita.getEstadoCita().equalsIgnoreCase("Hecho")){
                    cH++;
                }else if(cita.getEstadoCita().equalsIgnoreCase("Pendiente")){
                    cP++;
                }else{
                    cM++;
                }
            }
            reportePac.add(new DataReporte(pac.getCodPer(),pac.getPrimerNombre()+" "+pac.getApePat(),
                    pac.getNacionalidad(),cH,cP,cM,servicioTel.findAll().stream().filter(o -> o.getPersonaCodPer().equalsIgnoreCase(pac.getCodPer())).map(o -> o.getNumTel()).collect(Collectors.joining("\n")),
                    servicioDocsIden.findAll().stream().filter(o -> o.getPersonaCodPer().equalsIgnoreCase(pac.getCodPer()))
                            .map(o -> servicioTipoDoc.findById(o.getTipoDocidenCodTipoIde()).getNomDociden()+": "+o.getNumDocide()).collect(Collectors.joining("\n"))));
        }

        model.addAttribute("reportePac",reportePac);
        return "reportePdf";
    }

    public boolean filtrarPacientes(PersonaEntity persona){
        for(PacienteEntity paciente: servicioPaciente.findAll()){
            if(persona.getCodPer().equalsIgnoreCase(paciente.getCodPer())){
                return true;
            }
        }
        return false;
    }

}
