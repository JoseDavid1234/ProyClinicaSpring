package com.grupo2.proyclinicaspring.controllers;

import com.grupo2.proyclinicaspring.models.entities.DiagnosticoEntity;
import com.grupo2.proyclinicaspring.models.entities.EnfermedadEntity;
import com.grupo2.proyclinicaspring.models.entities.TipoDiagEntity;
import com.grupo2.proyclinicaspring.models.objetos.DataDiagnostico;
import com.grupo2.proyclinicaspring.services.DiagnosticoService;
import com.grupo2.proyclinicaspring.services.DiagnosticoServiceImpl;
import com.grupo2.proyclinicaspring.services.EnfermedadService;
import com.grupo2.proyclinicaspring.services.TipoDiagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class DiagnosticoController {

    @Autowired
    DiagnosticoService servicioDiag;

    @Autowired
    EnfermedadService servicioEnf;

    @Autowired
    TipoDiagService servicioTipoDiag;

    @GetMapping("/verDiag")
    public String getDiagnosticos(@RequestParam String idCita, Model model){
        ArrayList<DiagnosticoEntity> listaDiagTot = (ArrayList<DiagnosticoEntity>) servicioDiag.findAll();
        System.out.println(listaDiagTot.size());
        ArrayList<DataDiagnostico> dataDiag=new ArrayList<>();
        for(DiagnosticoEntity diag: listaDiagTot){
            if(idCita.equalsIgnoreCase(diag.getCitaIdCita())){
                DataDiagnostico d = new DataDiagnostico();
                d.setCodDiag(diag.getCodDiag());
                d.setPronostico(diag.getPronostico());
                d.setTratamiento(diag.getTratamiento());
                d.setEnfermedad(servicioEnf.findById(diag.getEnfermedadCodEnfer()).getNomEnfer());
                d.setTipoDiag(servicioTipoDiag.findById(diag.getTipoDiagCodTipoDiag()).getNombreTipo());
                dataDiag.add(d);
            }
        }
        model.addAttribute("dataDiag",dataDiag);
        return "diagnosticoPdf";
    }
}
