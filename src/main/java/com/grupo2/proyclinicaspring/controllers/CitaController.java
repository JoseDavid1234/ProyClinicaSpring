package com.grupo2.proyclinicaspring.controllers;

import com.grupo2.proyclinicaspring.models.entities.AreaClinicaEntity;
import com.grupo2.proyclinicaspring.models.entities.CitaEntity;
import com.grupo2.proyclinicaspring.models.entities.DoctorEntity;
import com.grupo2.proyclinicaspring.models.entities.PersonaEntity;
import com.grupo2.proyclinicaspring.models.objetos.DataCita;
import com.grupo2.proyclinicaspring.models.objetos.DoctorNombre;
import com.grupo2.proyclinicaspring.services.AreaClinicaService;
import com.grupo2.proyclinicaspring.services.CitaService;
import com.grupo2.proyclinicaspring.services.DoctorService;
import com.grupo2.proyclinicaspring.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CitaController {

    @Autowired
    CitaService servicioCita;

    @Autowired
    DoctorService servicioDoctor;

    @Autowired
    PersonaService servicioPersona;

    @Autowired
    AreaClinicaService servicioArea;

    @GetMapping(value = {"/cita/listar"})
    public String listarCitas(Model model, Authentication auth){

        List<DataCita> citasData=new ArrayList<>();
        List<CitaEntity> citas=servicioCita.findByPacienteCodPerOrderByFecCitaDesc(auth.getName());

        for(CitaEntity c:citas){

            PersonaEntity perDoc=servicioPersona.findById(c.getDoctorCodPer());
            DoctorEntity doctorEntity=servicioDoctor.findById(c.getDoctorCodPer());
            AreaClinicaEntity areaEntity=servicioArea.findById(doctorEntity.getAreaClinicaCodArea());

            DataCita dataCitaCur=new DataCita();
            dataCitaCur.setIdCita(c.getIdCita());
            dataCitaCur.setFecCita(c.getFecCita());
            dataCitaCur.setHoraCita(c.getHoraCita());
            dataCitaCur.setDoctorCodPer(c.getDoctorCodPer());
            dataCitaCur.setEstadoCita(c.getEstadoCita());
            dataCitaCur.setNomApeCompletoDoc(perDoc.getPrimerNombre()+" "+perDoc.getSegundoNombre()+" "+perDoc.getApePat()+" "+perDoc.getApeMat());
            dataCitaCur.setNomArea(areaEntity.getNomArea());
            dataCitaCur.setCodArea(doctorEntity.getAreaClinicaCodArea());

            citasData.add(dataCitaCur);
        }
        model.addAttribute("citasData",citasData);
        PersonaEntity persona=servicioPersona.findById(auth.getName());
        model.addAttribute("nombrePaciente",persona.getPrimerNombre()+" "+persona.getSegundoNombre()+" "+persona.getApePat()+" "+persona.getApeMat());
        return "listaCita";
    }

    @GetMapping(value = {"/cita/form"})
    public String getForm(Model model, @RequestParam(required = false) String codArea, @RequestParam(required = false) String codDoc, @RequestParam(required = false) String idCita){

        ArrayList<DoctorEntity> doctores= (ArrayList<DoctorEntity>) servicioDoctor.findAll();

        ArrayList<PersonaEntity> personas= (ArrayList<PersonaEntity>) servicioPersona.findAll();

        ArrayList<DoctorNombre> nombresDoctor=new ArrayList<>();

        for(DoctorEntity doc:doctores){
            for(PersonaEntity per:personas){
                if(doc.getCodPer().equalsIgnoreCase(per.getCodPer()) && doc.getAreaClinicaCodArea().equalsIgnoreCase(codArea)){
                    nombresDoctor.add(new DoctorNombre(doc.getCodPer(),per.getPrimerNombre()+" "+per.getSegundoNombre()+" "+per.getApePat()+" "+per.getApeMat()));
                }
            }
        }

        CitaEntity citaCur=new CitaEntity();
        if(idCita!=null){
            model.addAttribute("textoBoton","Editar Cita");
            model.addAttribute("textoTitulo","Modificar Cita");
            citaCur=servicioCita.findById(idCita);
        }else{
            model.addAttribute("textoBoton","Crear Cita");
            model.addAttribute("textoTitulo","Nueva Cita");
        }
        citaCur.setDoctorCodPer(codDoc);
        model.addAttribute("cita",citaCur);

        model.addAttribute("doctorCurCod",codDoc);
        model.addAttribute("areaCurCod",codArea);

        model.addAttribute("areasClinicas",servicioArea.findAll());
        model.addAttribute("doctores",nombresDoctor);

        return "formCita";
    }

    @PostMapping(value = "/cita/form")
    public String setForm(CitaEntity cita,Authentication auth){
        Long count=servicioCita.count();
        do{
            count++;
        }while(servicioCita.findById(String.format("%5d",count).replace(' ','0'))!=null);

        if(cita.getIdCita().equalsIgnoreCase("")){
            cita.setIdCita(String.format("%5d",count).replace(' ','0'));
            cita.setPacienteCodPer(auth.getName());
        }
        servicioCita.save(cita);
        return "redirect:/cita/listar";
    }

    @GetMapping(value = "/cita/delete")
    public String eliminarCita(@RequestParam(required = true) String idCita){
        servicioCita.delete(idCita);
        return "redirect:/cita/listar";
    }

}
